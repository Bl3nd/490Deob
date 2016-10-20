import java.awt.Component;

final class ba {
	
	static int a;
	static int anInt_b;
	static int c;
	int anInt_d;
	int e;
	int f;
	int g;
	private static ob loginServerOffline = rf.a(40, "Login server offline)3");
	static int i;
	static ob loginServerOffline2;
	
	static boolean a(byte unused, pe pe, int i) {
		try {
			byte[] bytes = pe.a(i, -9587);
			++c;
			if (bytes == null) {
				return false;
			} else {
				b.a(bytes, (byte) -112);
				return true;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ba.C(" + unused + ',' + (pe != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
	
	static void a(re re, int i, boolean flag) {
		try {
			++anInt_b;
			int i1 = re.w;
			int clientScriptId = (int) re.clientScriptId;
			re.c(128);
			if (flag) {
				de.a(-3, i1);
			}
			
			d.b(i1, -119);
			ra ra = tc.b(clientScriptId, -58);
			if (ra != null) {
				dg.a(ra, i ^ -85);
			}
			
			le.X = false;
			si.S = 0;
			od.a(th.bb, le.anInt_fb, ud.Zb, hi.k, i + i);
			if (~bg.h != 0) {
				vg.a(1, true, bg.h);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ba.B(" + "{...}" + ',' + i + ',' + flag + ')');
		}
	}
	
	public ba() {}
	
	static void a(Component component, int unused) {
		try {
			++i;
			component.addMouseListener(vc.g);
			component.addMouseMotionListener(vc.g);
			component.addFocusListener(vc.g);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ba.A(" + (component != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	public static void a(int unused) {
		try {
			loginServerOffline2 = null;
			loginServerOffline = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ba.D(" + unused + ')');
		}
	}
	
	ba(ba ba) {
		try {
			this.e = ba.e;
			this.g = ba.g;
			this.f = ba.f;
			this.anInt_d = ba.anInt_d;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ba.<init>(" + (ba != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		loginServerOffline2 = loginServerOffline;
	}
}
