
public class Matrix {
	
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	
	public Matrix(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1, int i1, int j1, int k1, int l1) {
		a = a1;
		b = b1;
		c = c1;
		d = d1;
		e = e1;
		f = f1;
		g = g1;
		h = h1;
		i = i1;
		j = j1;
		k = k1;
		l = l1;
	}
	
	public double[] solve() {
		
		double[] result = {0,0,0};
		double x;
		double y;
		double z;
		double y1 = (b * e) - (f * a);
		double z1 = (c * e) - (g * a);
		double w1 = (d * e) - (h * a);
		double y2 = (f * i) - (j * e);
		double z2 = (g * i) - (k * e);
		double w2 = (h * i) - (l * e);
		
		z = -((w1 * y2) - (w2 * y1)) / ((z2 * y1) - (z1 * y2));
		
		y = (w1 - z) / y1;
		
		x = (d - (b * y + c * z)) / a;
		
		result[0] = x;
		result[1] = y;
		result[2] = z;
		
		return result;
	}

}
