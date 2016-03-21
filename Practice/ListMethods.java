// import java.util.*;
// 
// public class ListMethods
// {
//     public static ArrayList<Integer> makeList(int n)
//     {
//         ArrayList<Integer> tempList = new ArrayList<Integer>();
//         if (n <= 0) // The smallest list we can make
//         {
//             return new ArrayList<Integer>();
//         }
//         else // All other size lists are created here
//         { 
//             tempList.add(n);
//             tempList.addAll(makeList(n-1));
//         }
//         Collections.sort(tempList);
//         return tempList;
//     }
// 
//     public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
//     {
//         ArrayList<Integer> list = new ArrayList<Integer>(); 
//         for (Integer i : tList)
//         {
//             list.add(new Integer(i));
//         }
//         return list;
//     }
// 
//     public static ArrayList<Integer> reverseList(int n)
//     {
//         ArrayList<Integer> reverseList = new ArrayList<Integer>();
//         ArrayList<Integer> tempList2 = deepClone(reverseList);
//         for (int i = n - 1; i >= 0; i--)
//         {
//             reverseList.add(n);
//             reverseList.addAll(makeList(i));
//         }
//         return reverseList;
// 
//         // ArrayList<Integer> tempList2 = new ArrayList<Integer>();
//         // if (n <= 0) // The smallest list we can make
//         // {
//         // return new ArrayList<Integer>();
//         // }
//         // else // All other size lists are created here
//         // { 
//         // tempList2.add(n);
//         // tempList2.addAll(makeList(n-1));
//         // }
//         // return tempList2;
//     }
// }

import java.util.*;
public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        if (n <= 0) // The smallest list we can make
        {
            tempList = new ArrayList<Integer>();
        }
        else // All other size lists are created here
        { 
            tempList = makeList(n-1);
            tempList.add(n);
            return tempList;
        }
        return tempList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 1) || (list.size() == 0))
        {
            return list;
        }
        else
        {
            Integer tempInt = list.remove(0);
            list = ListMethods.reverseList(list);
            list.add(tempInt);
        }
        return list;
    }
    
    public static ArrayList<Integer> even (ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 0) || (list.size() == 1))
        {
            return list;
        }
        else
        {
            Integer tempInt = list.remove(0);
            list.remove(0);
            list = ListMethods.even(list);
            list.add(0,tempInt);
        }
        return list;
    }
    
    public static ArrayList<Integer> odd (ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 0) || (list.size() == 1))
        {
            return list;
        }
        else
        {
            list.remove(0);
        }
        return list;
    }
    
    public static ArrayList<Integer> merge (ArrayList<Integer> tList1, ArrayList<Integer> tList2)
    {
        ArrayList<Integer> list1 = ListMethods.deepClone(tList1);
        ArrayList<Integer> list1 = ListMethods.deepClone(tList2);
        ArrayList<Integer> tempList;
    }
}

