import java.util.Calendar;
import java.util.TimeZone;

final class ah {
	
	int a;
	long b = 0L;
	static int c;
	int d;
	int e;
	static ob f = rf.a(40, "; version=1; path=)4; domain=");
	int g;
	aa h;
	int i;
	static int[] j;
	int k;
	static ob l = rf.a(40, "(U1");
	static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	int n;
	int o;
	int p;
	int q;
	int r;
	static int[][][] s;
	static ih[] t = new ih[500];
	static ob autoshadowoffCommand = rf.a(40, "::autoshadow off");
	static ob v = rf.a(40, "Willkommen auf RuneScape");
	static int w = 500;
	
	public static void a(byte unused) {
		try {
			s = null;
			autoshadowoffCommand = null;
			t = null;
			calendar = null;
			f = null;
			v = null;
			j = null;
			l = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ah.A(" + unused + ')');
		}
	}
	
	static void a(int i, ce ce, boolean unused, int i1, boolean flag, int i2) {
		try {
			++c;
			if (~dh.k > -51) {
				if (ce.S != null && ~ce.S.length < ~i1) {
					int i3 = ce.S[i1];
					if (~i3 != -1) {
						int i4 = i3 >> 8;
						int i5 = (i3 & 116) >> 4;
						int i6 = 15 & i3;
						if (~i6 == -1) {
							if (flag) {
								ih.a(i5, i4, 0, 0);
							}
							
						} else if (~qf.L != -1) {
							ri.k[dh.k] = i4;
							ii.G[dh.k] = i5;
							eh.Y[dh.k] = 0;
							ke.rb[dh.k] = null;
							int i7 = (i2 - 64) / 128;
							int i8 = (i - 64) / 128;
							kg.o[dh.k] = i6 + ((i8 << 16) - -(i7 << 8));
							++dh.k;
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ah.B(" + i + ',' + "{...}" + ',' + unused + ',' + i1 + ',' + flag + ',' + i2 + ')');
		}
	}
}
