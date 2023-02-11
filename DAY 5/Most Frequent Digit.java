import java.util.*;

    public class program
    {
    public int test(String number)
    {
    int freq0,freq1,freq2,freq3,freq4,freq5,freq6,freq7,freq8,freq9;
    freq0=0;
    freq1=0;
    freq2=0;
    freq3=0;
    freq4=0;
    freq5=0;
    freq6=0;
    freq7=0;
    freq8=0;
    freq9=0;
    for (int i =0; i<number.length();i++)
    {
        switch (number.charAt(i))
        {
            case 48: freq0++;
            break;
            case 49: freq1++;
            break;
            case 50: freq2++;
            break;
            case 51: freq3++;
            break;
            case 52: freq4++;
            break;
            case 53: freq5++;
            break;
            case 54: freq6++;
            break;
            case 55: freq7++;
            break;
            case 56: freq8++;
            break;
            case 57: freq9++;
            break;
        }
    }
    List<Integer> hope = new ArrayList<Integer>();

    hope.add(freq0);
    hope.add(freq1);
    hope.add(freq2);
    hope.add(freq3);
    hope.add(freq4);
    hope.add(freq5);
    hope.add(freq6);
    hope.add(freq7);
    hope.add(freq8);
    hope.add(freq9);

    int temp=0;
    for (int j=0; j<(hope.size());j++)
    {
        if (temp<hope.get(j))
        {
            temp=hope.get(j);
        }
    }

    return temp;
    }
    }
