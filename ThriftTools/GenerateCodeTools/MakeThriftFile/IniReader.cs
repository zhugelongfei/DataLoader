using System;
using System.Collections.Generic;

public class IniReader
{
    private Dictionary<string, Dictionary<string, string>> m_dicIniData = new Dictionary<string, Dictionary<string, string>>();

    public double GetDouble(string strSection, string strKey, double dDefault)
    {
        string str = this.GetValue(strSection, strKey);
        if (string.IsNullOrEmpty(str))
        {
            return dDefault;
        }
        double result = 0.0;
        if (!double.TryParse(str, out result))
        {
            return dDefault;
        }
        return result;
    }

    public float GetFloat(string strSection, string strKey, float fDefaule)
    {
        string str = this.GetValue(strSection, strKey);
        if (string.IsNullOrEmpty(str))
        {
            return fDefaule;
        }
        float result = 0f;
        if (!float.TryParse(str, out result))
        {
            return fDefaule;
        }
        return result;
    }

    public int GetInt(string strSection, string strKey, int nDefaule)
    {
        string str = this.GetValue(strSection, strKey);
        if (string.IsNullOrEmpty(str))
        {
            return nDefaule;
        }
        int result = 0;
        if (!int.TryParse(str, out result))
        {
            return nDefaule;
        }
        return result;
    }

    public string GetString(string strSection, string strKey, string strDefault)
    {
        string str = this.GetValue(strSection, strKey);
        if (string.IsNullOrEmpty(str))
        {
            return strDefault;
        }
        return str;
    }

    private string GetValue(string strSection, string strKey)
    {
        if (string.IsNullOrEmpty(strSection) || string.IsNullOrEmpty(strKey))
        {
            return "";
        }
        Dictionary<string, string> dictionary = null;
        if (!this.m_dicIniData.TryGetValue(strSection.ToLower(), out dictionary))
        {
            return "";
        }
        string str = "";
        if (!dictionary.TryGetValue(strKey.ToLower(), out str))
        {
            return "";
        }
        return str;
    }

    public void Parse(string strInfo)
    {
        if (!string.IsNullOrEmpty(strInfo))
        {
            this.m_dicIniData.Clear();
            char[] separator = new char[] { '\n' };
            string[] strArray = strInfo.Split(separator, StringSplitOptions.RemoveEmptyEntries);
            string key = "";
            for (int i = 0; i < strArray.Length; i++)
            {
                if (!string.IsNullOrEmpty(strArray[i]))
                {
                    strArray[i].Trim();
                    int length = strArray[i].Length;
                    if ((length > 0) && (';' != strArray[i][0]))
                    {
                        if ('\r' == strArray[i][length - 1])
                        {
                            strArray[i] = strArray[i].Substring(0, length - 1);
                        }
                        length = strArray[i].Length;
                        if (length > 0)
                        {
                            if (('[' == strArray[i][0]) && (']' == strArray[i][length - 1]))
                            {
                                string str4 = strArray[i].Remove(0, 1);
                                str4 = str4.Remove(str4.Length - 1, 1);
                                if ("" != str4)
                                {
                                    str4 = str4.ToLower();
                                    if (!this.m_dicIniData.ContainsKey(str4))
                                    {
                                        this.m_dicIniData.Add(str4, new Dictionary<string, string>());
                                    }
                                    key = str4;
                                }
                            }
                            else
                            {
                                int index = strArray[i].IndexOf('=');
                                if (-1 != index)
                                {
                                    length = strArray[i].Length;
                                    string str2 = strArray[i].Substring(0, index);
                                    string str3 = strArray[i].Substring(index + 1, (strArray[i].Length - index) - 1);
                                    if ("" != str2)
                                    {
                                        str2 = str2.ToLower();
                                        Dictionary<string, string> dictionary = null;
                                        if ((this.m_dicIniData.TryGetValue(key, out dictionary) && (dictionary != null)) && !dictionary.ContainsKey(str2))
                                        {
                                            dictionary.Add(str2, str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

