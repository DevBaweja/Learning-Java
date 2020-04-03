/*
	Code - HS08TEST
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.

Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.

Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.

Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.

Example - Successful Transaction
Input:
30 120.00

Output:
89.50
Example - Incorrect Withdrawal Amount (not multiple of 5)
Input:
42 120.00

Output:
120.00
Example - Insufficient Funds
Input:
300 120.00

Output:
120.00
*/


/*
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int withdraw = sc.nextInt(); 
		
		float amount = sc.nextFloat();
		DecimalFormat df = new DecimalFormat("0.00f");
		amount = Float.parseFloat(df.format(amount));
		System.out.println(amount);
		System.out.printf("%.2f", amount); // C
		System.out.format("%.2f",amount);
	}
	
}
*/


/*
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal");
		int withdraw = sc.nextInt(); // must be multiplier of 5
		
		float amount = sc.nextFloat(); // already in two precision
		transfer(withdraw,amount);		
	}

	private static void transfer(int withdraw, float amount) {
		// TODO Auto-generated method stub
		if(withdraw%5==0 && (amount)>(withdraw+0.50))
		{
			System.out.println(amount-withdraw-0.50);
		}
		else
			System.out.println(amount);
	}
	
}
*/


/*
//package CodeChef.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

class ATM {

  static ReaderWriter rw = new ReaderWriter();
  static Helpers hp = new Helpers();

  private static void solve(boolean multipleTC) throws Exception {
      int T = multipleTC ? rw.ri() : 1;
      while (T-- > 0) {
          Scanner scanner = new Scanner(System.in);
          int N = scanner.nextInt();
          double Y = scanner.nextDouble();
          if (N % 5 != 0 || (double)N + 0.5 > Y) {
              System.out.println(Y);
          } else {
              System.out.println(Y - ((double)N+0.5));
          }
      }
  }

  public static void main(String[] args) throws Exception {
      solve(false);
      rw.flush();
  }

  static class Helpers {

      static long gcd(long a, long b) {
          if (b == 0) {
              return a;
          }
          return gcd(b, a % b);
      }

      static long lcm(long a, long b) {
          return (a / gcd(a, b)) * b;
      }

      static <T> HashMap<T, Integer> freqMap(T[] array) {
          HashMap<T, Integer> map = new HashMap<>();
          for (int i = 0; i < array.length; i++) {
              if (!map.containsKey(array[i])) {
                  map.put(array[i], 0);
              }
              int ev = map.get(array[i]);
              map.put(array[i], ++ev);
          }
          return map;
      }

  }

  static class ReaderWriter {
      static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter printWriter = new PrintWriter(System.out);

      protected void flush() throws Exception {
          printWriter.flush();
          printWriter.close();
          bufferedReader.close();
      }

      protected void println(String s) {
          printWriter.println(s);
      }

      protected void println(int i) {
          printWriter.println(i);
      }

      protected void println(long l) {
          printWriter.println(l);
      }

      int ri() throws Exception {
          return Integer.parseInt(bufferedReader.readLine());
      }

      long rl() throws Exception {
          return Long.parseLong(bufferedReader.readLine());
      }

      String rs() throws Exception {
          return bufferedReader.readLine();
      }

      double rd() throws Exception {
          return Double.parseDouble(bufferedReader.readLine());
      }

      int[] ria() throws Exception {
          String[] line = rs().split(" ");
          int[] arr = new int[line.length];
          for (int i = 0; i < line.length; i++) {
              arr[i] = Integer.parseInt(line[i]);
          }
          return arr;
      }

      long[] rla() throws Exception {
          String[] line = rs().split(" ");
          long[] arr = new long[line.length];
          for (int i = 0; i < line.length; i++) {
              arr[i] = Integer.parseInt(line[i]);
          }
          return arr;
      }

      int gifs(int[] line, int index) {
          return line[index];
      }

      long glfs(long[] line, int index) {
          return line[index];
      }

      void pia(int[] array) {
          for (int i = 0; i < array.length; i++) {
              printWriter.print(array[i] + " ");
          }
          printWriter.println();
      }

      void pla(long[] array) {
          for (int i = 0; i < array.length; i++) {
              printWriter.print(array[i] + " ");
          }
          printWriter.println();
      }
  }
}
*/



/*
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
class Code0
{
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[999999]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }

        void merge(int[] x, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for (int i = 0; i < n1; ++i)
                L[i] = x[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = x[m + 1 + j];
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    x[k] = L[i];
                    i++;
                } else
                {
                    x[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1)
            {
                x[k] = L[i];
                i++;
                k++;
            }
            while (j < n2)
            {
                x[k] = R[j];
                j++;
                k++;
            }
        }
        public void sort(int[] x, int l, int r)
        {
            if (l < r)
            {
                int m = (l + r) / 2;
                sort(x, l, m);
                sort(x, m + 1, r);
                merge(x, l, m, r);
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        Reader in=new Reader();
        Reader op=new Reader();
        double a,b,c=in.nextInt();
        b=in.nextDouble();
        if(c%5==0&&(c+0.5)<=b)
        {
        	a=b-(c+0.5);
        	System.out.println(a);
        }
        else
        	System.out.println(b);
    }
}
*/ 
