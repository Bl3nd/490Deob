import java.awt.Canvas;

class rg extends vd {
	
	static ob ob_o = rf.a(40, "M");
	static int p;
	static int anInt_q;
	static int anInt_r;
	static int anint_s = 0;
	static Canvas canvas_t;
	rg u;
	static int anInt_v = 0;
	rg w;
	static int x;
	static int y;
	static ph z;
	static int A;
	static ob B = rf.a(40, "welle2:");
	static byte[][][] C;
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void d(int var0) {
		try {
			if (var0 == -9748) {
				synchronized (md.e) {
					if (pi.s == 0) {
						gi.y.a(var0 + 13108, 5, new qg());
					}
					
					pi.s = 600;
				}
				++x;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "rg.IB(" + var0 + ')');
		}
	}
	
	final void a(byte unused) {
		try {
			++A;
			if (this.u != null) {
				this.u.w = this.w;
				this.w.u = this.u;
				this.u = null;
				this.w = null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "rg.KB(" + unused + ')');
		}
	}
	
	static int a(int var0, int var1, int var2, int var3) {
		int var5 = client.anInt_wb;
		
		try {
			int var4 = -91 % ((-18 - var3) / 42);
			++anInt_r;
			if (~var0 < -244) {
				var1 >>= 4;
				if (var5 == 0) {
					return (var0 >> 1) + (var1 >> 5 << 7) + (var2 >> 2 << 10);
				}
			}
			
			if (~var0 < -218) {
				var1 >>= 3;
				if (var5 == 0) {
					return (var0 >> 1) + (var1 >> 5 << 7) + (var2 >> 2 << 10);
				}
			}
			
			if (var0 <= 192) {
				if (~var0 >= -180) {
					return (var0 >> 1) + (var1 >> 5 << 7) + (var2 >> 2 << 10);
				}
				
				var1 >>= 1;
				if (var5 == 0) {
					return (var0 >> 1) + (var1 >> 5 << 7) + (var2 >> 2 << 10);
				}
			}
			
			var1 >>= 2;
			return (var0 >> 1) + (var1 >> 5 << 7) + (var2 >> 2 << 10);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "rg.GB(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, byte var4, int var5, int var6) {
		int var26 = client.anInt_wb;
		
		try {
			++anInt_q;
			sc.a(-16361, var2);
			int var7 = 0;
			int var8 = var2 + -var5;
			int var9 = var2;
			int var10 = -var2;
			if (var8 < 0) {
				var8 = 0;
			}
			
			int var11 = var8;
			int var13 = -1;
			int var12 = -var8;
			int var14 = -1;
			int[] var15 = e.ints_b[var1];
			int var17 = -29 / ((-81 - var4) / 35);
			int var16 = var0 + -var8;
			int var18 = var8 + var0;
			sa.a(var16, (byte) 52, -var2 + var0, var6, var15);
			sa.a(var18, (byte) 52, var16, var3, var15);
			sa.a(var2 + var0, (byte) 52, var18, var6, var15);
			if (var26 != 0 || var2 > var7) {
				do {
					var14 += 2;
					var12 += var14;
					if (var12 >= 0 && ~var11 <= -2) {
						vb.q[var11] = var7;
						--var11;
						var12 -= var11 << 1;
					}
					
					++var7;
					var13 += 2;
					var10 += var13;
					int[] var19;
					int[] var20;
					int var21;
					int var22;
					int var23;
					int var24;
					int var25;
					if (var10 >= 0) {
						label66:
						{
							--var9;
							if (var8 > var9) {
								var19 = e.ints_b[var9 + var1];
								var20 = e.ints_b[var1 + -var9];
								var22 = var0 - -var7;
								var21 = vb.q[var9];
								var23 = -var7 + var0;
								var25 = -var21 + var0;
								var24 = var21 + var0;
								sa.a(var25, (byte) 52, var23, var6, var19);
								sa.a(var24, (byte) 52, var25, var3, var19);
								sa.a(var22, (byte) 52, var24, var6, var19);
								sa.a(var25, (byte) 52, var23, var6, var20);
								sa.a(var24, (byte) 52, var25, var3, var20);
								sa.a(var22, (byte) 52, var24, var6, var20);
								if (var26 == 0) {
									var10 -= var9 << 1;
									break label66;
								}
							}
							
							var19 = e.ints_b[var1 - -var9];
							var21 = var0 + var7;
							var20 = e.ints_b[-var9 + var1];
							var22 = var0 + -var7;
							sa.a(var21, (byte) 52, var22, var6, var19);
							sa.a(var21, (byte) 52, var22, var6, var20);
							var10 -= var9 << 1;
						}
					}
					
					var19 = e.ints_b[var1 - -var7];
					var22 = -var9 + var0;
					var20 = e.ints_b[var1 - var7];
					var21 = var9 + var0;
					if (var7 >= var8) {
						sa.a(var21, (byte) 52, var22, var6, var19);
						sa.a(var21, (byte) 52, var22, var6, var20);
						if (var26 == 0) {
							continue;
						}
					}
					
					var23 = ~var7 >= ~var11 ? var11 : vb.q[var7];
					var24 = var23 + var0;
					var25 = var0 + -var23;
					sa.a(var25, (byte) 52, var22, var6, var19);
					sa.a(var24, (byte) 52, var25, var3, var19);
					sa.a(var21, (byte) 52, var24, var6, var19);
					sa.a(var25, (byte) 52, var22, var6, var20);
					sa.a(var24, (byte) 52, var25, var3, var20);
					sa.a(var21, (byte) 52, var24, var6, var20);
				} while (var9 > var7);
				
			}
		} catch (RuntimeException var27) {
			throw bc.a(var27, "rg.EB(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	static void a(int var0, int var1, byte var2, int var3, int var4) {
		int var15 = client.anInt_wb;
		
		try {
			if (var2 == -26) {
				++y;
				int var5 = 0;
				int var6 = var4;
				int var8 = -1;
				int var9 = kg.a(gh.R, ng.u, true, var1 + var4);
				int var10 = kg.a(gh.R, ng.u, true, -var4 + var1);
				int var7 = -var4;
				sa.a(var9, (byte) 52, var10, var0, e.ints_b[var3]);
				if (var15 != 0 || var4 > var5) {
					do {
						var8 += 2;
						var7 += var8;
						int var11;
						int var12;
						int var13;
						int var14;
						if (var7 > 0) {
							--var6;
							var7 -= var6 << 1;
							var11 = -var6 + var3;
							var12 = var3 + var6;
							if (var12 >= dd.a && ~var11 >= ~na.anInt_m) {
								var13 = kg.a(gh.R, ng.u, true, var1 - -var5);
								var14 = kg.a(gh.R, ng.u, true, var1 - var5);
								if (var12 <= na.anInt_m) {
									sa.a(var13, (byte) 52, var14, var0, e.ints_b[var12]);
								}
								
								if (dd.a <= var11) {
									sa.a(var13, (byte) 52, var14, var0, e.ints_b[var11]);
								}
							}
						}
						
						++var5;
						var12 = var3 + var5;
						var11 = var3 + -var5;
						if (~dd.a >= ~var12 && na.anInt_m >= var11) {
							var13 = kg.a(gh.R, ng.u, true, var6 + var1);
							var14 = kg.a(gh.R, ng.u, true, -var6 + var1);
							if (~na.anInt_m <= ~var12) {
								sa.a(var13, (byte) 52, var14, var0, e.ints_b[var12]);
							}
							
							if (var11 >= dd.a) {
								sa.a(var13, (byte) 52, var14, var0, e.ints_b[var11]);
							}
						}
					} while (var6 > var5);
					
				}
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "rg.JB(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	public static void e(int var0) {
		try {
			C = null;
			z = null;
			if (var0 == 8) {
				ob_o = null;
				B = null;
				canvas_t = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "rg.FB(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, dg var3, int var4) {
		int var10 = client.anInt_wb;
		
		try {
			++p;
			if (le.T != var3) {
				int var5 = -48 / ((-24 - var1) / 36);
				if (si.S < 400) {
					ob var6;
					label110:
					{
						if (~var3.qc != -1) {
							var6 = wc.a(new ob[] {var3.Ic, ue.db, n.i, hh.a((byte) 93, var3.qc), ji.G}, -3);
							if (var10 == 0) {
								break label110;
							}
						}
						
						var6 = wc.a(new ob[] {var3.Ic, qg.a(le.T.Cc, var3.Cc, false), ue.db, bg.ob_c, hh.a((byte) 93, var3.Cc), ji.G}, -3);
					}
					
					int var7;
					label118:
					{
						if (ch.cb == 1) {
							ge.a(wc.a(new ob[] {s.R, sb.jb, var6}, -3), fh.h, 0, (short) 41, (long) var4, var2, var0);
							++tg.c;
							if (var10 == 0) {
								break label118;
							}
						}
						
						if (!g.O) {
							var7 = 7;
							if (var10 != 0 || ~var7 <= -1) {
								do {
									if (gg.o[var7] == null) {
										--var7;
									} else {
										short var8;
										label82:
										{
											++v.ub;
											var8 = 0;
											boolean var9 = false;
											if (~qa.F == -1 && gg.o[var7].b((byte) -77, ch.attack2)) {
												if (~var3.Cc < ~le.T.Cc) {
													var8 = 2000;
												}
												
												if (le.T.Kc == 0 || var3.Kc == 0) {
													break label82;
												}
												
												if (var3.Kc == le.T.Kc) {
													var8 = 2000;
													if (var10 == 0) {
														break label82;
													}
												}
												
												var8 = 0;
												if (var10 == 0) {
													break label82;
												}
											}
											
											if (fh.c[var7]) {
												var8 = 2000;
											}
										}
										
										short var12 = bg.i[var7];
										var12 += var8;
										ge.a(wc.a(new ob[] {ff.Q, var6}, -3), gg.o[var7], 0, var12, (long) var4, var2, var0);
										--var7;
									}
								} while (~var7 <= -1);
							}
							
							if (var10 == 0) {
								break label118;
							}
						}
						
						if ((8 & lb.ub) == 8) {
							ge.a(wc.a(new ob[] {sf.g, sb.jb, var6}, -3), ac.s, 0, (short) 42, (long) var4, var2, var0);
							++md.c;
						}
					}
					
					var7 = 0;
					if (var10 != 0 || ~var7 > ~si.S) {
						do {
							if (~ph.i[var7] == -44) {
								wf.e[var7] = wc.a(new ob[] {ff.Q, var6}, -3);
								return;
							}
							
							++var7;
						} while (~var7 > ~si.S);
						
					}
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "rg.HB(" + var0 + ',' + var1 + ',' + var2 + ',' + "{...}" + ',' + var4 + ')');
		}
	}
}
