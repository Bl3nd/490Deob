import java.awt.FontMetrics;

abstract class ee {
	
	static int a;
	static ob ob_b = rf.a(40, "jlv");
	static ob loadedSprites2;
	static int d;
	static int e;
	static int f;
	static FontMetrics g;
	static int h;
	private static ob loadedSprites = rf.a(40, "Loaded sprites");
	static int j;
	static vc k;
	static rf l;
	static int m;
	static int[] n;
	
	static void a(int var0, int var1, byte var2, int var3, ra var4) {
		try {
			label26:
			{
				if (~se.e > -4) {
					b.V.b(var1, var3, var4.L, var4.w, b.V.imageWidth / 2, b.V.imageHeight / 2, ve.anInt_l, 256, var4.Hb, var4.Wb);
					if (client.anInt_wb == 0) {
						break label26;
					}
				}
				
				oi.a(var1, var3, 0, var4.Hb, var4.Wb);
			}
			
			wf.f[var0] = true;
			++j;
			if (var2 != -9) {
				a(-103, (byte) -83);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ee.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + "{...}" + ')');
		}
	}
	
	static int a(int var0, int var1) {
		try {
			if (var1 != 22511) {
				n = null;
			}
			
			++e;
			return 255 & var0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ee.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(ca class_ca, boolean flag, int cacheId, byte compressionType, int unused, int i, int fileId) {
		try {
			long requestedFileId = (long) ((cacheId << 16) + fileId);
			v class_v = (v) qe.a.a(requestedFileId, 22346);
			++f;
			if (class_v == null) {
				class_v = (v) pe.E.a(requestedFileId, 22346);
				if (class_v == null) {
					class_v = (v) uc.ib.a(requestedFileId, 22346);
					if (class_v != null) {
						if (flag) {
							class_v.a((byte) 122);
							qe.a.a(class_v, requestedFileId, true);
							--jd.b;
							++gh.hb;
						}
					} else {
						if (!flag) {
							class_v = (v) rh.m.a(requestedFileId, 22346);
							if (class_v != null) {
								return;
							}
						}
						class_v = new v();
						class_v.O = compressionType;
						class_v.zb = class_ca;
						class_v.xb = i;
						if (!flag) {
							mg.a.a((byte) -26, class_v);
							uc.ib.a(class_v, requestedFileId, true);
							++jd.b;
						} else {
							qe.a.a(class_v, requestedFileId, true);
							++gh.hb;
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ee.G(" + (class_ca != null ? "{...}" : "null") + ',' + flag + ',' + cacheId + ',' + compressionType + ',' + unused + ',' + i + ',' + fileId + ')');
		}
	}
	
	static ob a(int var0, byte var1) {
		try {
			if (var1 != 8) {
				return null;
			} else {
				++a;
				return wf.e[var0].a(false) > 0 ? wc.a(new ob[] {ca.Nb[var0], tg.k, wf.e[var0]}, var1 ^ -11) : ca.Nb[var0];
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ee.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	abstract byte[] a(int var1);
	
	static void a(int unused, pe cacheFile20, pe cacheFile1, pe cacheFile0) {
		try {
			++d;
			hf.cacheFile0 = cacheFile0;
			ai.cacheFile20 = cacheFile20;
			ai.cacheFile1 = cacheFile1;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ee.A(" + unused + ',' + (cacheFile20 != null ? "{...}" : "null") + ',' + (cacheFile1 != null ? "{...}" : "null") + ',' + (cacheFile0 != null ? "{...}" : "null") + ')');
		}
	}
	
	abstract void a(byte[] var1, int var2);
	
	public static void a(byte var0) {
		try {
			l = null;
			loadedSprites = null;
			n = null;
			ob_b = null;
			loadedSprites2 = null;
			k = null;
			g = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ee.E(" + var0 + ')');
		}
	}
	
	static {
		loadedSprites2 = loadedSprites;
		k = new vc(30);
		m = 0;
		n = new int[128];
		l = new rf(0, 0);
	}
}
