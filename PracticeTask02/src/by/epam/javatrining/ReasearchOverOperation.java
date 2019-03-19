package by.epam.javatrining;

public class ReasearchOverOperation {
	
	    public static void testInt (){
	        int a = 7;
	        int b = 3;
	        int c;
	        System.out.println ("\nTest int:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = a + b;
	        System.out.printf ("%d + %d = %d\n", a, b, c);
	        //subtraction
	        c = a - b;
	        System.out.printf ("%d - %d = %d\n", a, b, c);
	        //division
	        c = a / b;
	        System.out.printf ("%d / %d = %d\n", a, b, c);
	        //multiplication
	        c = a * b;
	        System.out.printf ("%d * %d = %d\n", a, b, c);
	        //modulus
	        c = a % b;
	        System.out.printf ("%d %% %d = %d\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = -a;
	        System.out.printf ("-%d = %d\n", a, c);
	        //unary plus
	        c = +a;
	        System.out.printf ("+%d = %d\n", a, c);
	        //prefix increment
	        System.out.printf ("++%d = %d\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%d++ = %d\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%d = %d\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%d-- = %d\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%d == %d --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%d != %d --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%d > %d --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%d >= %d --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%d < %d --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%d <= %d --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%d > %d) --> %b\n", a, b, !(a <= b));

	        System.out.println ("\n*** Bitwise and Bit Shift Operators ***");
	        //bitwise AND
	        c = a & b;
	        System.out.printf ("%d & %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s & %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise OR
	        c = a | b;
	        System.out.printf ("%d | %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s | %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise XOR
	        c = a ^ b;
	        System.out.printf ("%d ^ %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s ^ %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise compliment
	        c = ~a;
	        System.out.printf ("~%d = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("~%s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //left shift
	        c = a << 1;
	        System.out.printf ("%d << 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s << 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        c = a >> 1;
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        a = -7;
	        c = a >> 1;
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = 7;
	        c = a >>> 1;
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = -7;
	        c = a >>> 1;
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));

	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3;
	        System.out.printf ("%d += %d --> c = %d\n", c, a, c += a);
	        System.out.printf ("%d -= %d --> c = %d\n", c, a, c -= a);
	        System.out.printf ("%d *= %d --> c = %d\n", c, a, c *= a);
	        System.out.printf ("%d /= %d --> c = %d\n", c, a, c /= a);
	        System.out.printf ("%d %%= %d --> c = %d\n", c, a, c %= a);
	        System.out.printf ("%d |= %d --> c = %d\n", c, a, c |= a);
	        System.out.printf ("%d &= %d --> c = %d\n", c, a, c &= a);
	        System.out.printf ("%d ^= %d --> c = %d\n", c, a, c ^= a);
	        System.out.printf ("%d >>= 1 --> c = %d\n", c, c >>= 1);
	        System.out.printf ("%d <<= 1 --> c = %d\n", c, c <<= 1);
	        System.out.printf ("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'A';
	        long l = 30000000000000000L;
	        float f = 27.03F;
	        double d = 123456.789;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.printf ("int = byte: c = %d --> c = %d\n", bt, c);
	        c = sh;
	        System.out.printf ("int = short: c = %d --> c = %d\n", sh, c);
	        c = ch;
	        System.out.printf ("int = char: c = '%c' --> c = %d\n", ch, c);
	        c = (int) l;
	        System.out.printf ("int = long: c = (int)%d --> c = %d\n", l, c);
	        c = (int) f;
	        System.out.printf ("int = float: c = (int)%f --> c = %d\n", f, c);
	        c = (int) d;
	        System.out.printf ("int = double: c = (int)%f --> c = %d\n", d, c);
	    }

	    public static void testShort (){
	        short a = 7;
	        short b = 3;
	        short c;
	        System.out.println ("\nTest short:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = (short) (a + b);
	        System.out.printf ("%d + %d = %d\n", a, b, c);
	        //subtraction
	        c = (short) (a - b);
	        System.out.printf ("%d - %d = %d\n", a, b, c);
	        //division
	        c = (short) (a / b);
	        System.out.printf ("%d / %d = %d\n", a, b, c);
	        //multiplication
	        c = (short) (a * b);
	        System.out.printf ("%d * %d = %d\n", a, b, c);
	        //modulus
	        c = (short) (a % b);
	        System.out.printf ("%d %% %d = %d\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = (short) -a;
	        System.out.printf ("-%d = %d\n", a, c);
	        //unary plus
	        c = (short) +a;
	        System.out.printf ("+%d = %d\n", a, c);
	        //prefix increment
	        System.out.printf ("++%d = %d\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%d++ = %d\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%d = %d\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%d-- = %d\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%d == %d --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%d != %d --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%d > %d --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%d >= %d --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%d < %d --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%d <= %d --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%d > %d) --> %b\n", a, b, !(a <= b));

	        System.out.println ("\n*** Bitwise and Bit Shift Operators ***");
	        //bitwise AND
	        c = (short) (a & b);
	        System.out.printf ("%d & %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s & %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise OR
	        c = (short) (a | b);
	        System.out.printf ("%d | %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s | %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise XOR
	        c = (short) (a ^ b);
	        System.out.printf ("%d ^ %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s ^ %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise compliment
	        c = (short) ~a;
	        System.out.printf ("~%d = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("~%s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //left shift
	        c = (short) (a << 1);
	        System.out.printf ("%d << 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s << 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        c = (short) (a >> 1);
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        a = -7;
	        c = (short) (a >> 1);
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = 7;
	        c = (short) (a >>> 1);
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = -7;
	        c = (short) (a >>> 1);
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));

	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3;
	        System.out.printf ("%d += %d --> c = %d\n", c, a, c += a);
	        System.out.printf ("%d -= %d --> c = %d\n", c, a, c -= a);
	        System.out.printf ("%d *= %d --> c = %d\n", c, a, c *= a);
	        System.out.printf ("%d /= %d --> c = %d\n", c, a, c /= a);
	        System.out.printf ("%d %%= %d --> c = %d\n", c, a, c %= a);
	        System.out.printf ("%d |= %d --> c = %d\n", c, a, c |= a);
	        System.out.printf ("%d &= %d --> c = %d\n", c, a, c &= a);
	        System.out.printf ("%d ^= %d --> c = %d\n", c, a, c ^= a);
	        System.out.printf ("%d >>= 1 --> c = %d\n", c, c >>= 1);
	        System.out.printf ("%d <<= 1 --> c = %d\n", c, c <<= 1);
	        System.out.printf ("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'Y';
	        int i = 12345;
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 1234567890.1234;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.printf ("short = byte: c = %d --> c = %d\n", bt, c);
	        c = sh;
	        System.out.printf ("short = short: c = %d --> c = %d\n", sh, c);
	        c = (short) ch;
	        System.out.printf ("short = char: c = (short)'%c' --> c = %d\n", ch, c);
	        c = (short) i;
	        System.out.printf ("short = int: c = (short)%d --> c = %d\n", i, c);
	        c = (short) l;
	        System.out.printf ("short = long: c = (short)%d --> c = %d\n", l, c);
	        c = (short) f;
	        System.out.printf ("short = float: c = (short)%f --> c = %d\n", f, c);
	        c = (short) d;
	        System.out.printf ("short = double: c = (short)%f --> c = %d\n", d, c);
	    }

	    public static void testByte (){
	        byte a = 7;
	        byte b = 4;
	        byte c;
	        System.out.println ("\nTest byte:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = (byte) (a + b);
	        System.out.printf ("%d + %d = %d\n", a, b, c);
	        //subtraction
	        c = (byte) (a - b);
	        System.out.printf ("%d - %d = %d\n", a, b, c);
	        //division
	        c = (byte) (a / b);
	        System.out.printf ("%d / %d = %d\n", a, b, c);
	        //multiplication
	        c = (byte) (a * b);
	        System.out.printf ("%d * %d = %d\n", a, b, c);
	        //modulus
	        c = (byte) (a % b);
	        System.out.printf ("%d %% %d = %d\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = (byte) -a;
	        System.out.printf ("-%d = %d\n", a, c);
	        //unary plus
	        c = (byte) +a;
	        System.out.printf ("+%d = %d\n", a, c);
	        //prefix increment
	        System.out.printf ("++%d = %d\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%d++ = %d\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%d = %d\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%d-- = %d\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%d == %d --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%d != %d --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%d > %d --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%d >= %d --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%d < %d --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%d <= %d --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%d > %d) --> %b\n", a, b, !(a <= b));

	        System.out.println ("\n*** Bitwise and Bit Shift Operators ***");
	        //bitwise AND
	        c = (byte) (a & b);
	        System.out.printf ("%d & %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s & %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise OR
	        c = (byte) (a | b);
	        System.out.printf ("%d | %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s | %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise XOR
	        c = (byte) (a ^ b);
	        System.out.printf ("%d ^ %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s ^ %s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (b),
	                           Integer.toBinaryString (c));
	        //bitwise compliment
	        c = (byte) ~a;
	        System.out.printf ("~%d = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("~%s = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //left shift
	        c = (byte) (a << 1);
	        System.out.printf ("%d << 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s << 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        c = (byte) (a >> 1);
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //right shift
	        a = -7;
	        c = (byte) (a >> 1);
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = 7;
	        c = (byte) (a >>> 1);
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));
	        //zero fill right shift
	        a = -7;
	        c = (byte) (a >>> 1);
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Integer.toBinaryString (a), Integer.toBinaryString (c));

	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3;
	        System.out.printf ("%d += %d --> c = %d\n", c, a, c += a);
	        System.out.printf ("%d -= %d --> c = %d\n", c, a, c -= a);
	        System.out.printf ("%d *= %d --> c = %d\n", c, a, c *= a);
	        System.out.printf ("%d /= %d --> c = %d\n", c, a, c /= a);
	        System.out.printf ("%d %%= %d --> c = %d\n", c, a, c %= a);
	        System.out.printf ("%d |= %d --> c = %d\n", c, a, c |= a);
	        System.out.printf ("%d &= %d --> c = %d\n", c, a, c &= a);
	        System.out.printf ("%d ^= %d --> c = %d\n", c, a, c ^= a);
	        System.out.printf ("%d >>= 1 --> c = %d\n", c, c >>= 1);
	        System.out.printf ("%d <<= 1 --> c = %d\n", c, c <<= 1);
	        System.out.printf ("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'Y';
	        int i = 53434;
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 1234567890.1234;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.printf ("byte = byte: c = %d --> c = %d\n", bt, c);
	        c = (byte) sh;
	        System.out.printf ("byte = short: c = (byte)%d --> c = %d\n", sh, c);
	        c = (byte) ch;
	        System.out.printf ("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
	        c = (byte) i;
	        System.out.printf ("byte = int: c = (byte)'%c' --> c = %d\n", i, c);
	        c = (byte) l;
	        System.out.printf ("byte = long: c = (byte)%d --> c = %d\n", l, c);
	        c = (byte) f;
	        System.out.printf ("byte = float: c = (byte)%f --> c = %d\n", f, c);
	        c = (byte) d;
	        System.out.printf ("byte = double: c = (byte)%f --> c = %d\n", d, c);
	    }

	    public static void testChar (){
	        char a = 'A';
	        char b = 'n';
	        char c;
	        System.out.println ("\nTest char:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = (char) (a + b);
	        System.out.println ("a + b = " + (int) c);
	        //subtraction
	        c = (char) (a - b);
	        System.out.println ("a - b = " + (int) c);
	        //division
	        c = (char) (a / b);
	        System.out.println ("a / b = " + (int) c);
	        //multiplication
	        c = (char) (a * b);
	        System.out.println ("a * b = " + (int) c);
	        //modulus
	        c = (char) (a % b);
	        System.out.println ("a % b = " + (int) c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus cannot be applied
	        //unary plus
	        c = (char) +a;
	        System.out.println ("+a = " + (int) c);
	        //prefix increment
	        c = ++a;
	        System.out.println ("++a = " + (int) c);
	        a = 'A';
	        //postfix increment
	        c = a++;
	        System.out.println ("a++ = " + (int) c);
	        a = 'A';
	        //prefix decrement
	        c = --a;
	        System.out.println ("--a = " + (int) c);
	        a = 'A';
	        //postfix decrement
	        c = a--;
	        System.out.println ("a-- = " + (int) c);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.println ("a == b --> " + (a == b));
	        //not equal to
	        System.out.println ("a != b --> " + (a != b));
	        //greater than
	        System.out.println ("a > b --> " + (a > b));
	        //greater than or equal to
	        System.out.println ("a >= b --> " + (a >= b));
	        //less than
	        System.out.println ("a < b --> " + (a < b));
	        //less than or equal to
	        System.out.println ("a <= b --> " + (a <= b));
	        //logical operators can not be applied to char
	        System.out.println ("\n*** Bitwise and Bit Shift Operators ***");
	        //bitwise AND
	        c = (char) (a & b);
	        System.out.println ("c = (char) (a & b) --> " + (int) c);
	        //bitwise OR
	        c = (char) (a | b);
	        System.out.println ("c = (char) (a | b) --> " + (int) c);
	        //bitwise XOR
	        c = (char) (a ^ b);
	        System.out.println ("c = (char) (a ^ b) --> " + (int) c);
	        //bitwise compliment
	        c = (char) ~a;
	        System.out.println ("c = (char) ~a --> " + (int) c);
	        //left shift
	        c = (char) (a << 1);
	        System.out.println ("c = (char) (a << 1) --> " + (int) c);
	        //right shift
	        c = (char) (a >> 1);
	        System.out.println ("c = (char) (a >> 1) --> " + (int) c);
	        //zero fill right shift
	        a = 'A';
	        c = (char) (a >>> 1);
	        System.out.println ("c = (char) (a >>> 1) --> " + (int) c);

	        System.out.println ("\n*** Assignment Operators ***");
	        c = 'c';
	        c += a;
	        System.out.println ("c += a --> " + (int) c);
	        c -= a;
	        System.out.println ("c -= a --> " + (int) c);
	        c *= a;
	        System.out.println ("c *= a --> " + (int) c);
	        c /= a;
	        System.out.println ("c /= a --> " + (int) c);
	        c %= a;
	        System.out.println ("c %= a --> " + (int) c);
	        c |= a;
	        System.out.println ("c |= a --> " + (int) c);
	        c &= a;
	        System.out.println ("c &= a --> " + (int) c);
	        c ^= a;
	        System.out.println ("c ^= a --> " + (int) c);
	        c >>= 1;
	        System.out.println ("c >>= 1 --> " + (int) c);
	        c <<= 1;
	        System.out.println ("c <<= 1 --> " + (int) c);
	        c >>>= 1;
	        System.out.println ("c >>>= 1 --> " + (int) c);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.println ("a > b ? a : b --> " + (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30399;
	        char ch = 'Y';
	        int i = 65656;
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 123456789.1234;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = (char) bt;
	        System.out.println ("c = (char) bt --> c == " + (int) c);
	        System.out.printf ("char = byte: c = (char)%d --> c = %d\n", bt, (int) c);
	        c = (char) sh;
	        System.out.printf ("char = short: c = (char)%d --> c = %d\n", sh, (int) c);
	        c = ch;
	        System.out.printf ("char = char: c = '%c' --> c = %d\n", ch, (int) c);
	        c = (char) i;
	        System.out.printf ("char = int: c = (char)%d --> c = %d\n", i, (int) c);
	        c = (char) l;
	        System.out.printf ("char = long: c = (char)%d --> c = %d\n", l, (int) c);
	        c = (char) f;
	        System.out.printf ("char = float: c = (char)%f --> c = %f\n", f, (float) c);
	        c = (char) d;
	        System.out.printf ("char = double: c = (char)%f --> c = %f\n", d, (double) c);
	    }

	    public static void testLong (){
	        long a = 7;
	        long b = 3;
	        long c;
	        System.out.println ("\nTest long:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = a + b;
	        System.out.printf ("%d + %d = %d\n", a, b, c);
	        //subtraction
	        c = a - b;
	        System.out.printf ("%d - %d = %d\n", a, b, c);
	        //division
	        c = a / b;
	        System.out.printf ("%d / %d = %d\n", a, b, c);
	        //multiplication
	        c = a * b;
	        System.out.printf ("%d * %d = %d\n", a, b, c);
	        //modulus
	        c = a % b;
	        System.out.printf ("%d %% %d = %d\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = -a;
	        System.out.printf ("-%d = %d\n", a, c);
	        //unary plus
	        c = +a;
	        System.out.printf ("+%d = %d\n", a, c);
	        //prefix increment
	        System.out.printf ("++%d = %d\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%d++ = %d\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%d = %d\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%d-- = %d\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%d == %d --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%d != %d --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%d > %d --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%d >= %d --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%d < %d --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%d <= %d --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%d > %d) --> %b\n", a, b, !(a <= b));

	        System.out.println ("\n*** Bitwise and Bit Shift Operators ***");
	        //bitwise AND
	        c = a & b;
	        System.out.printf ("%d & %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s & %s = %s\n", Long.toBinaryString (a), Long.toBinaryString (b), Long.toBinaryString (c));
	        //bitwise OR
	        c = a | b;
	        System.out.printf ("%d | %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s | %s = %s\n", Long.toBinaryString (a), Long.toBinaryString (b), Long.toBinaryString (c));
	        //bitwise XOR
	        c = a ^ b;
	        System.out.printf ("%d ^ %d = %d\n", a, b, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s ^ %s = %s\n", Long.toBinaryString (a), Long.toBinaryString (b), Long.toBinaryString (c));
	        //bitwise compliment
	        c = ~a;
	        System.out.printf ("~%d = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("~%s = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));
	        //left shift
	        c = a << 1;
	        System.out.printf ("%d << 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s << 1 = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));
	        //right shift
	        c = a >> 1;
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));
	        //right shift
	        a = -7;
	        c = a >> 1;
	        System.out.printf ("%d >> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >> 1 = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));
	        //zero fill right shift
	        a = 7;
	        c = a >>> 1;
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));
	        //zero fill right shift
	        a = -7;
	        c = a >>> 1;
	        System.out.printf ("%d >>> 1 = %d\n", a, c);
	        System.out.println ("in binary form:");
	        System.out.printf ("%s >>> 1 = %s\n", Long.toBinaryString (a), Long.toBinaryString (c));

	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3;
	        System.out.printf ("%d += %d --> c = %d\n", c, a, c += a);
	        System.out.printf ("%d -= %d --> c = %d\n", c, a, c -= a);
	        System.out.printf ("%d *= %d --> c = %d\n", c, a, c *= a);
	        System.out.printf ("%d /= %d --> c = %d\n", c, a, c /= a);
	        System.out.printf ("%d %%= %d --> c = %d\n", c, a, c %= a);
	        System.out.printf ("%d |= %d --> c = %d\n", c, a, c |= a);
	        System.out.printf ("%d &= %d --> c = %d\n", c, a, c &= a);
	        System.out.printf ("%d ^= %d --> c = %d\n", c, a, c ^= a);
	        System.out.printf ("%d >>= 1 --> c = %d\n", c, c >>= 1);
	        System.out.printf ("%d <<= 1 --> c = %d\n", c, c <<= 1);
	        System.out.printf ("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'Y';
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 1234567890.5432;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.printf ("int = byte: c = %d --> c = %d\n", bt, c);
	        c = sh;
	        System.out.printf ("int = short: c = %d --> c = %d\n", sh, c);
	        c = ch;
	        System.out.printf ("int = char: c = '%c' --> c = %d\n", ch, c);
	        c = l;
	        System.out.printf ("int = long: c = %d --> c = %d\n", l, c);
	        c = (long) f;
	        System.out.printf ("int = float: c = (long)%f --> c = %d\n", f, c);
	        c = (long) d;
	        System.out.printf ("int = double: c = (long)%f --> c = %d\n", d, c);
	    }

	    public static void testFloat (){
	        float a = 7.1F; //double by default that why a qualifier is required
	        float b = 3.7F;
	        float c;
	        System.out.println ("\nTest float:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = a + b;
	        System.out.printf ("%f + %f = %f\n", a, b, c);
	        //subtraction
	        c = a - b;
	        System.out.printf ("%f - %f = %f\n", a, b, c);
	        //division
	        c = a / b;
	        System.out.printf ("%f / %f = %f\n", a, b, c);
	        //multiplication
	        c = a * b;
	        System.out.printf ("%f * %f = %f\n", a, b, c);
	        //modulus
	        c = a % b;
	        System.out.printf ("%f %% %f = %f\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = -a;
	        System.out.printf ("-%f = %f\n", a, c);
	        //unary plus
	        c = +a;
	        System.out.printf ("+%f = %f\n", a, c);
	        //prefix increment
	        System.out.printf ("++%f = %f\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%f++ = %f\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%f = %f\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%f-- = %f\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%f == %f --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%f != %f --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%f > %f --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%f >= %f --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%f < %f --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%f <= %f --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%f > %f) --> %b\n", a, b, !(a <= b));
	        //Bitwise anf Bit Shift Operators cannot be applied to float
	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3.5F;
	        System.out.printf ("%f += %f --> c = %f\n", c, a, c += a);
	        System.out.printf ("%f -= %f --> c = %f\n", c, a, c -= a);
	        System.out.printf ("%f *= %f --> c = %f\n", c, a, c *= a);
	        System.out.printf ("%f /= %f --> c = %f\n", c, a, c /= a);
	        System.out.printf ("%f %%= %f --> c = %f\n", c, a, c %= a);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'A';
	        int i = 43210;
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 1234567890.1234;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.println ("c = bt --> c = " + c); //("float = byte: c = %d --> c = \n", bt, c);
	        c = sh;
	        System.out.println ("c = sh --> c = " + c);//("float = short: c = %f --> c = \n", sh, c);
	        c = ch;
	        System.out.println ("c = ch --> c = " + c);//"float = char: c = '%c' --> c = \n", ch, c)
	        c = i;
	        System.out.println ("c = i --> c = " + c);
	        c = l;
	        System.out.println ("c = l --> c = " + c);//("float = long: c = %f --> c = %f\n", l, c);
	        c = f;
	        System.out.printf ("float = float: c = %f --> c = %f\n", f, c);
	        c = (float) d;
	        System.out.printf ("float = double: c = (float)%f --> c = %f\n", d, c);
	    }

	    public static void testDouble (){
	        double a = 7;
	        double b = 3;
	        double c;
	        System.out.println ("\nTest double:");
	        System.out.println ("\n*** Binary arithmetical operators ***");
	        //addition
	        c = a + b;
	        System.out.printf ("%f + %f = %f\n", a, b, c);
	        //subtraction
	        c = a - b;
	        System.out.printf ("%f - %f = %f\n", a, b, c);
	        //division
	        c = a / b;
	        System.out.printf ("%f / %f = %f\n", a, b, c);
	        //multiplication
	        c = a * b;
	        System.out.printf ("%f * %f = %f\n", a, b, c);
	        //modulus
	        c = a % b;
	        System.out.printf ("%f %% %f = %f\n", a, b, c);

	        System.out.println ("\n*** Unary arithmetical operators ***");
	        //unary minus
	        c = -a;
	        System.out.printf ("-%f = %f\n", a, c);
	        //unary plus
	        c = +a;
	        System.out.printf ("+%f = %f\n", a, c);
	        //prefix increment
	        System.out.printf ("++%f = %f\n", ++a, a);
	        a = 7;
	        //postfix increment
	        System.out.printf ("%f++ = %f\n", a++, a);
	        a = 7;
	        //prefix decrement
	        System.out.printf ("--%f = %f\n", --a, a);
	        a = 7;
	        //postfix decrement
	        System.out.printf ("%f-- = %f\n", a--, a);

	        System.out.println ("\n*** Relational operators ***");
	        //equal to
	        System.out.printf ("%f == %f --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%f != %f --> %b\n", a, b, a != b);
	        //greater than
	        System.out.printf ("%f > %f --> %b\n", a, b, a > b);
	        //greater than or equal to
	        System.out.printf ("%f >= %f --> %b\n", a, b, a >= b);
	        //less than
	        System.out.printf ("%f < %f --> %b\n", a, b, a < b);
	        //less than or equal to
	        System.out.printf ("%f <= %f --> %b\n", a, b, a <= b);

	        System.out.println ("\n*** Logical Operations ***");
	        //logical AND
	        System.out.printf ("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a >= b) && (a != 0));
	        //bitwise AND
	        System.out.printf ("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
	        //logical OR
	        System.out.printf ("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a <= b) || (b == 0));
	        //bitwise OR
	        System.out.printf ("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a < b) | (b != 0));
	        //logical XOR
	        System.out.printf ("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a != b) ^ (a == 0));
	        //logical NOT
	        System.out.printf ("!(%f > %f) --> %b\n", a, b, !(a <= b));
	        //Bitwise and Bit Shift Operators cannot be applied to double
	        System.out.println ("\n*** Assignment Operators ***");
	        c = 3;
	        System.out.printf ("%f += %f --> c = %f\n", c, a, c += a);
	        System.out.printf ("%f -= %f --> c = %f\n", c, a, c -= a);
	        System.out.printf ("%f *= %f --> c = %f\n", c, a, c *= a);
	        System.out.printf ("%f /= %f --> c = %f\n", c, a, c /= a);
	        System.out.printf ("%f %%= %f --> c = %f\n", c, a, c %= a);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        System.out.println ("\nCondition Operator:");
	        System.out.printf ("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
	        System.out.println ("\nType Cast Operator:");
	        byte bt = 1;
	        short sh = -30799;
	        char ch = 'A';
	        int i = 32323;
	        long l = 40000000000000000L;
	        float f = 27.03F;
	        double d = 1234567890.1234;
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        c = bt;
	        System.out.println ("c = bt --> c = " + c);
	        c = sh;
	        System.out.println ("c = sh --> c = " + c);
	        c = ch;
	        System.out.println ("c = ch --> c = " + c);
	        c = i;
	        System.out.println ("c = i --> c = " + c);
	        c = l;
	        System.out.println ("c = l --> c = " + c);
	        c = f;
	        System.out.printf ("double = float: c = %f --> c = %f\n", f, c);
	        c = d;
	        System.out.printf ("double = double: c = %f --> c = %f\n", d, c);
	    }

	    public static void testBoolean (){
	        boolean a = true;
	        boolean b = false;
	        boolean c;
	        System.out.println ("\nTest boolean:");
	        System.out.println ("\n*** Relational Operators ***");
	        //equal to
	        System.out.printf ("%b == %b --> %b\n", a, b, a == b);
	        //not equal to
	        System.out.printf ("%b != %b --> %b\n", a, b, a != b);

	        System.out.println ("\n*** Logical operators ***");
	        //logical AND
	        c = a && b;
	        System.out.printf ("%b && %b = %b\n", a, b, c);
	        //logical OR
	        c = a || b;
	        System.out.printf ("%b || %b = %b\n", a, b, c);
	        //logical XOR
	        c = a ^ b;
	        System.out.printf ("%b ^ %b = %b\n", a, b, c);
	        //logical NOT
	        System.out.printf ("!%b --> %b\n", a, !a);

	        System.out.println ("\n*** Bitwise Operators ***");
	        c = a & b; // bitwise AND
	        System.out.printf ("%b & %b = %b\n", a, b, c);
	        c = a | b; // bitwise OR
	        System.out.printf ("%b | %b = %b\n", a, b, c);
	        c = a ^ b; // bitwise XOR
	        System.out.printf ("%b ^ %b = %b\n", a, b, c);

	        System.out.println ("\n*** Assignment Operators ***");
	        System.out.printf ("%b |= %b --> c = %b\n", c, a, c |= a);
	        System.out.printf ("%b &= %b --> c = %b\n", c, a, c &= a);
	        System.out.printf ("%b ^= %b --> c = %b\n", c, a, c ^= a);

	        System.out.println ("\n*** Miscellaneous Operators ***");
	        //boolean can't be converted into any type; as well as no type can be converted into boolean
	        System.out.println ("\nCondition Operator:");
	        System.out.printf (" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
	    }
	}
