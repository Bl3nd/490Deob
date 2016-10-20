import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class tb implements KeyListener, FocusListener {
	
	static int a;
	static int b;
	static ob pleaseRemove3;
	static boolean d;
	static int e;
	static ob pleaseRemove2;
	static int g;
	static byte aByte_h = 0;
	static ob errortestCommand;
	private static ob pleaseRemove = rf.a(40, "Please remove ");
	static int k;
	static ra l;
	static byte[][][] bytes_m;
	static int n;
	static int o;
	static ob b12_full;
	static ob q;
	
	public final synchronized void focusLost(FocusEvent var1) {
		try {
			++a;
			if (pa.a != null) {
				qf.N = -1;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "tb.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void focusGained(FocusEvent var1) {
		try {
			++n;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "tb.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void keyReleased(KeyEvent var1) {
		try {
			if (pa.a != null) {
				int var2;
				label32:
				{
					h.ib = 0;
					var2 = var1.getKeyCode();
					if (var2 >= 0 && m.x.length > var2) {
						var2 = m.x[var2] & -129;
						if (client.anInt_wb == 0) {
							break label32;
						}
					}
					
					var2 = -1;
				}
				
				if (qf.N >= 0 && ~var2 <= -1) {
					sb.qb[qf.N] = ~var2;
					qf.N = qf.N + 1 & 127;
					if (~qf.N == ~kg.f) {
						qf.N = -1;
					}
				}
			}
			
			++e;
			var1.consume();
		} catch (RuntimeException var3) {
			throw bc.a(var3, "tb.keyReleased(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final synchronized void keyPressed(KeyEvent var1) {
		try {
			if (pa.a != null) {
				int var2;
				label61:
				{
					h.ib = 0;
					var2 = var1.getKeyCode();
					if (~var2 > -1 || ~m.x.length >= ~var2) {
						var2 = -1;
						if (client.anInt_wb == 0) {
							break label61;
						}
					}
					
					var2 = m.x[var2];
					if (~(128 & var2) != -1) {
						var2 = -1;
					}
				}
				
				if (qf.N >= 0 && ~var2 <= -1) {
					sb.qb[qf.N] = var2;
					qf.N = qf.N - -1 & 127;
					if (~qf.N == ~kg.f) {
						qf.N = -1;
					}
				}
				
				int var3;
				if (var2 >= 0) {
					var3 = 127 & 1 + pa.h;
					if (var3 != nc.b) {
						ee.n[pa.h] = var2;
						bf.fb[pa.h] = -1;
						pa.h = var3;
					}
				}
				
				var3 = var1.getModifiers();
				if (~(10 & var3) != -1 || ~var2 == -86 || ~var2 == -11) {
					var1.consume();
				}
			}
			
			++g;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "tb.keyPressed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public final void keyTyped(KeyEvent var1) {
		try {
			++o;
			if (pa.a != null) {
				int var2 = vf.a(110, var1);
				if (var2 >= 0) {
					int var3 = 127 & pa.h + 1;
					if (nc.b != var3) {
						ee.n[pa.h] = -1;
						bf.fb[pa.h] = var2;
						pa.h = var3;
					}
				}
			}
			
			var1.consume();
		} catch (RuntimeException var4) {
			throw bc.a(var4, "tb.keyTyped(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			pleaseRemove = null;
			if (var0 <= 2) {
				q = null;
			}
			
			errortestCommand = null;
			bytes_m = null;
			pleaseRemove2 = null;
			b12_full = null;
			l = null;
			q = null;
			pleaseRemove3 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "tb.A(" + var0 + ')');
		}
	}
	
	static {
		pleaseRemove2 = pleaseRemove;
		k = 0;
		pleaseRemove3 = pleaseRemove;
		errortestCommand = rf.a(40, "::errortest");
		b12_full = rf.a(40, "b12_full");
		q = rf.a(40, "http:)4)4");
	}
}
