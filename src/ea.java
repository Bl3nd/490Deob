import java.awt.Component;

final class ea extends af {
	
	private static ob cancel = rf.a(40, "Cancel");
	static ob cancel2;
	static int T;
	static int U;
	static int V;
	static int W;
	static boolean X;
	static int Y;
	static int Z;
	static cd[] ab;
	static int bb;
	
	static void a(pe cacheFile2, byte unused) {
		try {
			++bb;
			d.cacheFile2 = cacheFile2;
			d.cacheFile2.b(4, (byte) -59);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ea.D(" + (cacheFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static void a(int var0, Component var1) {
		try {
			++Z;
			if (var0 != -751) {
				a(90, null);
			}
			
			var1.removeKeyListener(pa.a);
			var1.removeFocusListener(pa.a);
			qf.N = -1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ea.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public ea() {
		super(0, true);
	}
	
	static ge c(int id, int unused) {
		try {
			++W;
			ge class_ge = (ge) oc.j.a((long) id, (byte) 104);
			if (class_ge != null) {
				return class_ge;
			} else {
				byte[] data = ei.cacheFile2.a((byte) 85, id, 3);
				class_ge = new ge();
				if (data != null) {
					class_ge.a(new og(data), (byte) -110);
				}
				
				oc.j.a(class_ge, (byte) -100, (long) id);
				return class_ge;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ea.C(" + id + ',' + unused + ')');
		}
	}
	
	static ji a(og var0, int var1) {
		try {
			if (var1 != 0) {
				return null;
			} else {
				++T;
				return new ji(var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readSignedShort((byte) -67), var0.readUnsignedMedInt(-124), var0.readUnsignedByte(255));
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ea.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			label25:
			{
				if (gh.R <= var1 + -var4 && ~(var1 + var4) >= ~ng.u && dd.a <= var3 - var4 && ~(var3 + var4) >= ~na.anInt_m) {
					a.a(var1, var2, 104, var3, var4);
					if (client.anInt_wb == 0) {
						break label25;
					}
				}
				
				rg.a(var2, var1, (byte) -26, var3, var4);
			}
			
			++Y;
			if (var0 >= -53) {
				a(null, -19);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ea.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		try {
			++U;
			if (var1 < 13) {
				return null;
			} else {
				int[] var3 = super.nd_v.a(var2, 12);
				if (super.nd_v.n) {
					p.a(var3, 0, lh.eb, rh.r[var2]);
				}
				
				return var3;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ea.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			ab = null;
			cancel2 = null;
			cancel = null;
			if (!var0) {
				X = true;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ea.E(" + var0 + ')');
		}
	}
	
	static {
		cancel2 = cancel;
		X = false;
	}
}
