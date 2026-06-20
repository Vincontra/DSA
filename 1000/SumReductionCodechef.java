import java.util.*;
public class SumReductionCodechef {
}
class Codechefs
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner v= new Scanner(System.in);
        int t=v.nextInt();
        while(t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            int sum=0;
            int or=0;
            for(int i=0;i<n;i++){
                arr[i]=v.nextInt();
                or|=arr[i];
                sum+=arr[i];
            }
            if(sum==or){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }

    }
}


// Arithmetic addition (+) adds binary digits normally.
// Whenever both numbers have a 1 at the same bit position,
// a carry is generated and propagated to the next bit.
//
// Example:
// 1 + 1 = 10 (binary)

// Bitwise OR (|) behaves differently.
// A bit becomes 1 if either number has a 1 at that position,
// and no carry is ever produced.

// Important property:
// If two numbers do not share any common set bit,
// i.e. (Ai & Aj) == 0,
// then addition and bitwise OR produce exactly the same result.
//
// Ai + Aj = Ai | Aj
// whenever (Ai & Aj) = 0



// --------------------------------------------
// Why the total value of the array never changes
// --------------------------------------------

// Allowed operation:
// Choose two elements such that
// (Ai & Aj) == 0
//
// Remove them and insert their sum:
// Ai + Aj
//
// Since the numbers have no overlapping set bits,
// their sum is identical to their OR.
//
// Therefore every merge operation preserves:
//
// 1. Total arithmetic sum
//    A1 + A2 + ... + AN
//
// 2. Overall bitwise OR
//    A1 | A2 | ... | AN
//
// These two quantities remain unchanged
// throughout the entire process.



// --------------------------------------------
// Condition for reducing the array to one element
// --------------------------------------------

// Suppose we successfully merge all elements
// into one final number.
//
// That final number must simultaneously represent:
//
// - The total arithmetic sum of the original array.
// - The total bitwise OR of the original array.
//
// Hence, for a complete reduction to be possible:
//
// Total Sum = Total Or



// --------------------------------------------
// Case 1 : Total Sum == Total OR
// --------------------------------------------

// Equality means no bit position contains a '1'
// in more than one number.
//
// Therefore no carries are needed anywhere,
// and every addition behaves exactly like OR.
//
// Because there are no bit conflicts,
// we can repeatedly find valid pairs and
// eventually merge everything into one number.



// --------------------------------------------
// Case 2 : Total Sum > Total OR
// --------------------------------------------

// If the arithmetic sum is larger than the OR,
// then at least one bit position contains a '1'
// in multiple numbers.
//
// Adding such numbers creates a carry,
// making:
//
// Total Sum > Total OR
//
// These overlapping bits represent conflicts.
// Such conflicting numbers can never be merged
// directly under the condition (Ai & Aj) == 0.
//
// Eventually we get stuck before reaching
// a single element.
