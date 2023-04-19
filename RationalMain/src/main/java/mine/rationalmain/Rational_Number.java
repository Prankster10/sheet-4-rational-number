package mine.rationalmain;
import java.util.Scanner;
public class Rational_Number {
    private Rational_Number r1;
    private Rational_Number r2;
    private int numerator;
    private int denumerator;
    Scanner in=new Scanner(System.in);
    public Rational_Number(){
    numerator = denumerator = 1;}
    public Rational_Number(int numerator , int denumerator) {
        if(denumerator ==0){
        System.out.println("dumenator mustn`t be equal zero");
        }else{
        this.numerator = numerator;
        this.denumerator = denumerator;
        }}
    public int getNumerator() {
        return numerator;}
    public void setNumerator(int numerator) {
        this.numerator = numerator;}
    public int getDenumerator() {
        return denumerator;}
    public void setDenumerator(int denumerator) {
        this.denumerator = denumerator;}
    public Rational_Number addRational(){
    int newnum = (r1.numerator * r2.denumerator) + (r2.numerator * r1.denumerator);
    int newden = (r1.denumerator * r2.denumerator);
    Rational_Number R=new Rational_Number(newnum,newden);
     return R;}
    public Rational_Number multRational(){
        int newnum=r1.numerator*r2.numerator;
        int newden=r1.denumerator*r2.denumerator;
        Rational_Number R=new Rational_Number(newnum,newden);
    return R;}
    @Override
    public String toString(){
        return numerator+" / "+denumerator;}
public void Display(){
    System.out.println("The multiplication is: "+multRational());
    System.out.println("The addition is: "+addRational());}
public void input(){
    System.out.println("Enter 1st numerator: ");
    int numerator1=in.nextInt();
    System.out.println("Enter 1st denumerator: ");
    int denumerator1=in.nextInt();
this.r1=new Rational_Number(numerator1,denumerator1);
System.out.println("Enter 2nd numerator: ");
    int numerator2=in.nextInt();
    System.out.println("Enter 1st denumerator: ");
    int denumerator2=in.nextInt();
this.r2=new Rational_Number(numerator2,denumerator2);}
}

