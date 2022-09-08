public class Arithmetic
{
    public static void main(String [] args)
    {
        int operand1=25;
        int operand2=6;
        int sum=0;
        int difference=0;
        int product=0;
        int quotient=0;
        int remainder=0;
        sum=operand1+operand2;
        difference=operand1-operand2;
        product=operand1*operand2;
        quotient=operand1/operand2;
        remainder=operand1%operand2;

        System.out.println("\t\tArithmetic");
        System.out.println("=============================");
        System.out.println(operand1 + " + " + operand2 + " = " + sum);
        System.out.println(operand1 + " - " + operand2 + " = " + difference);
        System.out.println(operand1 + " x " + operand2 + " = " + product);
        System.out.println(operand1 + " / " + operand2 + " = " + quotient);
        System.out.println(operand1 + " % " + operand2 + " = " + remainder);
      

    }
}