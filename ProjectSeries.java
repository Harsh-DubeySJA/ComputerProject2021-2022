class Series {

    public static double sine(double x) {
        double num = x, den = 1, fact = 1, sign = 1, term, sum = 0;
        do {
            term = num / den;
            sum += (term * sign);
            // System.out.println(num + "\t" + den + "\t\t" + term + "\t" + sum);

            if ((term > 0 ? term : -term) < 0.0000000000001) {
                break;
            }
            sign *= -1;

            num *= x * x;
            den *= (fact + 1) * (fact + 2);
            fact += 2;
        } while (true);
        return sum;
    }

    public static double cosine(double x) {
        // cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! ... up to 0.00001%
        // 1 degree = PI/180
        double num = x * x, den = 2, fact = 1, sign = -1, term, sum = 1;
        do {
            term = num / den;
            sum += (term * sign);
            // System.out.println(num + "\t" + den + "\t\t" + term + "\t" + sum);

            if ((term > 0 ? term : -term) < 0.0000000000001) {
                break;
            }
            sign *= -1;

            num *= x * x;
            den *= (fact + 1) * (fact + 2);
            fact += 2;
        } while (true);
        return sum;
    }

    public static double tan(double x) {
        return sine(x) / cosine(x);
    }

    public static void main(String[] args) {
        System.out.println(cosine(45f / 180));
        System.out.println(Math.cos(45f / 180));
    }
}