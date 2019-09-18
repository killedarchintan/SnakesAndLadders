import java.util.ArrayList;

/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */

public class PracticeTests {

  
  public void rev1(String s) {
    
    char[] c = new char[10];

    for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {

      // System.out.print(s.charAt(i));
      c[j] = s.charAt(i);

      System.out.println(c[i]);
    }

    String s1 = new String(c);

    System.out.println(s1);

  }
  
  
  public void rev2(String s) {

    ArrayList<String> ar = new ArrayList<String>();

    for (int i = 0; i <= s.length() - 1; i++) {

      ar.add(s.substring(s.length() - 1 - i, s.length() - i));

    }

    System.out.println(ar);

  }

  public void amstrongnumber(int n) {
    int r;
    int sum = 0;
    int num = n;
    int count = 0;

    while (n != 0) {
      r = n % 10;
      n = n / 10;
      count++;
      //System.out.println(sum);
    }


    if (sum == num) {
      System.out.println(num + " is an Amstrong number");
    }
    else {
      System.out.println(num + " is not an Amstrong number");

    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // PracticeTests ia= new PracticeTests ();
    System.out.println("chin" + 1 + 2);
    //ia.rev2("naman23");
    // ia.amstrongnumber(1634);
       
  }

}
