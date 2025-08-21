package com.zoho.zohograduatestudies.assignment3.question6;

public class StringMethods
{

       private final char[] car;

        public StringMethods(String string)
        {
            this.car = string.toCharArray();
        }

        int length()
        {
            int count=0;
            for(int i=0;i<car.length;i++)
            {
                    count++;
            }
            return count;
        }

        char charAt(int index)
        {
            return car[index];
        }

        boolean isequals(String str)
        {
           // char[] newArr = str.toCharArray();

            if(car.length != str.length())
            {
                return false;
            }

            for (int i = 0; i < car.length; i++)
            {
                if(car[i] != str.charAt(i))
                {
                    return false;
                }
            }
            return true;
        }

        String substr(int start, int end)
        {
            String substr = " ";

            for (int i = start; i < end; i++)
            {
                substr = substr + car[i];
            }
            return substr;
        }

        String concat (String str)
        {
            String previous = " ";
            for (int i = 0; i < car.length; i++)
            {
                previous = previous + car[i];
            }

            return previous + str;
        }

        String toUpper()
        {
            String upper = "";
            for (int i = 0; i < car.length; i++)
            {
                if(car[i] >= 'a' && car[i] <= 'z')
                {
                    upper = upper + (char)(car[i] - 32);
                }
                else
                {
                    upper = upper + car[i];
                }
            }
            return upper;
        }

        String toLower()
        {
            String lower = "";
            for(int i = 0; i < car.length; i++)
            {
                if(car[i] >= 'A' && car[i] <= 'Z')
                {
                    lower = lower + (char)(car[i] + 32);
                }
                else
                {
                    lower = lower + car[i];
                }
            }
            return lower;
        }

        boolean contain(String str)
        {
            char[] ch = str.toCharArray();
            if(ch.length >  car.length)
            {
                return false;
            }
            int i= 0;
            int j = 0;

            while(i < car.length)
            {
                if (car[i] == ch[j])
                {
                    i++;
                    j++;
                    if (j == ch.length)
                    {
                        return true;
                    }
                }
                else
                {
                    i = i - j + 1;
                    j = 0;
                }
            }
            return false;
        }

        int indexOf(char ch)
        {
            for (int i = 0; i < car.length; i++)
            {
                if(car[i] == ch)
                {
                    return i;
                }
            }
            return -1;
        }

        String replace(char old, char newChar)
        {
            for (int i = 0; i < car.length; i++)
            {
                if(car[i] == old)
                {
                    car[i] = newChar;
                }
            }

            String alter = " ";
            for (char c : car)
            {
                alter = alter  + c;
            }
            return alter;
        }
    }

