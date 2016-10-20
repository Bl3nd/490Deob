import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class pc extends Canvas {
	
	static int a;
	static int b;
	static int c;
	private Component d;
	static int anInt_e;
	static ob f = rf.a(40, "oder ung-Ultiges Passwort)3");
	static ob loadingSprites2;
	static int h = 0;
	static int i;
	static int j;
	static ob underscore = rf.a(40, "_");
	static i l;
	static ca cacheFile_22;
	private static ob loadingSprites = rf.a(40, "Loading sprites )2 ");
	
	public final void update(Graphics var1) {
		try {
			this.d.update(var1);
			++i;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pc.update(" + "{...}" + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			cacheFile_22 = null;
			f = null;
			l = null;
			if (var0) {
				h = 96;
			}
			
			loadingSprites2 = null;
			loadingSprites = null;
			underscore = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pc.A(" + var0 + ')');
		}
	}
	
	public final void paint(Graphics var1) {
		try {
			this.d.paint(var1);
			++a;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pc.paint(" + "{...}" + ')');
		}
	}
	
	static hh a(int var0, int var1) {
		try {
			++c;
			if (var0 != 0) {
				return null;
			} else {
				hh var2 = (hh) mf.cb.a((long) var1, (byte) 122);
				if (var2 != null) {
					return var2;
				} else {
					var2 = gb.a((byte) -78, false, var1, hf.cacheFile0, ai.cacheFile1);
					if (var2 != null) {
						mf.cb.a(var2, (byte) -92, (long) var1);
					}
					
					return var2;
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pc.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	pc(Component var1) {
		try {
			this.d = var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "pc.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var19 = client.anInt_wb;
		
		try {
			++b;
			int var11 = kg.a(dd.a, na.anInt_m, true, var1);
			int var12 = kg.a(dd.a, na.anInt_m, true, var5);
			int var13 = kg.a(gh.R, ng.u, true, var0);
			if (var3 != 0) {
				loadingSprites2 = null;
			}
			
			int var14 = kg.a(gh.R, ng.u, true, var6);
			int var7 = kg.a(dd.a, na.anInt_m, true, var1 - -var4);
			int var8 = kg.a(dd.a, na.anInt_m, true, var5 + -var4);
			int var15 = var11;
			if (var19 != 0) {
				sa.a(var14, (byte) 52, var13, var2, e.ints_b[var11]);
				var15 = var11 + 1;
			}
			
			while (var15 < var7) {
				sa.a(var14, (byte) 52, var13, var2, e.ints_b[var15]);
				++var15;
			}
			
			int var16 = var12;
			if (var19 != 0 || var12 > var8) {
				do {
					sa.a(var14, (byte) 52, var13, var2, e.ints_b[var16]);
					--var16;
				} while (var16 > var8);
			}
			
			int var9 = kg.a(gh.R, ng.u, true, var4 + var0);
			int var10 = kg.a(gh.R, ng.u, true, -var4 + var6);
			int var17 = var7;
			if (var19 != 0 || var8 >= var7) {
				do {
					int[] var18 = e.ints_b[var17];
					sa.a(var9, (byte) 52, var13, var2, var18);
					sa.a(var14, (byte) 52, var10, var2, var18);
					++var17;
				} while (var8 >= var17);
				
			}
		} catch (RuntimeException var20) {
			throw bc.a(var20, "pc.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	static {
		loadingSprites2 = loadingSprites;
	}
}
