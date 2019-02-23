import java.io.*;

import java.util.*;

class Pangram

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

String a=s.nextLine();

if((a.contains("a")||a.contains("A")) && (a.contains("b")||a.contains("B")) &&(a.contains("c")||a.contains("C")) &&
(a.contains("d")||a.contains("D")) &&(a.contains("e")||a.contains("E")) &&(a.contains("f")||a.contains("F")) &&
(a.contains("g")||a.contains("G")) &&(a.contains("h")||a.contains("H")) &&(a.contains("i")||a.contains("I")) &&
(a.contains("j")||a.contains("J")) &&(a.contains("k")||a.contains("K")) &&(a.contains("l")||a.contains("L")) &&
(a.contains("m")||a.contains("M")) &&(a.contains("n")||a.contains("N")) &&(a.contains("o")||a.contains("O")) &&
(a.contains("p")||a.contains("P")) &&(a.contains("q")||a.contains("Q")) &&(a.contains("r")||a.contains("R")) &&
(a.contains("s")||a.contains("S")) &&(a.contains("t")||a.contains("T")) &&(a.contains("u")||a.contains("U")) &&
(a.contains("v")||a.contains("V")) &&(a.contains("w")||a.contains("W")) &&(a.contains("x")||a.contains("X")) &&
(a.contains("Y")||a.contains("y")) &&(a.contains("z")||a.contains("Z")))
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
