final class ri {
	
	static int a = 0;
	static int b;
	static int c;
	static int d;
	static int e;
	static ob f = rf.a(40, "und loggen sich dann erneut ein)3");
	static int g;
	static long aLong_h;
	private static ob hidden = rf.a(40, "Hidden");
	static ob hidden2;
	static int[] k = new int[50];
	static int l;
	static ob m;
	static ob n;
	static int o;
	
	static void a(byte var0) {
		int var5 = client.anInt_wb;
		
		try {
			++o;
			int var2 = 0;
			if (var5 != 0 || var2 < tf.n) {
				do {
					int var3 = ud.Xb[var2];
					nb var4 = ai.M[var3];
					if (var4 != null) {
						ke.a(var4, var4.pc.tb, 13184);
					}
					
					++var2;
				} while (var2 < tf.n);
				
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ri.D(" + var0 + ')');
		}
	}
	
	static void a(boolean var0) {
		int var4 = client.anInt_wb;
		
		try {
			synchronized (pa.a) {
				label124:
				{
					if (var0) {
						a((byte) -56, (ud) null);
					}
					
					++h.ib;
					nc.b = ic.O;
					int var3;
					if (~qf.N <= -1) {
						if (var4 != 0 || qf.N != kg.f) {
							do {
								var3 = sb.qb[kg.f];
								kg.f = 127 & kg.f - -1;
								if (~var3 > -1) {
									fi.t[~var3] = false;
									if (var4 != 0) {
										fi.t[var3] = true;
									}
								} else {
									fi.t[var3] = true;
								}
							} while (qf.N != kg.f);
						}
						
						if (var4 == 0) {
							break label124;
						}
					}
					
					var3 = 0;
					if (var4 != 0) {
						fi.t[var3] = false;
						++var3;
					}
					
					while (true) {
						if (var3 >= 112) {
							qf.N = kg.f;
							break;
						}
						
						fi.t[var3] = false;
						++var3;
					}
				}
				
				ic.O = pa.h;
			}
			
			++d;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ri.B(" + var0 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			if (var0) {
				a = 120;
			}
			
			k = null;
			hidden2 = null;
			n = null;
			m = null;
			hidden = null;
			f = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ri.E(" + var0 + ')');
		}
	}
	
	static void a(byte var0, ud var1) {
		try {
			if (var1.Qb == bi.f || ~var1.mb == 0 || var1.wb != 0 || ~(var1.cb - -1) < ~le.c(15619, var1.mb).W[var1.Kb]) {
				int var2 = var1.Qb - var1.eb;
				int var3 = -var1.eb + bi.f;
				int var4 = 64 * var1.Gb + var1.Tb * 128;
				int var6 = var1.nb * 128 + 64 * var1.Gb;
				int var5 = var1.W * 128 - -(var1.Gb * 64);
				int var7 = var1.Hb * 128 - -(var1.Gb * 64);
				var1.coordX = ((-var3 + var2) * var4 + var3 * var6) / var2;
				var1.coordY = ((var2 - var3) * var5 + var7 * var3) / var2;
			}
			
			if (var1.ib == 0) {
				var1.U = 1024;
			}
			
			if (var0 <= 71) {
				a((byte) -110, 91);
			}
			
			if (var1.ib == 1) {
				var1.U = 1536;
			}
			
			if (var1.ib == 2) {
				var1.U = 0;
			}
			
			++g;
			if (var1.ib == 3) {
				var1.U = 512;
			}
			
			var1.gb = var1.U;
			var1.rb = 0;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ri.A(" + var0 + ',' + "{...}" + ')');
		}
	}
	
	static boolean a(byte var0, int var1) {
		try {
			++c;
			if (var0 != -65) {
				a((byte) -88, null);
			}
			
			return var1 == (-var1 & var1);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ri.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		hidden2 = hidden;
		m = rf.a(40, "");
		n = rf.a(40, "Lade Eingabe)2Steuerungsprogramm)3)3)3");
	}
}
