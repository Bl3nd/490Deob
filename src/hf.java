import java.awt.Font;

final class hf {
	
	private static ob a = rf.a(40, "Wed");
	static ob b;
	static int c;
	int anInt_d;
	static volatile long aLong_e = 0L;
	static int f;
	static int anInt_g;
	int h;
	int i;
	int j;
	static vc k;
	static ob[] l;
	int anInt_m;
	private static ob ob_n = rf.a(40, "Thu");
	private static ob o;
	private static ob p = rf.a(40, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
	boolean aBoolean_q = true;
	private static ob r = rf.a(40, "Tue");
	private static ob ob_s = rf.a(40, "Sun");
	private static ob t = rf.a(40, "Sat");
	static int u;
	private static ob v = rf.a(40, "Fri");
	int w;
	static ob x;
	static pe cacheFile0;
	static short[] z;
	private static ob A;
	static ob B;
	static pi[][][] C;
	static ob started3DLibrary2;
	private static ob started3DLibrary;
	static Font F;
	private static ob G;
	
	public static void a(int var0) {
		try {
			G = null;
			if (var0 != -16225) {
				z = null;
			}
			
			started3DLibrary = null;
			started3DLibrary2 = null;
			l = null;
			ob_n = null;
			v = null;
			t = null;
			F = null;
			p = null;
			cacheFile0 = null;
			B = null;
			A = null;
			z = null;
			a = null;
			o = null;
			r = null;
			b = null;
			ob_s = null;
			C = null;
			k = null;
			x = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hf.C(" + var0 + ')');
		}
	}
	
	static boolean a(int var0, int var1) {
		try {
			++u;
			return var0 < 64 ? true : (1 & var1 >> 30) != 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hf.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, aa var4, long var5, boolean var7) {
		if (var4 != null) {
			me var8 = new me();
			var8.c = var4;
			var8.j = var1 * 128 + 64;
			var8.i = var2 * 128 + 64;
			var8.anInt_m = var3;
			var8.o = var5;
			if (nb.oc[var0][var1][var2] == null) {
				nb.oc[var0][var1][var2] = new pd(var0, var1, var2);
			}
			
			nb.oc[var0][var1][var2].u = var8;
		}
	}
	
	static void b(int var0, int var1) {
		try {
			++f;
			if (gf.a(true, var0)) {
				lf.a(wg.cb[var0], -1, -121);
				if (var1 > -82) {
					a(-109, (int) 83);
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hf.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, byte var1) {
		try {
			++c;
			if (var0 >= 0) {
				int var2 = ae.Rb[var0];
				int var3 = nd.i[var0];
				if (var1 != -37) {
					a(-101, (int) -46);
				}
				
				int var5 = (int) qb.G[var0];
				long var6 = qb.G[var0];
				int var4 = ph.i[var0];
				if (~var4 <= -2001) {
					var4 -= 2000;
				}
				
				if (var4 == 10) {
					++mc.F;
					af.P.p(61, 12885);
					af.P.e(var3, 1198513704);
					af.P.d(26894, var5);
					af.P.d(26894, var2);
					ja.u = 0;
					tb.l = tc.b(var3, (int) -118);
					bf.W = var2;
				}
				
				if (var4 == 8) {
					++nf.db;
					af.P.p(210, 12885);
					af.P.d(26894, var2);
					af.P.m(-112, var5);
					af.P.b(var3, -2100837416);
					ja.u = 0;
					tb.l = tc.b(var3, (int) -121);
					bf.W = var2;
				}
				
				dg var8;
				if (var4 == 6) {
					var8 = lg.j[var5];
					if (var8 != null) {
						++pc.anInt_e;
						qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -117, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						jh.h = ia.eb;
						af.t = tf.m;
						ai.wb = 0;
						jc.anInt_ib = 2;
						af.P.p(35, 12885);
						af.P.k(-99, var5);
					}
				}
				
				if (var4 == 46) {
					++ra.Pb;
					md.a(var2, var6, 11, var3);
					af.P.p(69, 12885);
					af.P.k(-102, ic.entityYPosition + var3);
					af.P.m(106, ic.entityXPosition + var2);
					af.P.i(-123, (int) (var6 >>> 32) & Integer.MAX_VALUE);
				}
				
				nb var11;
				if (var4 == 11) {
					var11 = ai.M[var5];
					if (var11 != null) {
						++ib.g;
						qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 40, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						jh.h = ia.eb;
						ai.wb = 0;
						af.t = tf.m;
						jc.anInt_ib = 2;
						af.P.p(65, var1 + 12922);
						af.P.d(26894, var5);
					}
				}
				
				if (~var4 == -43) {
					var8 = lg.j[var5];
					if (var8 != null) {
						++ih.r;
						qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -117, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						jc.anInt_ib = 2;
						ai.wb = 0;
						af.t = tf.m;
						jh.h = ia.eb;
						af.P.p(157, var1 + 12922);
						af.P.writeInt_V2(pi.k, false);
						af.P.m(35, mi.S);
						af.P.m(-120, var5);
					}
				}
				
				if (~var4 == -31) {
					var8 = lg.j[var5];
					if (var8 != null) {
						qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) 45, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						ai.wb = 0;
						++hi.n;
						jc.anInt_ib = 2;
						jh.h = ia.eb;
						af.t = tf.m;
						af.P.p(247, 12885);
						af.P.i(-109, var5);
					}
				}
				
				ra var12;
				if (var4 == 3) {
					dd.b(var1 + -87);
					var12 = tc.b(var3, (int) -65);
					ae.Mb = var2;
					nc.c = var5;
					be.b = var3;
					ch.cb = 1;
					dg.a(var12, -80);
					s.R = wc.a(new ob[] {le.cb, jg.a((byte) -61, var5).name, ff.Q}, var1 + 34);
					if (s.R == null) {
						s.R = wg.jb;
					}
					
				} else {
					if (~var4 == -24) {
						md.a(var2, var6, 11, var3);
						af.P.p(233, 12885);
						++gh.fb;
						af.P.m(63, var2 - -ic.entityXPosition);
						af.P.d(26894, (int) (var6 >>> 32) & Integer.MAX_VALUE);
						af.P.d(26894, ic.entityYPosition + var3);
					}
					
					if (var4 == 31) {
						++qc.y;
						af.P.p(47, 12885);
						af.P.m(50, var5);
						af.P.writeInt_V2(var3, false);
						af.P.d(26894, var2);
						ja.u = 0;
						tb.l = tc.b(var3, (int) -64);
						bf.W = var2;
					}
					
					if (var4 == 1004) {
						jc.anInt_ib = 2;
						++n.f;
						jh.h = ia.eb;
						ai.wb = 0;
						af.t = tf.m;
						af.P.p(191, 12885);
						af.P.i(var1 ^ 85, var5);
					}
					
					if (var4 == 14) {
						var11 = ai.M[var5];
						if (var11 != null) {
							qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 114, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							af.t = tf.m;
							ai.wb = 0;
							++m.o;
							jc.anInt_ib = 2;
							jh.h = ia.eb;
							af.P.p(245, 12885);
							af.P.d(26894, ae.Mb);
							af.P.d(26894, var5);
							af.P.k(-125, nc.c);
							af.P.writeInt_V2(be.b, false);
						}
					}
					
					if (var4 == 7) {
						++cc.R;
						af.P.p(118, 12885);
						af.P.b(var3, -2100837416);
						af.P.m(60, var5);
						af.P.d(26894, var2);
						ja.u = 0;
						tb.l = tc.b(var3, var1 ^ 104);
						bf.W = var2;
					}
					
					if (~var4 == -1002) {
						label394:
						{
							var12 = tc.b(var3, (int) -85);
							if (var12 == null || var12.fb[var2] < 100000) {
								++dg.ic;
								af.P.p(59, var1 + 12922);
								af.P.i(var1 ^ 74, var5);
								if (client.anInt_wb == 0) {
									break label394;
								}
							}
							
							nb.a(0, (byte) -107, lb.T, wc.a(new ob[] {hh.a((byte) 93, var12.fb[var2]), jh.f, jg.a((byte) -61, var5).name}, var1 + 34));
						}
						
						ja.u = 0;
						tb.l = tc.b(var3, var1 + -45);
						bf.W = var2;
					}
					
					if (~var4 == -25) {
						var11 = ai.M[var5];
						if (var11 != null) {
							qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 102, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							++rf.B;
							ai.wb = 0;
							jc.anInt_ib = 2;
							af.t = tf.m;
							jh.h = ia.eb;
							af.P.p(49, 12885);
							af.P.k(var1 ^ 67, var5);
						}
					}
					
					if (var4 == 1002) {
						ai.wb = 0;
						af.t = tf.m;
						jh.h = ia.eb;
						jc.anInt_ib = 2;
						var11 = ai.M[var5];
						if (var11 != null) {
							ai var9 = var11.pc;
							if (var9.lb != null) {
								var9 = var9.b((byte) 121);
							}
							
							if (var9 != null) {
								++ag.h;
								af.P.p(22, var1 + 12922);
								af.P.m(-123, var9.J);
							}
						}
					}
					
					if (~var4 == -6 && md.a(var2, var6, 11, var3)) {
						++me.k;
						af.P.p(239, var1 + 12922);
						af.P.d(26894, (int) (var6 >>> 32) & Integer.MAX_VALUE);
						af.P.i(-128, var3 + ic.entityYPosition);
						af.P.m(var1 + 50, ic.entityXPosition + var2);
						af.P.writeInt(pi.k, (byte) -18);
						af.P.i(-128, mi.S);
					}
					
					if (var4 == 4) {
						af.P.p(106, 12885);
						af.P.k(-111, var2);
						af.P.d(var1 + 26931, var5);
						af.P.writeInt(var3, (byte) -18);
						ja.u = 0;
						++vf.q;
						tb.l = tc.b(var3, var1 + -86);
						bf.W = var2;
					}
					
					if (~var4 == -52) {
						md.a(var2, var6, 11, var3);
						++nf.Z;
						af.P.p(87, var1 + 12922);
						af.P.m(-111, var2 - -ic.entityXPosition);
						af.P.i(-120, Integer.MAX_VALUE & (int) (var6 >>> 32));
						af.P.d(26894, ic.entityYPosition + var3);
					}
					
					if (var4 == 15 || ~var4 == -1004) {
						re.a(var1 + 23465, var2, var3, var5, wf.e[var0]);
					}
					
					if (~var4 == -38) {
						var11 = ai.M[var5];
						if (var11 != null) {
							qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 36, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							af.t = tf.m;
							jh.h = ia.eb;
							++hb.o;
							ai.wb = 0;
							jc.anInt_ib = 2;
							af.P.p(171, 12885);
							af.P.i(var1 + -65, var5);
						}
					}
					
					boolean var15;
					if (~var4 == -49) {
						++wg.kb;
						var15 = qc.a(2, 0, var2, var3, (byte) -116, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
						if (!var15) {
							qc.a(2, 1, var2, var3, (byte) -116, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
						}
						
						af.t = tf.m;
						ai.wb = 0;
						jc.anInt_ib = 2;
						jh.h = ia.eb;
						af.P.p(7, 12885);
						af.P.k(-120, ic.entityYPosition + var3);
						af.P.m(46, var5);
						af.P.k(var1 + -56, var2 + ic.entityXPosition);
					}
					
					if (var4 == 28) {
						af.P.p(139, 12885);
						af.P.writeInt_V2(var3, false);
						++df.y;
						af.P.k(var1 ^ 92, var2);
						af.P.k(-121, var5);
						ja.u = 0;
						tb.l = tc.b(var3, (int) -78);
						bf.W = var2;
					}
					
					if (~var4 == -37) {
						var12 = ue.a(var2, (byte) 56, var3);
						if (var12 != null) {
							dd.b(var1 + -89);
							ae.a(var3, fc.a(ce.a(var12, 18125), false), var2, (byte) 69);
							ch.cb = 0;
							ac.s = e.a((byte) -11, var12);
							if (ac.s == null) {
								ac.s = qf.M;
							}
							
							if (!var12.R) {
								sf.g = wc.a(new ob[] {th.T, var12.Bb, ff.Q}, -3);
								return;
							}
							
							sf.g = wc.a(new ob[] {var12.Mb, ff.Q}, -3);
						}
						
					} else {
						if (~var4 == -59) {
							++fb.W;
							af.P.p(199, var1 + 12922);
							af.P.k(-91, var2);
							af.P.writeInt_V2(var3, false);
							af.P.m(var1 + 106, var5);
							ja.u = 0;
							tb.l = tc.b(var3, (int) -126);
							bf.W = var2;
						}
						
						if (var4 == 43) {
							uc.d(gf.G, var2, var3);
						}
						
						int var13;
						if (var4 == 25) {
							++wg.hb;
							af.P.p(218, 12885);
							af.P.writeInt(var3, (byte) -33);
							var12 = tc.b(var3, (int) -112);
							if (var12.M != null && var12.M[0][0] == 5) {
								var13 = var12.M[0][1];
								if (sa.c[var13] != var12.Lc[0]) {
									sa.c[var13] = var12.Lc[0];
									gi.a((byte) -122, var13);
								}
							}
						}
						
						if (var4 == 38) {
							++pc.j;
							var15 = qc.a(2, 0, var2, var3, (byte) -118, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) 83, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							af.t = tf.m;
							jc.anInt_ib = 2;
							jh.h = ia.eb;
							ai.wb = 0;
							af.P.p(8, 12885);
							af.P.d(var1 ^ -26923, var5);
							af.P.m(-115, ic.entityXPosition + var2);
							af.P.k(-94, ae.Mb);
							af.P.b(be.b, -2100837416);
							af.P.m(var1 ^ -108, nc.c);
							af.P.k(-117, var3 + ic.entityYPosition);
						}
						
						if (~var4 == -23) {
							++md.b;
							af.P.p(234, 12885);
							af.P.b(pi.k, -2100837416);
							af.P.writeInt_V2(var3, false);
							af.P.m(-114, mi.S);
							af.P.d(26894, var2);
						}
						
						if (var4 == 21) {
							++s.Y;
							af.P.p(56, 12885);
							af.P.writeInt_V2(var3, false);
							af.P.d(26894, ae.Mb);
							af.P.i(var1 + -81, nc.c);
							af.P.e(be.b, 1198513704);
							af.P.k(-103, var5);
							af.P.i(var1 + -80, var2);
							ja.u = 0;
							tb.l = tc.b(var3, (int) -123);
							bf.W = var2;
						}
						
						if (var4 == 12) {
							ta.g(var1 + 108015605);
						}
						
						if (~var4 == -50) {
							af.P.p(36, 12885);
							af.P.k(-91, var2);
							++q.gb;
							af.P.e(var3, 1198513704);
							af.P.d(26894, var5);
							ja.u = 0;
							tb.l = tc.b(var3, (int) -107);
							bf.W = var2;
						}
						
						if (~var4 == -2) {
							++d.M;
							af.P.p(143, 12885);
							af.P.i(var1 + -79, var2);
							af.P.e(var3, 1198513704);
							af.P.d(26894, var5);
							ja.u = 0;
							tb.l = tc.b(var3, var1 ^ 17);
							bf.W = var2;
						}
						
						if (~var4 == -19) {
							var11 = ai.M[var5];
							if (var11 != null) {
								qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 97, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								jh.h = ia.eb;
								jc.anInt_ib = 2;
								af.t = tf.m;
								ai.wb = 0;
								af.P.p(86, 12885);
								af.P.k(var1 + -90, var5);
								++ud.db;
							}
						}
						
						if (~var4 == -3) {
							var8 = lg.j[var5];
							if (var8 != null) {
								++ii.t;
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) 85, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								af.t = tf.m;
								jh.h = ia.eb;
								ai.wb = 0;
								jc.anInt_ib = 2;
								af.P.p(32, var1 + 12922);
								af.P.k(-127, var5);
							}
						}
						
						if (~var4 == -40) {
							var12 = tc.b(var3, (int) -64);
							boolean var14 = true;
							if (~var12.ab < -1) {
								var14 = li.a(var12, false);
							}
							
							if (var14) {
								++wg.hb;
								af.P.p(218, 12885);
								af.P.writeInt((int) var3, (byte) 90);
							}
						}
						
						if (var4 == 57) {
							++ob.k;
							var15 = qc.a(2, 0, var2, var3, (byte) -110, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) 78, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							jh.h = ia.eb;
							ai.wb = 0;
							af.t = tf.m;
							jc.anInt_ib = 2;
							af.P.p(216, 12885);
							af.P.m(66, var5);
							af.P.d(26894, ic.entityYPosition + var3);
							af.P.i(-127, ic.entityXPosition + var2);
						}
						
						if (var4 == 1005) {
							jc.anInt_ib = 2;
							ai.wb = 0;
							jh.h = ia.eb;
							af.t = tf.m;
							af.P.p(59, 12885);
							af.P.i(-105, var5);
							++dg.ic;
						}
						
						if (~var4 == -17) {
							var8 = lg.j[var5];
							if (var8 != null) {
								++li.anInt_m;
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) 9, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								ai.wb = 0;
								jh.h = ia.eb;
								jc.anInt_ib = 2;
								af.t = tf.m;
								af.P.p(232, var1 ^ -12914);
								af.P.m(-112, var5);
							}
						}
						
						if (var4 == 47 && md.a(var2, var6, 11, var3)) {
							++ra.rb;
							af.P.p(148, 12885);
							af.P.i(-120, var3 + ic.entityYPosition);
							af.P.d(26894, (int) (var6 >>> 32) & Integer.MAX_VALUE);
							af.P.k(-98, ic.entityXPosition + var2);
							af.P.k(var1 + -77, ae.Mb);
							af.P.e(be.b, var1 + 1198513741);
							af.P.k(-103, nc.c);
						}
						
						if (~var4 == -46) {
							++ng.D;
							var15 = qc.a(2, 0, var2, var3, (byte) 65, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) 81, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							jh.h = ia.eb;
							ai.wb = 0;
							af.t = tf.m;
							jc.anInt_ib = 2;
							af.P.p(211, 12885);
							af.P.d(26894, var3 - -ic.entityYPosition);
							af.P.i(var1 ^ 85, var2 - -ic.entityXPosition);
							af.P.i(-120, var5);
						}
						
						if (var4 == 32) {
							var11 = ai.M[var5];
							if (var11 != null) {
								qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) -110, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								++oh.Q;
								jc.anInt_ib = 2;
								ai.wb = 0;
								af.t = tf.m;
								jh.h = ia.eb;
								af.P.p(189, var1 + 12922);
								af.P.writeInt_V2(pi.k, false);
								af.P.i(-121, mi.S);
								af.P.i(-123, var5);
							}
						}
						
						if (~var4 == -36 && sb.Z == null) {
							fg.a(var2, var3, (byte) 119);
							sb.Z = ue.a(var2, (byte) 56, var3);
							dg.a(sb.Z, -97);
						}
						
						if (var4 == 40) {
							var8 = lg.j[var5];
							if (var8 != null) {
								++ic.db;
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -126, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								jh.h = ia.eb;
								ai.wb = 0;
								af.t = tf.m;
								jc.anInt_ib = 2;
								af.P.p(90, 12885);
								af.P.i(-112, var5);
							}
						}
						
						if (~var4 == -18) {
							md.a(var2, var6, 11, var3);
							++hc.q;
							af.P.p(217, 12885);
							af.P.d(26894, (int) (var6 >>> 32) & Integer.MAX_VALUE);
							af.P.i(var1 ^ 77, var3 - -ic.entityYPosition);
							af.P.d(26894, ic.entityXPosition + var2);
						}
						
						if (var4 == 41) {
							var8 = lg.j[var5];
							if (var8 != null) {
								++bi.c;
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -109, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								af.t = tf.m;
								jc.anInt_ib = 2;
								ai.wb = 0;
								jh.h = ia.eb;
								af.P.p(229, 12885);
								af.P.i(-125, var5);
								af.P.d(26894, nc.c);
								af.P.writeInt_V2(be.b, false);
								af.P.m(-114, ae.Mb);
							}
						}
						
						if (~var4 == -21) {
							++na.I;
							af.P.p(98, var1 + 12922);
							af.P.b(var3, -2100837416);
							af.P.k(var1 ^ 85, var2);
							af.P.e(pi.k, var1 ^ -1198513677);
							af.P.i(-118, mi.S);
							af.P.k(var1 + -85, var5);
							ja.u = 0;
							tb.l = tc.b(var3, (int) -74);
							bf.W = var2;
						}
						
						if (var4 == 1007) {
							++wc.I;
							md.a(var2, var6, 11, var3);
							af.P.p(119, 12885);
							af.P.d(26894, var2 + ic.entityXPosition);
							af.P.i(var1 ^ 91, (int) (var6 >>> 32) & Integer.MAX_VALUE);
							af.P.m(var1 + 75, var3 - -ic.entityYPosition);
						}
						
						if (~var4 == -30) {
							var8 = lg.j[var5];
							if (var8 != null) {
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -124, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								jh.h = ia.eb;
								++re.F;
								jc.anInt_ib = 2;
								af.t = tf.m;
								ai.wb = 0;
								af.P.p(78, 12885);
								af.P.i(-108, var5);
							}
						}
						
						if (~var4 == -51) {
							af.P.p(218, 12885);
							af.P.writeInt((int) var3, (byte) 113);
							++wg.hb;
							var12 = tc.b(var3, var1 ^ 79);
							if (var12.M != null && var12.M[0][0] == 5) {
								var13 = var12.M[0][1];
								sa.c[var13] = -sa.c[var13] + 1;
								gi.a((byte) -102, var13);
							}
						}
						
						if (~var4 == -27) {
							++cf.ab;
							var15 = qc.a(2, 0, var2, var3, (byte) 61, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) -120, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							ai.wb = 0;
							af.t = tf.m;
							jc.anInt_ib = 2;
							jh.h = ia.eb;
							af.P.p(42, 12885);
							af.P.writeInt((int) pi.k, (byte) 55);
							af.P.i(-122, var2 - -ic.entityXPosition);
							af.P.k(var1 ^ 123, var3 - -ic.entityYPosition);
							af.P.d(26894, mi.S);
							af.P.i(-106, var5);
						}
						
						if (~var4 == -45) {
							var8 = lg.j[var5];
							if (var8 != null) {
								++uc.Z;
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) -106, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								ai.wb = 0;
								jh.h = ia.eb;
								af.t = tf.m;
								jc.anInt_ib = 2;
								af.P.p(200, 12885);
								af.P.i(-124, var5);
							}
						}
						
						if (~var4 == -35) {
							var15 = qc.a(2, 0, var2, var3, (byte) -115, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) 109, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							jh.h = ia.eb;
							ai.wb = 0;
							jc.anInt_ib = 2;
							++le.Y;
							af.t = tf.m;
							af.P.p(224, 12885);
							af.P.i(var1 + -74, var5);
							af.P.k(-126, var3 - -ic.entityYPosition);
							af.P.k(-98, var2 + ic.entityXPosition);
						}
						
						if (~var4 == -10) {
							var11 = ai.M[var5];
							if (var11 != null) {
								++ff.gb;
								qc.a(2, 1, var11.regionLocalX[0], var11.regionLocalY[0], (byte) 36, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								jc.anInt_ib = 2;
								jh.h = ia.eb;
								af.t = tf.m;
								ai.wb = 0;
								af.P.p(188, 12885);
								af.P.m(57, var5);
							}
						}
						
						if (var4 == 19) {
							var8 = lg.j[var5];
							if (var8 != null) {
								qc.a(2, 1, var8.regionLocalX[0], var8.regionLocalY[0], (byte) 89, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
								jc.anInt_ib = 2;
								af.t = tf.m;
								jh.h = ia.eb;
								ai.wb = 0;
								++be.c;
								af.P.p(37, 12885);
								af.P.k(-108, var5);
							}
						}
						
						if (var4 == 33) {
							af.P.p(174, 12885);
							af.P.writeInt_V2(var3, false);
							++vf.t;
							af.P.d(26894, var5);
							af.P.k(var1 ^ 67, var2);
							ja.u = 0;
							tb.l = tc.b(var3, (int) -87);
							bf.W = var2;
						}
						
						if (var4 == 13) {
							var15 = qc.a(2, 0, var2, var3, (byte) -127, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
							++se.l;
							if (!var15) {
								qc.a(2, 1, var2, var3, (byte) 94, false, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 1);
							}
							
							af.t = tf.m;
							jc.anInt_ib = 2;
							ai.wb = 0;
							jh.h = ia.eb;
							af.P.p(180, 12885);
							af.P.m(3, ic.entityYPosition + var3);
							af.P.k(-107, var5);
							af.P.i(-117, ic.entityXPosition + var2);
						}
						
						if (~ch.cb != -1) {
							ch.cb = 0;
							dg.a(tc.b(be.b, (int) -88), -110);
						}
						
						if (g.O) {
							dd.b(-107);
						}
						
						if (tb.l != null && ~ja.u == -1) {
							dg.a(tb.l, -106);
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "hf.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	hf(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		try {
			this.aBoolean_q = var7;
			this.h = var6;
			this.anInt_m = var4;
			this.i = var5;
			this.j = var2;
			this.anInt_d = var1;
			this.w = var3;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "hf.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	static {
		b = p;
		o = rf.a(40, "Mon");
		l = new ob[] {ob_s, o, r, a, ob_n, v, t};
		k = new vc(260);
		C = new pi[4][104][104];
		started3DLibrary = rf.a(40, "Started 3d library");
		G = rf.a(40, "Please wait)3)3)3");
		A = rf.a(40, "Select a world");
		x = G;
		started3DLibrary2 = started3DLibrary;
		B = A;
	}
}
