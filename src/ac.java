final class ac extends dc {
	
	static kc[] n;
	static int o;
	static ob p = null;
	static ob youCantAddYourselfIgnoreList2;
	static int[] r;
	static ob s;
	private final int t;
	static int u;
	private static ob youCantAddYourselfIgnoreList = rf.a(40, "You can(Wt add yourself to your own ignore list)3");
	static ob hint_mapedge;
	private final int x;
	private final int y;
	private final int z;
	static int A;
	static ob B;
	static ob C;
	static int D;
	static int E;
	static int F;
	static int G;
	
	static void dropClient (int unused) {
		try {
			++D;
			if (~ei.anInt_sb < -1) {
				da.b((byte) -122);
			} else {
				pg.setGameState(40, (byte) 35);
				lg.h = ch.W;
				ch.W = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ac.I(" + unused + ')');
		}
	}
	
	static void a(kc kc, int unused, int i, int i1, ra ra, int i2, int i3) {
		try {
			++o;
			if (kc != null) {
				int i4 = 2047 & jg.h + ve.anInt_l;
				int i5 = Math.max(ra.L / 2, ra.w / 2) + 10;
				int i6 = i1 * i1 + i3 * i3;
				if (i5 * i5 >= i6) {
					int i7 = ec.W[i4];
					int i8 = ec.L[i4];
					i7 = 256 * i7 / (256 + lg.d);
					i8 = i8 * 256 / (256 + lg.d);
					int i9 = -(i3 * i7) + i8 * i1 >> 16;
					int i10 = i8 * i3 + i7 * i1 >> 16;
					kc.a(-(kc.width / 2) + ra.L / 2 + i + i10, -(kc.height / 2) + -i9 + ra.w / 2 + i2, ra.Hb, ra.Wb);
				}
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "ac.K(" + "{...}" + ',' + unused + ',' + i + ',' + i1 + ',' + "{...}" + ',' + i2 + ',' + i3 + ')');
		}
	}
	
	final void a(int i4, int i5, boolean unused) {
		try {
			++E;
			int i = this.t * i5 >> 12;
			int i1 = i5 * this.x >> 12;
			int i2 = this.y * i4 >> 12;
			int i3 = i4 * this.z >> 12;
			re.b(i, i3, i2, super.anInt_m, i1, -23302);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ac.A(" + i4 + ',' + i5 + ',' + unused + ')');
		}
	}
	
	static void a(boolean flag, int i, boolean unused, pe pe, int i1, int i2) {
		try {
			sa.g = i;
			uc.jb = 1;
			fc.ab = i2;
			fb.S = 0;
			m.cacheFile6 = pe;
			++u;
			sc.m = false;
			ca.Pb = 10000;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ac.L(" + flag + ',' + i + ',' + unused + ',' + (pe != null ? "{...}" : "null") + ',' + i1 + ',' + i2 + ')');
		}
	}
	
	final void a(int i4, byte unused, int i5) {
		try {
			++G;
			int i = this.z * i5 >> 12;
			int i1 = this.y * i5 >> 12;
			int i2 = this.x * i4 >> 12;
			int i3 = i4 * this.t >> 12;
			ue.a(i1, -118, i, i2, super.e, super.anInt_m, super.anInt_b, i3);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ac.D(" + i4 + ',' + unused + ',' + i5 + ')');
		}
	}
	
	ac(int i, int i1, int i2, int i3, int i4, int i5, int i6) {
		super(i4, i5, i6);
		try {
			this.y = i2;
			this.t = i3;
			this.x = i1;
			this.z = i;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ac.<init>(" + i + ',' + i1 + ',' + i2 + ',' + i3 + ',' + i4 + ',' + i5 + ',' + i6 + ')');
		}
	}
	
	public static void c(int unused) {
		try {
			p = null;
			C = null;
			youCantAddYourselfIgnoreList = null;
			r = null;
			s = null;
			B = null;
			youCantAddYourselfIgnoreList2 = null;
			n = null;
			hint_mapedge = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ac.H(" + unused + ')');
		}
	}
	
	static int a(int i, int i1, int i2, byte unused) {
		try {
			++A;
			int i3 = i1 / i;
			int i4 = i1 & i - 1;
			int i5 = i2 / i;
			int i6 = gb.a(i5, i3, (byte) -100);
			int i7 = i - 1 & i2;
			int i8 = gb.a(i5, 1 + i3, (byte) -100);
			int i9 = gb.a(i5 + 1, i3, (byte) -100);
			int i10 = gb.a(1 + i5, 1 + i3, (byte) -100);
			int i11 = th.a(1024, i8, i4, i, i6);
			int i12 = th.a(1024, i10, i4, i, i9);
			return th.a(1024, i12, i7, i, i11);
		} catch (RuntimeException var14) {
			throw bc.a(var14, "ac.J(" + i + ',' + i1 + ',' + i2 + ',' + unused + ')');
		}
	}
	
	final void a(byte unused, int i, int i1) {
		try {
			++F;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ac.B(" + unused + ',' + i + ',' + i1 + ')');
		}
	}
	
	static {
		youCantAddYourselfIgnoreList2 = youCantAddYourselfIgnoreList;
		s = null;
		r = new int[128];
		hint_mapedge = rf.a(40, "hint_mapedge");
		C = rf.a(40, "Sie haben gerade eine andere Welt verlassen)3");
		B = rf.a(40, " )2> <col=ffff00>");
	}
}
