package javadepak.com;

public class P1_DataTypes {
    public static void main(String[] args) {
// Data types: data types is the mechanisim in which we specify the type of data for compiler so that ther should not any collision and wrong use of data
        // there are two main categories of data types
        //1-premitive data type: these data types having fixed memory allocation or size, thes are of 8 types
        //i-boolean:this is the type of data ,which tells the compiler that according to condition decision should true or false , its size is 1 byte but during jvm it varies , default value is false
        //ii-Byte: this is the numeric data type it is the smallest size data type containng 1 byte size
        // short: this is the higher than byte contains 2 bytes of data default value is 0
        // int : this is the data type used for numerical data its size contains 4 bytes , defalult value is 0
        // long: this is the longes data type for strong numeric values its size consists on 8 bytes , defalut 0l
        // char:this data type used only for characters its size is 2 bytes , default value(u0000)
        // float: this is decimal numerical data type contains 4 bytes  , default value is 0.0f
        // double: this is higher decimal value strong data  type contains 8 bytes default value is 0.0d

        // non premtive data types: thes are the data types used in java which does not have any fixed size
        // Array, class, string , structure etc


        boolean b=5>10;
        System.out.println("boolean "+b);

        int a=20;
        System.out.println("int "+ a/2);

        byte c=3;
        System.out.println("byte "+ c*2);

        short d=1;
        System.out.println("short "+d);

        long e=2424222344223334l;
        System.out.println("long "+e);

        char f='F';
        System.out.println("char "+f);

        float g=0.444f;
        System.out.println("float "+g);

        double h= 444.544345d;
        System.out.println("double "+h);


    }
}
