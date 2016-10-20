import java.io.IOException;

final class li {
	
	int anInt_a = -1;
	static int b;
	static int c;
	static int d;
	static pe cacheFile17;
	static int f;
	static byte[][][] g;
	static boolean members = false;
	static ob i = rf.a(40, ")1p");
	static int j;
	oh k;
	static int[] ints_l = new int[4000];
	static int anInt_m;
	static pe cacheFile7;
	static int o;
	int[] p;
	static boolean aBoolean_q = false;
	ob[] r;
	
	static int a(int var0, int var1) {
		try {
			++o;
			if (var1 != -56441588) {
				return -37;
			} else {
				int var2 = (var0 * var0 >> 12) * var0 >> 12;
				int var3 = -61440 + 6 * var0;
				int var4 = (var0 * var3 >> 12) + 'ꀀ';
				return var4 * var2 >> 12;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "li.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int var0) {
		int var12 = client.anInt_wb;
		
		try {
			++b;
			if (~ei.anInt_sb < -1) {
				--ei.anInt_sb;
			}
			
			if (kg.a > 1) {
				--kg.a;
			}
			
			if (gf.x) {
				gf.x = false;
				ac.dropClient(25005);
			} else {
				int var1 = 0;
				if (var12 != 0 || var1 < 100) {
					while (ic.a(false) || var12 != 0) {
						++var1;
						if (var1 >= 100) {
							break;
						}
					}
				}
				
				if (~qb.gameState == -31) {
					gi.a((byte) -69, 99, af.P);
					int var4;
					int var5;
					int var6;
					int var7;
					int var8;
					synchronized (df.B.f) {
						label1198:
						{
							if (sf.f) {
								if (~qe.k == -1 && df.B.x < 40) {
									break label1198;
								}
								
								af.P.p(101, 12885);
								++l.i;
								af.P.writeByte(103, 0);
								var4 = af.P.pointer;
								var5 = 0;
								var6 = 0;
								if (var12 != 0 || df.B.x > var6) {
									while (-var4 + af.P.pointer < 240) {
										var7 = df.B.v[var6];
										++var5;
										if (var7 >= 0) {
											if (~var7 < -503) {
												var7 = 502;
												if (var12 != 0) {
													var7 = 0;
												}
											}
										} else {
											var7 = 0;
										}
										
										var8 = df.B.y[var6];
										if (var8 < 0) {
											var8 = 0;
											if (var12 != 0 && ~var8 < -765) {
												var8 = 764;
											}
										} else if (~var8 < -765) {
											var8 = 764;
										}
										
										int var9 = var8 + 765 * var7;
										if (~df.B.v[var6] == 0 && df.B.y[var6] == -1) {
											var9 = 524287;
											var8 = -1;
											var7 = -1;
										}
										
										label1227:
										{
											if (~var8 == ~m.D && ~var7 == ~bc.fb) {
												if (ff.R >= 2047) {
													++var6;
													break label1227;
												}
												
												++ff.R;
												if (var12 == 0) {
													++var6;
													break label1227;
												}
											}
											
											int var10 = var8 + -m.D;
											m.D = var8;
											int var11 = -bc.fb + var7;
											bc.fb = var7;
											if (ff.R < 8 && ~var10 <= 31 && var10 <= 31 && ~var11 <= 31 && var11 <= 31) {
												var11 += 32;
												var10 += 32;
												af.P.d(26894, (ff.R << 12) - -(var10 << 6) - -var11);
												ff.R = 0;
												if (var12 == 0) {
													++var6;
													break label1227;
												}
											}
											
											if (ff.R < 8) {
												af.P.writeMedInt(-105, 8388608 + (ff.R << 19) + var9);
												ff.R = 0;
												if (var12 != 0) {
													af.P.writeInt((int) (var9 + (ff.R << 19) + -1073741824), (byte) 61);
													ff.R = 0;
													++var6;
												} else {
													++var6;
												}
											} else {
												af.P.writeInt((int) (var9 + (ff.R << 19) + -1073741824), (byte) 61);
												ff.R = 0;
												++var6;
											}
										}
										
										if (df.B.x <= var6) {
											break;
										}
									}
								}
								
								af.P.c(af.P.pointer + -var4, (byte) 17);
								if (~var5 > ~df.B.x) {
									df.B.x -= var5;
									var7 = 0;
									if (var12 == 0 && var7 >= df.B.x) {
										if (var12 == 0) {
											break label1198;
										}
									} else {
										while (true) {
											df.B.y[var7] = df.B.y[var5 + var7];
											df.B.v[var7] = df.B.v[var5 + var7];
											++var7;
											if (var7 >= df.B.x) {
												if (var12 == 0) {
													break label1198;
												}
												break;
											}
										}
									}
								}
								
								df.B.x = 0;
								if (var12 == 0) {
									break label1198;
								}
							}
							
							df.B.x = 0;
						}
					}
					
					
					if (~qe.k != -1) {
						++ia.U;
						var4 = tf.m;
						if (~var4 <= -1) {
							if (var4 > 502) {
								var4 = 502;
							}
						} else {
							var4 = 0;
						}
						
						var5 = ia.eb;
						long var19 = (dg.wc + -ff.db) / 50L;
						if (var19 > 4095L) {
							var19 = 4095L;
						}
						
						byte var26 = 0;
						var8 = (int) var19;
						ff.db = dg.wc;
						if (~qe.k == -3) {
							var26 = 1;
						}
						
						af.P.p(91, 12885);
						if (var5 >= 0) {
							if (var5 > 764) {
								var5 = 764;
							}
						} else {
							var5 = 0;
						}
						
						var6 = var5 + 765 * var4;
						af.P.writeInt_V2((var8 << 20) + ((var26 << 19)+ var6), false);
					}
					
					if (fi.t[96] || fi.t[97] || fi.t[98] || fi.t[99]) {
						bc.Z = true;
					}
					
					if (rh.o > 0) {
						--rh.o;
					}
					
					if (bc.Z && rh.o <= 0) {
						bc.Z = false;
						rh.o = 20;
						++qa.H;
						af.P.p(60, 12885);
						af.P.d(26894, pe.ab);
						af.P.i(-126, ve.anInt_l);
					}
					
					if (lb.nb && !qc.D) {
						++sf.l;
						qc.D = true;
						af.P.p(153, 12885);
						af.P.writeByte(90, 1);
					}
					
					if (!lb.nb && qc.D) {
						qc.D = false;
						af.P.p(153, 12885);
						af.P.writeByte(97, 0);
						++sf.l;
					}
					
					qh.a(0);
					if (qb.gameState == 30) {
						sa.a((byte) 94);
						m.b((byte) 68);
						++ed.anInt_g;
						if (ed.anInt_g > 750) {
							ac.dropClient(25005);
						} else {
							lh.b(true);
							ri.a((byte) 115);
							ni.j(-114);
							++dc.k;
							if (jc.anInt_ib != 0) {
								ai.wb += 20;
								if (ai.wb >= 400) {
									jc.anInt_ib = 0;
								}
							}
							
							if (tb.l != null) {
								++ja.u;
								if (~ja.u <= -16) {
									dg.a(tb.l, -105);
									tb.l = null;
								}
							}
							
							if (og.ub != null) {
								dg.a(og.ub, -97);
								++bd.I;
								if (og.o > ee.m - -5 || ee.m - 5 > og.o || ~(5 + id.s) > ~re.u || ~re.u > ~(-5 + id.s)) {
									wa.p = true;
								}
								
								if (mf.S == 0) {
									label1258:
									{
										if (wa.p && ~bd.I <= -6) {
											if (ib.f != og.ub || ~re.G == ~wa.w) {
												break label1258;
											}
											
											++oh.I;
											ra var20 = og.ub;
											byte var3 = 0;
											if (ri.a == 1 && ~var20.ab == -207) {
												var3 = 1;
											}
											
											if (var20.ints_tc[wa.w] <= 0) {
												var3 = 0;
											}
											
											label1232:
											{
												if (se.a(ce.a(var20, 18125), (byte) 52)) {
													var5 = wa.w;
													var4 = re.G;
													var20.ints_tc[var5] = var20.ints_tc[var4];
													var20.fb[var5] = var20.fb[var4];
													var20.ints_tc[var4] = -1;
													var20.fb[var4] = 0;
													if (var12 == 0) {
														break label1232;
													}
												}
												
												if (~var3 != -2) {
													var20.a(Integer.MIN_VALUE, re.G, wa.w);
													if (var12 == 0) {
														break label1232;
													}
												}
												
												var4 = re.G;
												var5 = wa.w;
												if (var12 != 0 || var5 != var4) {
													do {
														if (~var5 <= ~var4) {
															if (~var4 > ~var5) {
																var20.a(Integer.MIN_VALUE, var4, 1 + var4);
																++var4;
																if (var12 != 0) {
																	var20.a(Integer.MIN_VALUE, var4, var4 - 1);
																	--var4;
																}
															}
														} else {
															var20.a(Integer.MIN_VALUE, var4, var4 - 1);
															--var4;
														}
													} while (var5 != var4);
												}
											}
											
											af.P.p(107, 12885);
											af.P.writeInt_V2(og.ub.Ec, false);
											af.P.a((byte) -72, (int) var3);
											af.P.i(-128, wa.w);
											af.P.m(-116, re.G);
											if (var12 == 0) {
												break label1258;
											}
										}
										
										if (~og.db != -2 && !fg.a(-1 + si.S, 0) || ~si.S >= -3) {
											if (si.S <= 0) {
												break label1258;
											}
											
											hf.a(-1 + si.S, (byte) -37);
											if (var12 == 0) {
												break label1258;
											}
										}
										
										bf.j(765);
									}
									
									ja.u = 10;
									og.ub = null;
									qe.k = 0;
								}
							}
							
							nf.T = false;
							sh.e = null;
							qe.t = 0;
							la.y = false;
							ra var22 = qh.a;
							qh.a = null;
							ra var23 = be.j;
							be.j = null;
							if (var12 != 0 || q.j(1) && qe.t < 128) {
								do {
									ac.r[qe.t] = ia.fb;
									vd.ints_m[qe.t] = s.X;
									++qe.t;
								} while (q.j(1) && qe.t < 128);
							}
							
							if (~bg.h != 0) {
								jg.a((byte) -19, 0, 0, 0, 765, 0, 503, bg.h);
							}
							
							++re.D;
							
							wc var24;
							ra var25;
							ra var27;
							while (true) {
								var24 = (wc) di.j.a((int) -12462);
								if (var24 == null) {
									break;
								}
								
								var25 = var24.E;
								if (var25.Rb >= 0) {
									var27 = tc.b(var25.Ic, (int) -53);
									if (var27 == null || var27.xb == null || ~var27.xb.length >= ~var25.Rb || var25 != var27.xb[var25.Rb] && var12 == 0) {
										continue;
									}
								}
								
								wg.a(-112, (wc) var24);
								if (var12 != 0) {
									break;
								}
							}
							
							while (true) {
								var24 = (wc) uc.T.a((int) -12462);
								if (var24 == null) {
									break;
								}
								
								var25 = var24.E;
								if (var25.Rb >= 0) {
									var27 = tc.b(var25.Ic, (int) -128);
									if (var27 == null || var27.xb == null || ~var25.Rb <= ~var27.xb.length || var25 != var27.xb[var25.Rb] && var12 == 0) {
										continue;
									}
								}
								
								wg.a(-110, (wc) var24);
								if (var12 != 0) {
									break;
								}
							}
							
							while (true) {
								var24 = (wc) wf.b.a((int) -12462);
								if (var24 == null) {
									break;
								}
								
								var25 = var24.E;
								if (~var25.Rb <= -1) {
									var27 = tc.b(var25.Ic, (int) -66);
									if (var27 == null || var27.xb == null || ~var25.Rb <= ~var27.xb.length || var27.xb[var25.Rb] != var25 && var12 == 0) {
										continue;
									}
								}
								
								wg.a(-121, (wc) var24);
								if (var12 != 0) {
									break;
								}
							}
							
							if (gf.u != null) {
								gb.i(-1);
							}
							
							if (~uc.mb != 0) {
								var5 = uc.mb;
								var6 = cf.R;
								boolean var28 = qc.a(0, 0, var5, var6, (byte) -122, true, le.T.regionLocalX[0], 0, 0, 0, le.T.regionLocalY[0], 0);
								uc.mb = -1;
								if (var28) {
									jh.h = ia.eb;
									jc.anInt_ib = 1;
									ai.wb = 0;
									af.t = tf.m;
								}
							}
							
							lh.i(25);
							if (var22 != qh.a) {
								if (var22 != null) {
									dg.a(var22, -102);
								}
								
								if (qh.a != null) {
									dg.a(qh.a, -102);
								}
							}
							
							if (var23 != be.j && ~ig.j == ~wb.X) {
								if (var23 != null) {
									dg.a(var23, -101);
								}
								
								if (be.j != null) {
									dg.a(be.j, -122);
								}
							}
							
							label949:
							{
								if (be.j == null) {
									if (~ig.j >= -1) {
										break label949;
									}
									
									--ig.j;
									if (var12 == 0) {
										break label949;
									}
								}
								
								if (ig.j < wb.X) {
									++ig.j;
									if (wb.X == ig.j) {
										dg.a(be.j, -84);
									}
								}
							}
							
							le.j(2047);
							if (client.aBoolean_db) {
								client.f((int) -111);
							}
							
							var5 = 0;
							if (var12 != 0) {
								++qi.q[var5];
								++var5;
							}
							
							while (var5 < 5) {
								++qi.q[var5];
								++var5;
							}
							
							var6 = ab.a((int) -56);
							var7 = lf.d(101);
							if (~var6 < -4501 && ~var7 < -4501) {
								ei.anInt_sb = 250;
								wa.b(4000, -23383);
								af.P.p(38, 12885);
								++rc.w;
							}
							
							++lb.ib;
							++fh.anInt_e;
							++ra.mc;
							if (~ra.mc < -501) {
								ra.mc = 0;
								var8 = (int) (8.0D * Math.random());
								if ((var8 & 2) == 2) {
									a.a += q.anInt_fb;
								}
								
								if ((1 & var8) == 1) {
									qg.c += ve.anInt_b;
								}
								
								if ((4 & var8) == 4) {
									wc.p += ia.T;
								}
							}
							
							if (~lb.ib < -501) {
								lb.ib = 0;
								var8 = (int) (8.0D * Math.random());
								if ((1 & var8) == 1) {
									jg.h += og.u;
								}
								
								if ((2 & var8) == 2) {
									lg.d += jc.anInt_fb;
								}
							}
							
							if (~wc.p > 39) {
								ia.T = 1;
							}
							
							if (~wc.p < -41) {
								ia.T = -1;
							}
							
							if (jg.h < -60) {
								og.u = 2;
							}
							
							if (qg.c < -50) {
								ve.anInt_b = 2;
							}
							
							if (~lg.d > 19) {
								jc.anInt_fb = 1;
							}
							
							if (~qg.c < -51) {
								ve.anInt_b = -2;
							}
							
							if (lg.d > 10) {
								jc.anInt_fb = -1;
							}
							
							if (~a.a > 54) {
								q.anInt_fb = 2;
							}
							
							if (jg.h > 60) {
								og.u = -2;
							}
							
							if (~a.a < -56) {
								q.anInt_fb = -2;
							}
							
							if (~fh.anInt_e < -51) {
								af.P.p(33, 12885);
								++me.p;
							}
							
							try {
								if (ch.W != null && af.P.pointer > 0) {
									ch.W.a(39, af.P.buffer, af.P.pointer, 0);
									fh.anInt_e = 0;
									af.P.pointer = 0;
								}
							} catch (IOException var16) {
								ac.dropClient(25005);
							}
						}
					}
				}
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "li.D(" + var0 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			cacheFile17 = null;
			if (var0 > -110) {
				a(-118, -27);
			}
			
			i = null;
			cacheFile7 = null;
			ints_l = null;
			g = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "li.C(" + var0 + ')');
		}
	}
	
	static void c(int var0) {
		try {
			if (var0 == -5) {
				++d;
				if (mf.mb != null) {
					mf.mb.d(var0 + 129);
				}
				
				if (client.lg_rb != null) {
					client.lg_rb.d(-77);
				}
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "li.A(" + var0 + ')');
		}
	}
	
	static int a(byte var0) {
		int var10 = client.anInt_wb;
		
		try {
			++f;
			int var1 = 3;
			if (~bh.l > -311) {
				label138:
				{
					int var3 = se.d >> 7;
					int var4 = le.T.coordX >> 7;
					int var2 = ri.b >> 7;
					if ((4 & qe.r[gf.G][var2][var3]) != 0) {
						var1 = gf.G;
					}
					
					int var5;
					int var6;
					label130:
					{
						var5 = le.T.coordY >> 7;
						if (var2 >= var4) {
							var6 = -var4 + var2;
							if (var10 == 0) {
								break label130;
							}
						}
						
						var6 = -var2 + var4;
					}
					
					int var7;
					label125:
					{
						if (~var5 < ~var3) {
							var7 = var5 + -var3;
							if (var10 == 0) {
								break label125;
							}
						}
						
						var7 = var3 - var5;
					}
					
					int var8;
					int var9;
					if (~var6 < ~var7) {
						var8 = var7 * 65536 / var6;
						var9 = '耀';
						if (var10 != 0 || ~var2 != ~var4) {
							do {
								label115:
								{
									if (~var2 > ~var4) {
										++var2;
										if (var10 == 0) {
											break label115;
										}
									}
									
									if (~var2 < ~var4) {
										--var2;
									}
								}
								
								if ((4 & qe.r[gf.G][var2][var3]) != 0) {
									var1 = gf.G;
								}
								
								var9 += var8;
								if (~var9 <= -65537) {
									var9 -= 65536;
									if (var5 > var3) {
										++var3;
										if (var10 != 0 && var3 > var5) {
											--var3;
										}
									} else if (var3 > var5) {
										--var3;
									}
									
									if (~(qe.r[gf.G][var2][var3] & 4) != -1) {
										var1 = gf.G;
									}
								}
							} while (~var2 != ~var4);
						}
						
						if (var10 == 0) {
							break label138;
						}
					}
					
					var9 = '耀';
					var8 = var6 * 65536 / var7;
					if (var10 != 0 || ~var3 != ~var5) {
						do {
							if (~var5 < ~var3) {
								++var3;
								if (var10 != 0 && var3 > var5) {
									--var3;
								}
							} else if (var3 > var5) {
								--var3;
							}
							
							var9 += var8;
							if ((qe.r[gf.G][var2][var3] & 4) != 0) {
								var1 = gf.G;
							}
							
							if (~var9 <= -65537) {
								if (~var2 <= ~var4) {
									if (var4 < var2) {
										--var2;
										if (var10 != 0) {
											++var2;
										}
									}
								} else {
									++var2;
								}
								
								if (~(4 & qe.r[gf.G][var2][var3]) != -1) {
									var1 = gf.G;
								}
								
								var9 -= 65536;
							}
						} while (~var3 != ~var5);
					}
				}
			}
			
			if (var0 != -84) {
				return 99;
			} else {
				if ((4 & qe.r[gf.G][le.T.coordX >> 7][le.T.coordY >> 7]) != 0) {
					var1 = gf.G;
				}
				
				return var1;
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "li.B(" + var0 + ')');
		}
	}
	
	static boolean a(ra var0, boolean var1) {
		try {
			++c;
			if (var1) {
				return false;
			} else {
				int var2 = var0.ab;
				if (~var2 == -206) {
					ei.anInt_sb = 250;
					return true;
				} else {
					int var3;
					int var4;
					if (~var2 <= -301 && ~var2 >= -314) {
						var3 = (-300 + var2) / 2;
						var4 = 1 & var2;
						oe.g.a(var3, false, var4 == 1);
					}
					
					if (~var2 <= -315 && ~var2 >= -324) {
						var4 = 1 & var2;
						var3 = (-314 + var2) / 2;
						oe.g.a(var3, ~var4 == -2, -123);
					}
					
					if (var2 == 324) {
						oe.g.a(false, (byte) 84);
					}
					
					if (var2 == 325) {
						oe.g.a(true, (byte) -74);
					}
					
					if (var2 == 326) {
						++nb.jc;
						af.P.p(205, 12885);
						oe.g.a(af.P, -102);
						return true;
					} else {
						return false;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "li.F(" + "{...}" + ',' + var1 + ')');
		}
	}
}
