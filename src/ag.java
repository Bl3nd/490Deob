final class ag {
	
	static ob a;
	static ob b = rf.a(40, "(R");
	static ob c;
	static int d;
	static int e = -2;
	static ob f = rf.a(40, "(U0a )2 in: ");
	static boolean forceSend = false;
	static int h;
	static ob l_string = rf.a(40, "l");
	static ob j;
	static ob preparedSoundEngine2;
	static short[][] l = new short[][] {new short[0], new short[0], new short[0], new short[0], new short[0]};
	static int m;
	private static ob preparedSoundEngine = rf.a(40, "Prepared sound engine");
	static ob ob_o;
	private static ob p;
	private static ob q;
	static ob r;
	
	static boolean a(int i, int unused) {
		try {
			++d;
			return (1 & i >> 31) != 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ag.A(" + i + ',' + unused + ')');
		}
	}
	
	static void a(int i) {
		try {
			fi.u = new int[104];
			ff.nb = new byte[4][105][i];
			v.X = new int[104];
			tb.bytes_m = new byte[4][104][104];
			kd.U = 99;
			li.g = new byte[4][104][104];
			nc.h = new byte[4][104][104];
			o.f = new int[104];
			qf.y = new int[104];
			++m;
			rg.C = new byte[4][104][104];
			ad.S = new int[104];
			ah.s = new int[4][105][105];
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ag.C(" + i + ')');
		}
	}
	
	public static void b(int unused) {
		try {
			preparedSoundEngine2 = null;
			l = null;
			preparedSoundEngine = null;
			l_string = null;
			a = null;
			b = null;
			c = null;
			ob_o = null;
			p = null;
			r = null;
			j = null;
			f = null;
			q = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ag.B(" + unused + ')');
		}
	}
	
	static {
		preparedSoundEngine2 = preparedSoundEngine;
		p = rf.a(40, "wave:");
		ob_o = rf.a(40, "null");
		c = p;
		a = p;
		r = rf.a(40, "Das ist eine Mitglieder)2Welt(Q");
		q = rf.a(40, " seconds)3");
		j = q;
	}
}
