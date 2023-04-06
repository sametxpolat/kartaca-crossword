public class Crossword {
    
    /*
     * 
     * task:
     *  use: a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
     *   input: ab, z
     *   output: zy, a
     * 
     */

    public static String alphabet = "";

    public static void main(String[] args) throws Exception {
        
        String[] inputs = {
            "Povzhv hvmw z nvhhztv drgs xfiivmg hvhhrlm rm qhlm ulinzg erz gsrh vcznkov",
            "gbkv: REGISTER",
            "mznv: blfi mznv",
            "hfimznv: blfi hfimznv",
            "vnzro: blfi vnzro zwwivhh",
            "ivtrhgizgrlmKvb: ccc",
            "Kvvk orhgvmrmt mvd nvhhztv uli gzhp xlmgvmg! Ylfi ivtrhgizgrlmKvb: 9112u3wzz7u3v25w997wxv57718uz5yv98v102yz7zz03w4vw063uv623xy9531z"
        };

        int i;

        for(i = 97; i <= 122; i++) {
            alphabet += (char)i;
        }

        for(i = 0; i < inputs.length; i++) {
            System.out.println("Input: " + inputs[i] + "\n \t Output: " + decipher(inputs[i]));
        }

    }

    public static String decipher(String input) {

        String output = "";

        for(int i = 0; i < input.length(); i++) {
            // or int point = input.codePointAt(i); if(point >= 97 && point <= 122)
            if(alphabet.contains(String.valueOf(input.charAt(i)))) {
                /*
                 * or
                 *  int index = alphabet.length() - alphabet.indexOf(input.charAt(i)) - 1;
                 * output += alphabet.charAt(index);
                 */
                output += (char)(97 + (122 - input.codePointAt(i)));
            } else {
                output += input.charAt(i);
            }
        }

        return output;

    }
}
