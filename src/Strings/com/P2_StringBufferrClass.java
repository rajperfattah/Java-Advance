package Strings.com;

public class P2_StringBufferrClass {
    public static void main(String[] args) {
        //StringBuffer class :
        // it creates mutable objects

        // example using in calculator we should use calculator
        // if original data shoud change frequently we should use stringBuffer



        // capacity()-------------- by default 16+ stringLength
        StringBuffer sb=new StringBuffer("Abdul");
        System.out.println(sb.capacity());

        // append
        sb.append(" Fattah");// adds in last to original string
        System.out.println(sb);

        // length
        System.out.println(sb.length());

        //charAt
        System.out.println(sb.charAt(5));


        //delete(startIndec,endIndex);
        System.out.println(sb.delete(2,6));

        // deleteCharAt()
        System.out.println(sb.deleteCharAt(3));



        // equals

        StringBuffer n1=new StringBuffer("5");
        StringBuffer n2=n1.append("20");

        System.out.println(n1.equals(n2));


        // index of
        System.out.println(sb.indexOf("F"));

        //lastIndexOf()
        System.out.println(sb.lastIndexOf("a"));

        //insert(indexPosition,string/int/byte)
        System.out.println(sb.insert(3,"Rajper"));

        //replace(startIndex,endingIndex,string)
        System.out.println(sb.replace(2,4,"Jani"));

        //reverse
        System.out.println(sb.reverse());

        //toString()
        // ye string buffer ko string m convert kr deta h

        //setCharAt()
        sb.setCharAt(3,'D');
        System.out.println(sb);

        // setLength
        sb.setLength(6);
        System.out.println(sb);

        //trimToSize()
        sb.ensureCapacity(100);
        sb.trimToSize();
        System.out.println(sb);


    }


}

