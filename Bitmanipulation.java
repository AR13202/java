//operand: number
//operator: symbols +,-,*,/
/*
 * binary operator: +,-,*,/,% => works on two operands
 * unary: ++, -- => works on one operand
 * ++a => change then use
 * a++ => use then change
 * relational Operator: ==, !=, >, <, >=, <=
 * Logical Operator: &&, ||, !
 * convert 4 to Binary:
 *      2 | 4 | 0 <= remainder
 *      2 | 2 | 0
 *        | 1 | 1
 *         reverse remainder: 0100
 * convert binary to decimal
 * 0100 => 0*2^3 + 1*2^2 + 0*2^1 + 0*2^0
 * octal - 8
 * hexadecimal - 16
 * ---------------------------------------------
 * Bitwise Operator: &(AND), |(OR), ^(XOR), 
 *          ~(one's complement), <<(left Shift), 
 *          >>(Right Shift)
 * A = 0101, B=0110
 * A & B == > 0101
 *          & 0110
 *            ----
 *            0100
 *            ----
 * A | B == > 0101
 *          | 0110
 *            ----
 *            0111
 *            ----
 * A ^ B == > 0101
 *          ^ 0110
 *            ----
 *            0011 => same value return zero
 *            ----
 * A ~ B == > 1=>0 , 0=>1
 * left Shift: A = 0101 
 *  A << 1 ==>left shift one position
 *   0101       =>      1010
 * Right Shift: A = 0101
 * A >> 1 ==> right shift one positoon
 *    0101  ==>    0010
 * ------------------------------------------
 * Get Bit: know a bit
 * Set Bit: set a bit
 * Clear Bit: clear the bit
 * update Bit: change bit form 0->1 and 1->0
 * (Get)
 * Ques: 3rd bit (pos.=2) of a number n(n=0101)?
 * Ans:  
 * (i)Bitmask: 1<<i (i is position)
 * (ii)Operation: AND
 * --------------
 * (i) 1 << 2 => 0100
 * (ii) 0100 AND 0101 => 0100 ===> 3rd bit 1 
 * 
 * Ques: 4rd bit (pos.=3) of a number n(n=0101)?
 * Ans:  
 * (i) 1 << 3 => 1000
 * (ii) 1000 AND 0101 => 0000 ===> 4rd bit 0 
 * ----------------
 * (Set)
 * Ques: Set the 2nd bit(position=1) of a number n(n=0101)?
 * Ans: 
 * (i) bitmask: 1<<i (i is positon).
 * (ii) operation: OR
 * --------------
 * (i) 1<<i => 1<<1 => 0010
 * (ii) 0010 OR 0101 => 0111 ===> n = 0111 (set bit 2 to 1)
 * --------------
 * (clear)
 * Clear the 3rd bit (pos 2) of a number n(0101)?
 * (i) Bitmask: 1<<i
 * (ii) Operation: AND with NOT
 * -----------
 * (i) 1<<2 => 0100
 * (ii) NOT(0100) AND 0101 => 1011 AND 0101 => 0001 => 1(Decimal)
 * ------------
 * 
 * (Update Bit)
 * Ques: Update the 2nd bit (pos 1) of a number n to 1(n=0101)?
 * Ans: For 1 to 0 => (i) Bitmask: 1 << i , (ii) Operation: AND with NOT => Clear operation
 *      For 0 to 1 => (i) Bitmask: 1 << i, (ii) Operation: OR  => Set Operation
 * --------------------
 * 
 * ------------------------------------------
 * Assignment operator: =, +=, -=, *=, /=
 */
public class Bitmanipulation {
    public static void main(String args[]){
        int n=5;
        //int pos =1;
        int pos = 2;
        int bitmask = 1<<pos;
        //get
        if((bitmask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        //set
        int newnumber = bitmask | n;
        System.out.println(newnumber);
        //clear
        int notbitmask = ~(bitmask);
        int newnum = notbitmask & n;
        System.out.println(newnum);
        //Update
        int a = 5;
        int p=1;
        int op = 1; //means: update bit to 1 else update to 0
        int bit = 1<<p;
        if(op == 1){
            int q = bit | a;
            System.out.println(q);
        }else{
            int nbit =  ~(bit);
            int nn = nbit & n;
            System.out.println(nn);
        }
    }
}
