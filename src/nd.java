final class nd {
	
	private pi a = new pi();
	private rf[] b;
	private int c;
	static int d;
	private int e = 0;
	static int f;
	private int g = -1;
	static int h;
	static int[] i = new int[500];
	static int j;
	static int k = 0;
	private int[][] l;
	private int anInt_m;
	boolean n = false;
	
	public static void a(byte var0) {
		try {
			if (var0 != 65) {
				a((pd) null, true);
			}
			
			i = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "nd.D(" + var0 + ')');
		}
	}
	
	final int[] a(int var1, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			if (var2 != 12) {
				this.n = true;
			}
			
			++h;
			if (~this.c == ~this.anInt_m) {
				this.n = this.b[var1] == null;
				this.b[var1] = ee.l;
				return this.l[var1];
			} else if (~this.anInt_m == -2) {
				this.n = this.g != var1;
				this.g = var1;
				return this.l[0];
			} else {
				rf var3;
				label41:
				{
					var3 = this.b[var1];
					if (var3 == null) {
						label38:
						{
							this.n = true;
							if (this.anInt_m > this.e) {
								var3 = new rf(var1, this.e);
								++this.e;
								if (var5 == 0) {
									break label38;
								}
							}
							
							rf var4 = (rf) this.a.d(-126);
							var3 = new rf(var1, var4.F);
							this.b[var4.anInt_q] = null;
							var4.c(128);
						}
						
						this.b[var1] = var3;
						if (var5 == 0) {
							break label41;
						}
					}
					
					this.n = false;
				}
				
				this.a.a(var3, true);
				return this.l[var3.F];
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "nd.B(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(boolean var1) {
		int var3 = client.anInt_wb;
		
		try {
			int var2 = 0;
			if (var3 != 0) {
				this.l[var2] = null;
				++var2;
			}
			
			while (~this.anInt_m < ~var2) {
				this.l[var2] = null;
				++var2;
			}
			
			this.l = null;
			++d;
			this.b = null;
			this.a.c(121);
			this.a = null;
			if (!var1) {
				this.anInt_m = -7;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "nd.A(" + var1 + ')');
		}
	}
	
	static void a(pd var0, boolean var1) {
		wh.pi_e.a(0, var0);
		
		while (true) {
			pd var2;
			int var3;
			int var4;
			int var5;
			int var6;
			pd[][] var7;
			pd var8;
			int var10;
			int var13;
			int var14;
			int var15;
			rc var23;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										ah var11;
										int var16;
										int var17;
										int var18;
										int var20;
										boolean var21;
										pd var32;
										while (true) {
											do {
												var2 = (pd) wh.pi_e.a((int) -12462);
												if (var2 == null) {
													return;
												}
											} while (!var2.J);
											
											var3 = var2.z;
											var4 = var2.L;
											var5 = var2.t;
											var6 = var2.C;
											var7 = nb.oc[var5];
											if (!var2.q) {
												break;
											}
											
											if (var1) {
												if (var5 > 0) {
													var8 = nb.oc[var5 - 1][var3][var4];
													if (var8 != null && var8.J) {
														continue;
													}
												}
												
												if (var3 <= vd.anInt_h && var3 > ua.d) {
													var8 = var7[var3 - 1][var4];
													if (var8 != null && var8.J && (var8.q || (var2.I & 1) == 0)) {
														continue;
													}
												}
												
												if (var3 >= vd.anInt_h && var3 < gg.j - 1) {
													var8 = var7[var3 + 1][var4];
													if (var8 != null && var8.J && (var8.q || (var2.I & 4) == 0)) {
														continue;
													}
												}
												
												if (var4 <= hg.d && var4 > wc.L) {
													var8 = var7[var3][var4 - 1];
													if (var8 != null && var8.J && (var8.q || (var2.I & 8) == 0)) {
														continue;
													}
												}
												
												if (var4 >= hg.d && var4 < oe.r - 1) {
													var8 = var7[var3][var4 + 1];
													if (var8 != null && var8.J && (var8.q || (var2.I & 2) == 0)) {
														continue;
													}
												}
											} else {
												var1 = true;
											}
											
											var2.q = false;
											if (var2.v != null) {
												var8 = var2.v;
												if (var8.H != null) {
													if (!bd.b(0, var3, var4)) {
														gg.a(var8.H, 0, ke.kb, m.r, vf.p, pb.anInt_d, var3, var4);
													}
												} else if (var8.A != null && !bd.b(0, var3, var4)) {
													na.a(var8.A, ke.kb, m.r, vf.p, pb.anInt_d, var3, var4);
												}
												
												rc var9 = var8.x;
												if (var9 != null) {
													var9.k.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var9.g - bg.b, var9.i - qc.A, var9.p - dd.m, var9.j);
												}
												
												for (var10 = 0; var10 < var8.B; ++var10) {
													var11 = var8.D[var10];
													if (var11 != null) {
														var11.h.a(var11.n, ke.kb, m.r, vf.p, pb.anInt_d, var11.i - bg.b, var11.o - qc.A, var11.a - dd.m, var11.b);
													}
												}
											}
											
											var21 = false;
											if (var2.H != null) {
												if (!bd.b(var6, var3, var4)) {
													var21 = true;
													if (var2.H.w != 12345678 || cf.Y && var5 <= ff.P) {
														gg.a(var2.H, var6, ke.kb, m.r, vf.p, pb.anInt_d, var3, var4);
													}
												}
											} else if (var2.A != null && !bd.b(var6, var3, var4)) {
												var21 = true;
												na.a(var2.A, ke.kb, m.r, vf.p, pb.anInt_d, var3, var4);
											}
											
											var20 = 0;
											var10 = 0;
											rc var22 = var2.x;
											fg var12 = var2.r;
											if (var22 != null || var12 != null) {
												if (vd.anInt_h == var3) {
													++var20;
												} else if (vd.anInt_h < var3) {
													var20 += 2;
												}
												
												if (hg.d == var4) {
													var20 += 3;
												} else if (hg.d > var4) {
													var20 += 6;
												}
												
												var10 = fg.b[var20];
												var2.G = wc.u[var20];
											}
											
											if (var22 != null) {
												if ((var22.n & th.U[var20]) != 0) {
													if (var22.n == 16) {
														var2.w = 3;
														var2.s = id.z[var20];
														var2.K = 3 - var2.s;
													} else if (var22.n == 32) {
														var2.w = 6;
														var2.s = sf.d[var20];
														var2.K = 6 - var2.s;
													} else if (var22.n == 64) {
														var2.w = 12;
														var2.s = q.jb[var20];
														var2.K = 12 - var2.s;
													} else {
														var2.w = 9;
														var2.s = lf.y[var20];
														var2.K = 9 - var2.s;
													}
												} else {
													var2.w = 0;
												}
												
												if ((var22.n & var10) != 0 && !jc.a(var6, var3, var4, var22.n)) {
													var22.k.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var22.g - bg.b, var22.i - qc.A, var22.p - dd.m, var22.j);
												}
												
												if ((var22.o & var10) != 0 && !jc.a(var6, var3, var4, var22.o)) {
													var22.b.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var22.g - bg.b, var22.i - qc.A, var22.p - dd.m, var22.j);
												}
											}
											
											if (var12 != null && !qa.a(var6, var3, var4, var12.o.b())) {
												if ((var12.q & var10) != 0) {
													var12.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var12.c - bg.b + var12.j, var12.r - qc.A, var12.p - dd.m + var12.i, var12.m);
												} else if (var12.q == 256) {
													var13 = var12.c - bg.b;
													var14 = var12.r - qc.A;
													var15 = var12.p - dd.m;
													var16 = var12.a;
													if (var16 != 1 && var16 != 2) {
														var17 = var13;
													} else {
														var17 = -var13;
													}
													
													if (var16 != 2 && var16 != 3) {
														var18 = var15;
													} else {
														var18 = -var15;
													}
													
													if (var18 < var17) {
														var12.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var13 + var12.j, var14, var15 + var12.i, var12.m);
													} else if (var12.s != null) {
														var12.s.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var13, var14, var15, var12.m);
													}
												}
											}
											
											if (var21) {
												me var27 = var2.u;
												if (var27 != null) {
													var27.c.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var27.j - bg.b, var27.anInt_m - qc.A, var27.i - dd.m, var27.o);
												}
												
												de var31 = var2.E;
												if (var31 != null && var31.m == 0) {
													if (var31.s != null) {
														var31.s.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var31.f - bg.b, var31.a - qc.A, var31.i - dd.m, var31.q);
													}
													
													if (var31.l != null) {
														var31.l.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var31.f - bg.b, var31.a - qc.A, var31.i - dd.m, var31.q);
													}
													
													if (var31.o != null) {
														var31.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var31.f - bg.b, var31.a - qc.A, var31.i - dd.m, var31.q);
													}
												}
											}
											
											var13 = var2.I;
											if (var13 != 0) {
												if (var3 < vd.anInt_h && (var13 & 4) != 0) {
													var32 = var7[var3 + 1][var4];
													if (var32 != null && var32.J) {
														wh.pi_e.a(0, var32);
													}
												}
												
												if (var4 < hg.d && (var13 & 2) != 0) {
													var32 = var7[var3][var4 + 1];
													if (var32 != null && var32.J) {
														wh.pi_e.a(0, var32);
													}
												}
												
												if (var3 > vd.anInt_h && (var13 & 1) != 0) {
													var32 = var7[var3 - 1][var4];
													if (var32 != null && var32.J) {
														wh.pi_e.a(0, var32);
													}
												}
												
												if (var4 > hg.d && (var13 & 8) != 0) {
													var32 = var7[var3][var4 - 1];
													if (var32 != null && var32.J) {
														wh.pi_e.a(0, var32);
													}
												}
											}
											break;
										}
										
										if (var2.w != 0) {
											var21 = true;
											
											for (var20 = 0; var20 < var2.B; ++var20) {
												if (var2.D[var20].g != v.M && (var2.y[var20] & var2.w) == var2.s) {
													var21 = false;
													break;
												}
											}
											
											if (var21) {
												var23 = var2.x;
												if (!jc.a(var6, var3, var4, var23.n)) {
													var23.k.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var23.g - bg.b, var23.i - qc.A, var23.p - dd.m, var23.j);
												}
												
												var2.w = 0;
											}
										}
										
										if (!var2.p) {
											break;
										}
										
										try {
											int var25 = var2.B;
											var2.p = false;
											var20 = 0;
											
											label558:
											for (var10 = 0; var10 < var25; ++var10) {
												var11 = var2.D[var10];
												if (var11.g != v.M) {
													for (var26 = var11.q; var26 <= var11.e; ++var26) {
														for (var13 = var11.d; var13 <= var11.r; ++var13) {
															var32 = var7[var26][var13];
															if (var32.q) {
																var2.p = true;
																continue label558;
															}
															
															if (var32.w != 0) {
																var15 = 0;
																if (var26 > var11.q) {
																	++var15;
																}
																
																if (var26 < var11.e) {
																	var15 += 4;
																}
																
																if (var13 > var11.d) {
																	var15 += 8;
																}
																
																if (var13 < var11.r) {
																	var15 += 2;
																}
																
																if ((var15 & var32.w) == var2.K) {
																	var2.p = true;
																	continue label558;
																}
															}
														}
													}
													
													pi.h[var20++] = var11;
													var13 = vd.anInt_h - var11.q;
													var14 = var11.e - vd.anInt_h;
													if (var14 > var13) {
														var13 = var14;
													}
													
													var15 = hg.d - var11.d;
													var16 = var11.r - hg.d;
													if (var16 > var15) {
														var11.p = var13 + var16;
													} else {
														var11.p = var13 + var15;
													}
												}
											}
											
											while (var20 > 0) {
												var24 = -50;
												var26 = -1;
												
												ah var33;
												for (var13 = 0; var13 < var20; ++var13) {
													var33 = pi.h[var13];
													if (var33.g != v.M) {
														if (var33.p > var24) {
															var24 = var33.p;
															var26 = var13;
														} else if (var33.p == var24) {
															var15 = var33.i - bg.b;
															var16 = var33.a - dd.m;
															var17 = pi.h[var26].i - bg.b;
															var18 = pi.h[var26].a - dd.m;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var26 = var13;
															}
														}
													}
												}
												
												if (var26 == -1) {
													break;
												}
												
												var33 = pi.h[var26];
												var33.g = v.M;
												if (!ib.a(var6, var33.q, var33.e, var33.d, var33.r, var33.h.b())) {
													var33.h.a(var33.n, ke.kb, m.r, vf.p, pb.anInt_d, var33.i - bg.b, var33.o - qc.A, var33.a - dd.m, var33.b);
												}
												
												for (var15 = var33.q; var15 <= var33.e; ++var15) {
													for (var16 = var33.d; var16 <= var33.r; ++var16) {
														pd var34 = var7[var15][var16];
														if (var34.w != 0) {
															wh.pi_e.a(0, var34);
														} else if ((var15 != var3 || var16 != var4) && var34.J) {
															wh.pi_e.a(0, var34);
														}
													}
												}
											}
											
											if (!var2.p) {
												break;
											}
										} catch (Exception var19) {
											var2.p = false;
											break;
										}
									}
								} while (!var2.J);
							} while (var2.w != 0);
							
							if (var3 > vd.anInt_h || var3 <= ua.d) {
								break;
							}
							
							var8 = var7[var3 - 1][var4];
						} while (var8 != null && var8.J);
						
						if (var3 < vd.anInt_h || var3 >= gg.j - 1) {
							break;
						}
						
						var8 = var7[var3 + 1][var4];
					} while (var8 != null && var8.J);
					
					if (var4 > hg.d || var4 <= wc.L) {
						break;
					}
					
					var8 = var7[var3][var4 - 1];
				} while (var8 != null && var8.J);
				
				if (var4 < hg.d || var4 >= oe.r - 1) {
					break;
				}
				
				var8 = var7[var3][var4 + 1];
			} while (var8 != null && var8.J);
			
			var2.J = false;
			--ia.S;
			de var29 = var2.E;
			if (var29 != null && var29.m != 0) {
				if (var29.s != null) {
					var29.s.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var29.f - bg.b, var29.a - qc.A - var29.m, var29.i - dd.m, var29.q);
				}
				
				if (var29.l != null) {
					var29.l.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var29.f - bg.b, var29.a - qc.A - var29.m, var29.i - dd.m, var29.q);
				}
				
				if (var29.o != null) {
					var29.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var29.f - bg.b, var29.a - qc.A - var29.m, var29.i - dd.m, var29.q);
				}
			}
			
			if (var2.G != 0) {
				fg var28 = var2.r;
				if (var28 != null && !qa.a(var6, var3, var4, var28.o.b())) {
					if ((var28.q & var2.G) != 0) {
						var28.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var28.c - bg.b + var28.j, var28.r - qc.A, var28.p - dd.m + var28.i, var28.m);
					} else if (var28.q == 256) {
						var10 = var28.c - bg.b;
						var24 = var28.r - qc.A;
						var26 = var28.p - dd.m;
						var13 = var28.a;
						if (var13 != 1 && var13 != 2) {
							var14 = var10;
						} else {
							var14 = -var10;
						}
						
						if (var13 != 2 && var13 != 3) {
							var15 = var26;
						} else {
							var15 = -var26;
						}
						
						if (var15 >= var14) {
							var28.o.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var10 + var28.j, var24, var26 + var28.i, var28.m);
						} else if (var28.s != null) {
							var28.s.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var10, var24, var26, var28.m);
						}
					}
				}
				
				var23 = var2.x;
				if (var23 != null) {
					if ((var23.o & var2.G) != 0 && !jc.a(var6, var3, var4, var23.o)) {
						var23.b.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var23.g - bg.b, var23.i - qc.A, var23.p - dd.m, var23.j);
					}
					
					if ((var23.n & var2.G) != 0 && !jc.a(var6, var3, var4, var23.n)) {
						var23.k.a(0, ke.kb, m.r, vf.p, pb.anInt_d, var23.g - bg.b, var23.i - qc.A, var23.p - dd.m, var23.j);
					}
				}
			}
			
			pd var30;
			if (var5 < ki.s - 1) {
				var30 = nb.oc[var5 + 1][var3][var4];
				if (var30 != null && var30.J) {
					wh.pi_e.a(0, var30);
				}
			}
			
			if (var3 < vd.anInt_h) {
				var30 = var7[var3 + 1][var4];
				if (var30 != null && var30.J) {
					wh.pi_e.a(0, var30);
				}
			}
			
			if (var4 < hg.d) {
				var30 = var7[var3][var4 + 1];
				if (var30 != null && var30.J) {
					wh.pi_e.a(0, var30);
				}
			}
			
			if (var3 > vd.anInt_h) {
				var30 = var7[var3 - 1][var4];
				if (var30 != null && var30.J) {
					wh.pi_e.a(0, var30);
				}
			}
			
			if (var4 > hg.d) {
				var30 = var7[var3][var4 - 1];
				if (var30 != null && var30.J) {
					wh.pi_e.a(0, var30);
				}
			}
		}
	}
	
	final int[][] a(int var1) {
		int var3 = client.anInt_wb;
		
		try {
			++f;
			if (this.c != this.anInt_m) {
				throw new RuntimeException("Can only retrieve a full image cache");
			} else {
				if (var1 != 2) {
					this.a(false);
				}
				
				int var2 = 0;
				if (var3 != 0) {
					this.b[var2] = ee.l;
					++var2;
				}
				
				while (~this.anInt_m < ~var2) {
					this.b[var2] = ee.l;
					++var2;
				}
				
				return this.l;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "nd.E(" + var1 + ')');
		}
	}
	
	nd(int var1, int var2, int var3) {
		try {
			this.anInt_m = var1;
			this.l = new int[this.anInt_m][var3];
			this.c = var2;
			this.b = new rf[this.c];
		} catch (RuntimeException var5) {
			throw bc.a(var5, "nd.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
