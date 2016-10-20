import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class cc extends rg {
	
	static int[] D = new int[] {1, 1, 1, 1};
	static int F;
	static ca cacheFile_0;
	static boolean H = false;
	static ob I = rf.a(40, "(U4");
	static pe cacheFile7;
	static int K = 0;
	static int L;
	static int M;
	static int N;
	int O = 0;
	static ob P = rf.a(40, "; Max)2Age=");
	static int Q;
	static int R;
	static int S;
	
	private void a(og og, int value, int unused) {
		try {
			++L;
			if (value == 2) {
				this.O = og.readShort(106);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "cc.G(" + (og != null ? "{...}" : "null") + ',' + value + ',' + unused + ')');
		}
	}
	
	static fa[] a(boolean unused) {
		try {
			++N;
			fa[] fas = new fa[th.X];
			int i = 0;
			if (i >= th.X) {
				ii.e(-61);
				return fas;
			}
			
			do {
				fa fa = new fa();
				fa.M = tg.b;
				fa.K = kd.S;
				fa.P = ci.A[i];
				fa.L = ci.x[i];
				fa.Q = ub.g[i];
				fa.N = le.db[i];
				fa.O = be.h;
				fa.R = wg.V[i];
				fas[i] = fa;
				++i;
			} while (i < th.X);
			
			ii.e(-61);
			return fas;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "cc.C(" + unused + ')');
		}
	}
	
	static void f(int unused) {
		int dummy = client.anInt_wb;
		
		try {
			++M;
			qf qf = (qf) va.h.a((byte) -9);
			if (/*dummy == 0 && */qf == null) {
				va.h.c(100);
			} else {
				do {
					if (qf.t != null) {
						ub.d.a(qf.t);
						qf.t = null;
					}
					
					if (qf.A != null) {
						ub.d.a(qf.A);
						qf.A = null;
					}
					
					qf = (qf) va.h.b((byte) -120);
				} while (qf != null);
				
				va.h.c(100);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "cc.E(" + unused + ')');
		}
	}
	
	public static void g(int unused) {
		try {
			I = null;
			P = null;
			cacheFile7 = null;
			cacheFile_0 = null;
			D = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "cc.D(" + unused + ')');
		}
	}
	
	static String a(byte unused, Throwable throwable) throws IOException {
		int dummy = client.anInt_wb;
		
		String string;
		++S;
		if (!(throwable instanceof se)) {
			string = "";
		} else {
			se se = (se) throwable;
			throwable = se.h;
			string = se.n + " | ";
		}
		
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		throwable.printStackTrace(printWriter);
		printWriter.close();
		String string2 = stringWriter.toString();
		BufferedReader bufferedReader = new BufferedReader(new StringReader(string2));
		String string3 = bufferedReader.readLine();
		
		while (true) {
			String string4 = bufferedReader.readLine();
			if (string4 != null) {
				int i = string4.indexOf(40);
				int i1 = string4.indexOf(41, 1 + i);
				if (i >= 0 && i1 >= 0) {
					String string5 = string4.substring(i + 1, i1);
					int i2 = string5.indexOf(".java:");
					if (i2 >= 0) {
						string5 = string5.substring(0, i2) + string5.substring(5 + i2);
						string = string + string5 + ' ';
					} else {
						string4 = string4.substring(0, i);
					}
				} else {
					string4 = string4.trim();
					string4 = string4.substring(1 + string4.lastIndexOf(32));
					string4 = string4.substring(string4.lastIndexOf(9) + 1);
					string = string + string4 + ' ';
				}
			} else {
				break;
			}
		}
		
		string = string + "| " + string3;
		return string;
	}
	
	final void a(og og, int unused) {
		int dummy = client.anInt_wb;
		
		try {
			int value;
			do {
				value = og.readUnsignedByte(255);
				if (value == 0) {
					break;
				}
				
				this.a(og, value, 2);
			} while (dummy == 0);
			
			++F;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "cc.A(" + (og != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static kc a(ob ob, int unused, ob ob1, pe cacheFile8) {
		try {
			++Q;
			int i = cacheFile8.a((byte) -120, ob);
			int i1 = cacheFile8.a(i, true, ob1);
			return oe.a(cacheFile8, i, -111, i1);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "cc.B(" + (ob != null ? "{...}" : "null") + ',' + unused + ',' + (ob1 != null ? "{...}" : "null") + ',' + (cacheFile8 != null ? "{...}" : "null") + ')');
		}
	}
}
