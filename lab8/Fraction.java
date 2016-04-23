/** William McGrew
 * Lab 8 - Objects
 * 3/16/16**/
 
 public class Fraction{
     
    private int numerator;
    private int denominator;
     
    public Fraction(){}//constructor <-- automatically sets to zero (default)
     
    public Fraction(int num, int den){
         numerator = num;
         denominator = den;
     }//end fraction method
     
    public Fraction add(Fraction frac){
         int num, den;
         num = frac.denominator * this.numerator + this.denominator * frac.numerator;
         
         den = this.denominator * frac.denominator;
         
         Fraction sum = new Fraction(num,den);
         return sum;
     }// end add method
     
    public Fraction subtract(Fraction frac){
         int num, den;
         num = frac.denominator * this.numerator - this.denominator * frac.numerator;
         
         den = this.denominator * frac.denominator;
         
         Fraction difference = new Fraction(num,den);
         return difference;}// end subtract method
         
    public Fraction multiply(Fraction frac){
        int num, den;
        num = this.numerator * frac.numerator;
        den = this.denominator * frac.denominator;
        
        Fraction product = new Fraction(num,den);
        return product;
    }// end multiply method
    
    public Fraction divide(Fraction frac){
        Fraction divisor = new Fraction(frac.denominator, frac.numerator);
        
        Fraction quotient = this.multiply(divisor);
        return quotient;
    }// end method divide
    
    public String toString(){
        
        String fracStr; 
        fracStr = this.numerator + "/" + this.denominator;
        return fracStr;
    }
    
    public void setNumerator(int num) {
        this.numerator = num;
    }
    
    public void setDenominator(int den){
        this.denominator = den;
    }
 }// end clss fraction