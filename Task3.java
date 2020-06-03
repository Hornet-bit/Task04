public class Task3 {

        public static void main(String[] args) {

            double a,b,c;
            a = 13;
            b = -2.4;
            c= 54;

            if(a>b&&b>c){

                doubling(a);
                doubling(b);
                doubling(c);

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            }
            else{
                a = makeAbsoluteValue(a);
                b = makeAbsoluteValue(b);
                c = makeAbsoluteValue(c);

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }


        static double doubling(double num){
            num*=2;
            return num;
        }

        static double makeAbsoluteValue(double num){
            num = Math.abs(num);
            return num;
        }

    }

