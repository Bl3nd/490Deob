final class da extends aa {
	
	private double O;
	static int P;
	int Q;
	double R;
	int S;
	static ob T = rf.a(40, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");
	static int U;
	double V;
	private int W;
	private boolean X = false;
	double Y;
	private int Z;
	private int ab;
	static int bb;
	static int cb;
	private double db;
	static int eb = 0;
	int fb;
	private double gb;
	private double hb;
	private int ib = -32768;
	private ce jb;
	private int kb = 0;
	private int anInt_lb;
	int mb;
	private int nb = 0;
	static int ob;
	private int pb;
	static ob qb = rf.a(40, "mem=");
	private int rb;
	static int sb;
	private double tb;
	static int ub;
	int vb;
	int wb;
	static int xb;
	static ob yb = rf.a(40, ")4l");
	static ob zb = rf.a(40, "W-=hlen Sie eine Welt");
	private int Ab;
	static int Bb = 0;
	
	final void a(int var1, int var2, int var3, int var4, int var5) {
		try {
			double var6;
			if (!this.X) {
				var6 = (double) (-this.W + var5);
				double var8 = (double) (-this.ab + var2);
				double var10 = Math.sqrt(var8 * var8 + var6 * var6);
				this.V = var6 * (double) this.Ab / var10 + (double) this.W;
				this.Y = (double) this.ab + (double) this.Ab * var8 / var10;
				this.R = (double) this.pb;
			}
			
			var6 = (double) (this.mb + 1 - var1);
			this.tb = ((double) var5 - this.V) / var6;
			this.gb = (-this.Y + (double) var2) / var6;
			this.O = Math.sqrt(this.gb * this.gb + this.tb * this.tb);
			++U;
			if (!this.X) {
				this.db = -this.O * Math.tan(0.02454369D * (double) this.rb);
			}
			
			this.hb = 2.0D * (-(this.db * var6) + -this.R + (double) var3) / (var6 * var6);
		} catch (RuntimeException var12) {
			throw bc.a(var12, "da.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	static void a(int var0, int var1, byte var2, int var3, int var4, int var5, int var6, ra[] var7, int var8) {
		int var24 = client.anInt_wb;
		
		try {
			if (var2 >= -9) {
				qb = null;
			}
			
			++ub;
			int var9 = 0;
			if (var24 != 0 || var9 < var7.length) {
				do {
					ra var10 = var7[var9];
					if (var10 != null && (!var10.R || ~var10.Ac == -1 || var10.Vb || ~ce.a(var10, 18125) != -1 || var10 == ue.ib || ~var10.ab == -1339) && ~var4 == ~var10.Ic && (!var10.R || !bi.a((byte) -45, var10))) {
						int var11 = var10.Nb + var3;
						int var12 = var5 + var10.gc;
						if (gf.u == var10) {
							la.A = var11;
							nf.T = true;
							pg.cb = var12;
						}
						
						int var13;
						int var14;
						int var15;
						int var16;
						int var20;
						label555:
						{
							if (var10.Ac == 2) {
								var16 = var0;
								var14 = var6;
								var13 = var1;
								var15 = var8;
								if (var24 == 0) {
									break label555;
								}
							}
							
							int var17;
							int var18;
							if (var10.Ac != 9) {
								var14 = var12 <= var6 ? var6 : var12;
								var13 = ~var1 > ~var11 ? var11 : var1;
								var17 = var10.L + var11;
								var15 = var17 >= var8 ? var8 : var17;
								var18 = var10.w + var12;
								var16 = ~var0 >= ~var18 ? var0 : var18;
								if (var24 == 0) {
									break label555;
								}
							}
							
							var20 = var12 - -var10.w;
							var18 = var12;
							int var19 = var11 - -var10.L;
							var17 = var11;
							if (var11 > var19) {
								var17 = var19;
								var19 = var11;
							}
							
							if (var12 > var20) {
								var18 = var20;
								var20 = var12;
							}
							
							++var20;
							var14 = ~var6 <= ~var18 ? var6 : var18;
							var16 = ~var20 <= ~var0 ? var0 : var20;
							++var19;
							var13 = var1 >= var17 ? var1 : var17;
							var15 = var19 >= var8 ? var8 : var19;
						}
						
						if (!var10.R || ~var15 < ~var13 && (~var16 < ~var14 || var24 != 0)) {
							label608:
							{
								if (var10.ab == 1337) {
									dg.a(var10, -101);
									if (var24 == 0) {
										break label608;
									}
								}
								
								if (~var10.Ac == -1) {
									if (!var10.R && bi.a((byte) -122, var10) && var10 != qh.a) {
										break label608;
									}
									
									a(var16, var13, (byte) -108, var11 - var10.Gb, var10.Ec, -var10.rc + var12, var14, var7, var15);
									if (var10.xb != null) {
										a(var16, var13, (byte) -125, var11 - var10.Gb, var10.Ec, -var10.rc + var12, var14, var10.xb, var15);
									}
									
									re var26 = (re) rd.J.a((long) var10.Ec, 22346);
									if (var26 != null) {
										jg.a((byte) -19, var12, var11, var13, var15, var14, var16, var26.w);
									}
								}
								
								if (var10.R) {
									boolean var27;
									if (og.o >= var13 && var14 <= re.u && ~og.o > ~var15 && ~re.u > ~var16) {
										var27 = true;
									} else {
										var27 = false;
										if (var24 != 0) {
											var27 = true;
										}
									}
									
									boolean var28 = false;
									boolean var29 = false;
									if (mf.S == 1 && var27) {
										var28 = true;
									}
									
									if (~qe.k == -2 && ia.eb >= var13 && var14 <= tf.m && ~ia.eb > ~var15 && tf.m < var16) {
										var29 = true;
									}
									
									if (~var10.ab == -1339) {
										if (!var29) {
											break label608;
										}
										
										pe.a(tf.m + -var12, var10, (byte) -120, -var11 + ia.eb);
										if (var24 == 0) {
											break label608;
										}
									}
									
									if (var29) {
										vg.a(var10, ia.eb + -var11, -var12 + tf.m, -84);
									}
									
									if (gf.u != null && gf.u != var10 && var27 && ng.b(-118, ce.a(var10, 18125))) {
										sh.e = var10;
									}
									
									if (var10 == ue.ib) {
										ug.s = var11;
										la.y = true;
										qc.q = var12;
									}
									
									if (var10.Vb) {
										wc var30;
										if (var27 && ~ce.hb != -1 && var10.Ub != null) {
											var30 = new wc();
											var30.P = var10.Ub;
											var30.y = ce.hb;
											var30.E = var10;
											wf.b.a(0, var30);
										}
										
										if (gf.u != null || og.ub != null || le.X) {
											var29 = false;
											var28 = false;
											var27 = false;
										}
										
										if (!var10.V && var29) {
											var10.V = true;
											if (var10.objects_ib != null) {
												var30 = new wc();
												var30.y = tf.m + -var12;
												var30.x = -var11 + ia.eb;
												var30.E = var10;
												var30.P = var10.objects_ib;
												wf.b.a(0, var30);
											}
										}
										
										if (var10.V && var28 && var10.s != null) {
											var30 = new wc();
											var30.y = -var12 + re.u;
											var30.x = og.o + -var11;
											var30.E = var10;
											var30.P = var10.s;
											wf.b.a(0, var30);
										}
										
										if (var10.V && !var28) {
											var10.V = false;
											if (var10.Gc != null) {
												var30 = new wc();
												var30.P = var10.Gc;
												var30.y = re.u - var12;
												var30.x = -var11 + og.o;
												var30.E = var10;
												uc.T.a(0, var30);
											}
										}
										
										if (var28 && var10.G != null) {
											var30 = new wc();
											var30.E = var10;
											var30.x = -var11 + og.o;
											var30.P = var10.G;
											var30.y = re.u - var12;
											wf.b.a(0, var30);
										}
										
										if (!var10.H && var27) {
											var10.H = true;
											if (var10.y != null) {
												var30 = new wc();
												var30.y = -var12 + re.u;
												var30.E = var10;
												var30.x = -var11 + og.o;
												var30.P = var10.y;
												wf.b.a(0, var30);
											}
										}
										
										if (var10.H && var27 && var10.xc != null) {
											var30 = new wc();
											var30.P = var10.xc;
											var30.x = -var11 + og.o;
											var30.E = var10;
											var30.y = -var12 + re.u;
											wf.b.a(0, var30);
										}
										
										if (var10.H && !var27) {
											var10.H = false;
											if (var10.F != null) {
												var30 = new wc();
												var30.y = re.u + -var12;
												var30.x = -var11 + og.o;
												var30.E = var10;
												var30.P = var10.F;
												uc.T.a(0, var30);
											}
										}
										
										if (var10.X != null) {
											var30 = new wc();
											var30.P = var10.X;
											var30.E = var10;
											di.j.a(0, var30);
										}
										
										int var21;
										int var22;
										wc var23;
										if (var10.vb != null && ~eb < ~var10.gb) {
											label602:
											{
												if (var10.l == null || -var10.gb + eb > 32) {
													var30 = new wc();
													var30.E = var10;
													var30.P = var10.vb;
													wf.b.a(0, var30);
													if (var24 == 0) {
														break label602;
													}
												}
												
												var20 = var10.gb;
												if (var24 != 0 || var20 < eb) {
													label474:
													do {
														var21 = rc.t[var20 & 31];
														var22 = 0;
														if (var24 != 0 || ~var22 > ~var10.l.length) {
															do {
																if (~var21 == ~var10.l[var22]) {
																	var23 = new wc();
																	var23.P = var10.vb;
																	var23.E = var10;
																	wf.b.a(0, var23);
																	if (var24 == 0) {
																		break label474;
																	}
																	
																	++var22;
																} else {
																	++var22;
																}
															} while (~var22 > ~var10.l.length);
														}
														
														++var20;
													} while (var20 < eb);
												}
											}
											
											var10.gb = eb;
										}
										
										if (var10.Zb != null && ~var10.B > ~sf.h) {
											label603:
											{
												if (var10.Q == null || sf.h + -var10.B > 32) {
													var30 = new wc();
													var30.P = var10.Zb;
													var30.E = var10;
													wf.b.a(0, var30);
													if (var24 == 0) {
														break label603;
													}
												}
												
												var20 = var10.B;
												if (var24 != 0 || ~var20 > ~sf.h) {
													label438:
													do {
														var21 = ff.eb[var20 & 31];
														var22 = 0;
														if (var24 != 0 || ~var10.Q.length < ~var22) {
															do {
																if (~var21 == ~var10.Q[var22]) {
																	var23 = new wc();
																	var23.P = var10.Zb;
																	var23.E = var10;
																	wf.b.a(0, var23);
																	if (var24 == 0) {
																		break label438;
																	}
																	
																	++var22;
																} else {
																	++var22;
																}
															} while (~var10.Q.length < ~var22);
														}
														
														++var20;
													} while (~var20 > ~sf.h);
												}
											}
											
											var10.B = sf.h;
										}
										
										if (var10.pb != null && fh.a > var10.Qb) {
											label410:
											{
												if (var10.mb != null && -var10.Qb + fh.a <= 32) {
													var20 = var10.Qb;
													if (var24 != 0 || ~var20 > ~fh.a) {
														do {
															var21 = la.B[31 & var20];
															var22 = 0;
															if (var24 != 0 || ~var10.mb.length < ~var22) {
																do {
																	if (~var10.mb[var22] == ~var21) {
																		var23 = new wc();
																		var23.P = var10.pb;
																		var23.E = var10;
																		wf.b.a(0, var23);
																		if (var24 == 0) {
																			break label410;
																		}
																		
																		++var22;
																	} else {
																		++var22;
																	}
																} while (~var10.mb.length < ~var22);
															}
															
															++var20;
														} while (~var20 > ~fh.a);
													}
													
													if (var24 == 0) {
														break label410;
													}
												}
												
												var30 = new wc();
												var30.P = var10.pb;
												var30.E = var10;
												wf.b.a(0, var30);
											}
											
											var10.Qb = fh.a;
										}
										
										if (var10.Fc < pc.h && var10.ub != null) {
											var30 = new wc();
											var30.E = var10;
											var30.P = var10.ub;
											wf.b.a(0, var30);
										}
										
										if (a.k > var10.Fc && var10.objects_cc != null) {
											var30 = new wc();
											var30.P = var10.objects_cc;
											var30.E = var10;
											wf.b.a(0, var30);
										}
										
										if (kg.i > var10.Fc && var10.U != null) {
											var30 = new wc();
											var30.E = var10;
											var30.P = var10.U;
											wf.b.a(0, var30);
										}
										
										if (var10.Fc < h.lb && var10.Hc != null) {
											var30 = new wc();
											var30.P = var10.Hc;
											var30.E = var10;
											wf.b.a(0, var30);
										}
										
										if (~ja.z < ~var10.Fc && var10.dc != null) {
											var30 = new wc();
											var30.E = var10;
											var30.P = var10.dc;
											wf.b.a(0, var30);
										}
										
										var10.Fc = re.D;
										if (var10.D != null) {
											var20 = 0;
											if (var24 != 0 || qe.t > var20) {
												do {
													wc var31 = new wc();
													var31.E = var10;
													var31.r = ac.r[var20];
													var31.s = vd.ints_m[var20];
													var31.P = var10.D;
													wf.b.a(0, var31);
													++var20;
												} while (qe.t > var20);
											}
										}
									}
								}
								
								if (!var10.R) {
									if (gf.u != null || og.ub != null || le.X) {
										return;
									}
									
									if ((~var10.tb <= -1 || ~var10.Kb != -1) && og.o >= var13 && ~var14 >= ~re.u && og.o < var15 && ~var16 < ~re.u) {
										label351:
										{
											if (~var10.tb > -1) {
												qh.a = var10;
												if (var24 == 0) {
													break label351;
												}
											}
											
											qh.a = var7[var10.tb];
										}
									}
									
									if (var10.Ac == 8 && var13 <= og.o && ~re.u <= ~var14 && ~og.o > ~var15 && ~re.u > ~var16) {
										be.j = var10;
									}
									
									if (~var10.w > ~var10.anInt_cb) {
										vg.a(var10.anInt_cb, re.u, og.o, -16, var10.L + var11, var10.w, var10, var12);
									}
								}
							}
						}
					}
					
					++var9;
				} while (var9 < var7.length);
				
			}
		} catch (RuntimeException var25) {
			throw bc.a(var25, "da.H(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ')');
		}
	}
	
	static Class a(String var0, int var1) throws ClassNotFoundException {
		try {
			++cb;
			return var1 != 0 ? null : (var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE : (var0.equals("S") ? Short.TYPE : (var0.equals("J") ? Long.TYPE : (var0.equals("Z") ? Boolean.TYPE : (var0.equals("F") ? Float.TYPE : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE : Class.forName(var0)))))))));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "da.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			fe var11 = this.g(-1);
			++bb;
			if (var11 != null) {
				var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				this.ib = var11.b();
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "da.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	final void b(int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			this.V += (double) var2 * this.tb;
			this.X = true;
			this.Y += (double) var2 * this.gb;
			this.R += this.db * (double) var2 + 0.5D * this.hb * (double) var2 * (double) var2;
			++sb;
			this.db += this.hb * (double) var2;
			this.vb = 1024 + (int) (325.949D * Math.atan2(this.tb, this.gb)) & 2047;
			this.anInt_lb = (int) (Math.atan2(this.db, this.O) * 325.949D) & var1;
			if (this.jb != null) {
				this.kb += var2;
				if (var4 != 0 || this.jb.W[this.nb] < this.kb) {
					do {
						this.kb -= this.jb.W[this.nb];
						++this.nb;
						if (this.jb.Z.length <= this.nb) {
							this.nb -= this.jb.U;
							if (this.nb >= 0) {
								if (this.jb.Z.length <= this.nb) {
									this.nb = 0;
								}
							} else {
								this.nb = 0;
							}
						}
					} while (this.jb.W[this.nb] < this.kb);
					
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "da.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	private fe g(int var1) {
		try {
			kh var2 = lb.d(this.Z, var1 ^ 116);
			++xb;
			fe var3 = var2.b(13557, this.nb);
			if (var3 == null) {
				return null;
			} else {
				if (var1 != -1) {
					this.O = -1.1853726692542113D;
				}
				
				var3.g(this.anInt_lb);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "da.E(" + var1 + ')');
		}
	}
	
	public static void h(int var0) {
		try {
			T = null;
			yb = null;
			zb = null;
			qb = null;
			if (var0 != 1) {
				b((byte) 115);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "da.F(" + var0 + ')');
		}
	}
	
	final int b() {
		try {
			++ob;
			return this.ib;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "da.C(" + ')');
		}
	}
	
	da(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		try {
			this.Z = var1;
			this.X = false;
			this.Ab = var9;
			this.pb = var5;
			this.ab = var4;
			this.fb = var6;
			this.S = var10;
			this.Q = var2;
			this.wb = var11;
			this.rb = var8;
			this.W = var3;
			this.mb = var7;
			int var12 = lb.d(this.Z, -97).E;
			if (var12 != -1) {
				this.jb = le.c(15619, var12);
			} else {
				this.jb = null;
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "da.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}
	
	static void b(byte var0) {
		int var3 = client.anInt_wb;
		
		try {
			++P;
			if (ch.W != null) {
				ch.W.b(-2);
				ch.W = null;
			}
			
			bd.f(121);
			qg.a();
			int var1 = 0;
			if (var3 != 0) {
				ef.R[var1].a((byte) 122);
				++var1;
			}
			
			while (var1 < 4) {
				ef.R[var1].a((byte) 122);
				++var1;
			}
			
			System.gc();
			pd.a((byte) 120, 2);
			sc.g = -1;
			li.aBoolean_q = false;
			cc.f(2);
			pg.setGameState(10, (byte) 123);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "da.A(" + var0 + ')');
		}
	}
}
