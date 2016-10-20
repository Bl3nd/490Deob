import java.awt.Component;

final class qb extends rg {
	
	static int D;
	aa E;
	static int F;
	static long[] G = new long[500];
	static int[] H = new int[32];
	static int[][] I;
	static int J;
	static int K;
	static ob L;
	static ob M;
	private static ob N;
	static int O;
	static int gameState;
	
	static void a(boolean var0, int var1, int var2, int var3, int var4) {
		int var16 = client.anInt_wb;
		
		try {
			++F;
			wd.g = 0;
			int var5 = -1;
			Object var6;
			int var10;
			int var12;
			int var13;
			int var14;
			int var15;
			int var18;
			int var20;
			int var21;
			boolean var23;
			int var24;
			ob var25;
			if (var16 != 0) {
				if (~var5 != 0) {
					if (~var5 > ~se.b) {
						var6 = lg.j[si.cb[var5]];
						if (var16 != 0) {
							var6 = ai.M[ud.Xb[var5 + -se.b]];
							if (var16 != 0) {
								var6 = le.T;
							}
						}
					} else {
						var6 = ai.M[ud.Xb[var5 + -se.b]];
						if (var16 != 0) {
							var6 = le.T;
						}
					}
				} else {
					var6 = le.T;
				}
			} else {
				if (tf.n + se.b <= var5) {
					if (var0) {
						G = null;
					}
					
					var24 = 0;
					if (var16 == 0 && ~wd.g >= ~var24) {
						return;
					}
					
					do {
						var21 = og.F[var24];
						var10 = og.w[var24];
						var20 = og.Q[var24];
						var23 = true;
						var18 = og.Z[var24];
						if (var16 != 0 || var23) {
							do {
								var23 = false;
								var12 = 0;
								if (var16 != 0 || ~var12 > ~var24) {
									do {
										if (~(-og.w[var12] + og.Q[var12]) > ~(var20 - -2) && ~(2 + og.Q[var12]) < ~(var20 - var10) && ~(og.F[var12] + og.Z[var12]) < ~(-var21 + var18) && var21 + var18 > og.Z[var12] - og.F[var12] && ~(og.Q[var12] + -og.w[var12]) > ~var20) {
											var23 = true;
											var20 = og.Q[var12] + -og.w[var12];
										}
										
										++var12;
									} while (~var12 > ~var24);
								}
							} while (var23);
						}
						
						bd.K = og.Z[var24];
						m.B = og.Q[var24] = var20;
						var25 = og.qb[var24];
						if (je.Z != 0) {
							ia.Y.b(var25, var2 + bd.K, m.B + var3, 16776960, 0);
							if (var16 == 0) {
								++var24;
								continue;
							}
						}
						
						var13 = 16776960;
						if (~og.hb[var24] > -7) {
							var13 = me.n[og.hb[var24]];
							if (og.hb[var24] == 6) {
								var13 = ~(ed.d % 20) <= -11 ? 16776960 : 16711680;
							}
						} else if (og.hb[var24] == 6) {
							var13 = ~(ed.d % 20) <= -11 ? 16776960 : 16711680;
						}
						
						if (og.hb[var24] == 7) {
							var13 = ~(ed.d % 20) > -11 ? 255 : '\uffff';
							if (og.hb[var24] == 8) {
								var13 = ~(ed.d % 20) <= -11 ? 8454016 : '뀀';
							}
						} else if (og.hb[var24] == 8) {
							var13 = ~(ed.d % 20) <= -11 ? 8454016 : '뀀';
						}
						
						if (~og.hb[var24] == -10) {
							var14 = -og.v[var24] + 150;
							if (~var14 <= -51) {
								label895:
								{
									if (var14 < 100) {
										var13 = 16776960 + -(327680 * (var14 - 50));
										if (var16 == 0) {
											break label895;
										}
									}
									
									if (var14 < 150) {
										var13 = 'ﴌ' - -(var14 * 5);
										if (var16 != 0) {
											var13 = 16711680 + var14 * 1280;
										}
									}
								}
							} else {
								var13 = 16711680 + var14 * 1280;
							}
						}
						
						if (~og.hb[var24] == -11) {
							var14 = -og.v[var24] + 150;
							if (~var14 <= -51) {
								label919:
								{
									if (var14 >= 100) {
										if (var14 >= 150) {
											break label919;
										}
										
										var13 = 327680 * var14 + -32768000 + 255 + -((-100 + var14) * 5);
										if (var16 == 0) {
											break label919;
										}
									}
									
									var13 = 16384000 + -(327680 * var14) + 16711935;
									if (var16 != 0) {
										var13 = 5 * var14 + 16711680;
									}
								}
							} else {
								var13 = 5 * var14 + 16711680;
							}
						}
						
						if (~og.hb[var24] == -12) {
							var14 = 150 + -og.v[var24];
							if (var14 >= 50) {
								label944:
								{
									if (var14 < 100) {
										var13 = -16384250 - -(var14 * 327685) + '\uff00';
										if (var16 == 0) {
											break label944;
										}
									}
									
									if (var14 < 150) {
										var13 = 16777215 + -((-100 + var14) * 327680);
										if (var16 != 0) {
											var13 = 16777215 - 327685 * var14;
										}
									}
								}
							} else {
								var13 = 16777215 - 327685 * var14;
							}
						}
						
						if (~og.x[var24] == -1) {
							ia.Y.b(var25, var2 - -bd.K, var3 + m.B, var13, 0);
						}
						
						if (og.x[var24] == 1) {
							ia.Y.b(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d);
						}
						
						if (og.x[var24] == 2) {
							ia.Y.a(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d);
						}
						
						if (~og.x[var24] == -4) {
							ia.Y.a(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d, -og.v[var24] + 150);
						}
						
						if (~og.x[var24] == -5) {
							var14 = (150 - og.v[var24]) * (100 + ia.Y.b(var25)) / 150;
							oi.e(-50 + (var2 - -bd.K), var3, var2 + bd.K - -50, var1 + var3);
							ia.Y.a(var25, 50 + var2 + bd.K + -var14, var3 + m.B, var13, 0);
							oi.b(var2, var3, var2 + var4, var3 - -var1);
						}
						
						if (og.x[var24] == 5) {
							var14 = 150 + -og.v[var24];
							oi.e(var2, var3 - (-m.B - (-ia.Y.bb + -1)), var2 + var4, var3 + m.B + 5);
							var15 = 0;
							if (var14 < 25) {
								var15 = -25 + var14;
								if (var16 != 0 && ~var14 < -126) {
									var15 = -125 + var14;
								}
							} else if (~var14 < -126) {
								var15 = -125 + var14;
							}
							
							ia.Y.b(var25, var2 - -bd.K, var15 + var3 + m.B, var13, 0);
							oi.b(var2, var3, var2 + var4, var3 + var1);
							++var24;
						} else {
							++var24;
						}
					} while (~wd.g < ~var24);
					
					return;
				}
				
				if (~var5 != 0) {
					if (~var5 > ~se.b) {
						var6 = lg.j[si.cb[var5]];
						if (var16 != 0) {
							var6 = ai.M[ud.Xb[var5 + -se.b]];
							if (var16 != 0) {
								var6 = le.T;
							}
						}
					} else {
						var6 = ai.M[ud.Xb[var5 + -se.b]];
						if (var16 != 0) {
							var6 = le.T;
						}
					}
				} else {
					var6 = le.T;
				}
			}
			
			while (true) {
				if (var6 == null) {
					++var5;
				} else if (!((ud) var6).b((byte) 86) && var16 == 0) {
					++var5;
				} else {
					label1130:
					{
						ai var7;
						if (var6 instanceof nb) {
							var7 = ((nb) var6).pc;
							if (var7.lb != null) {
								var7 = var7.b((byte) 121);
							}
							
							if (var7 == null && var16 == 0) {
								++var5;
								break label1130;
							}
						}
						
						label1091:
						{
							ki[] var19;
							ki var22;
							if (~var5 > ~se.b) {
								dg var8 = (dg) var6;
								var18 = 30;
								if (var8.Ec == -1) {
									if (var8.lc != -1) {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 94) - -15);
										if (~bd.K < 0) {
											if (var8.Ec != -1) {
												mf.eb[var8.Ec].c(var2 - (-bd.K + 12), m.B + var3 + -var18);
												var18 += 25;
											}
											
											if (~var8.lc != 0) {
												ca.kb[var8.lc].c(var2 + bd.K + -12, m.B + var3 + -var18);
												var18 += 25;
											}
										}
									}
								} else {
									ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 94) - -15);
									if (~bd.K < 0) {
										if (var8.Ec != -1) {
											mf.eb[var8.Ec].c(var2 - (-bd.K + 12), m.B + var3 + -var18);
											var18 += 25;
										}
										
										if (~var8.lc != 0) {
											ca.kb[var8.lc].c(var2 + bd.K + -12, m.B + var3 + -var18);
											var18 += 25;
										}
									}
								}
								
								if (var5 < 0) {
									if (((ud) var6).Bb != null) {
										if (var5 < se.b) {
											if (gg.w != 0) {
												if (~gg.w != -4) {
													if (gg.w == 1 && ph.a(((dg) var6).Ic, (byte) -115)) {
														ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
														if (bd.K > -1 && ~og.cb < ~wd.g) {
															og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
															og.w[wd.g] = ia.Y.bb;
															og.Z[wd.g] = bd.K;
															og.Q[wd.g] = m.B;
															og.hb[wd.g] = ((ud) var6).ac;
															og.x[wd.g] = ((ud) var6).anInt_ob;
															og.v[wd.g] = ((ud) var6).Vb;
															og.qb[wd.g] = ((ud) var6).Bb;
															++wd.g;
														}
													}
												} else {
													ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
													if (bd.K > -1 && ~og.cb < ~wd.g) {
														og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
														og.w[wd.g] = ia.Y.bb;
														og.Z[wd.g] = bd.K;
														og.Q[wd.g] = m.B;
														og.hb[wd.g] = ((ud) var6).ac;
														og.x[wd.g] = ((ud) var6).anInt_ob;
														og.v[wd.g] = ((ud) var6).Vb;
														og.qb[wd.g] = ((ud) var6).Bb;
														++wd.g;
													}
												}
											} else {
												ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
												if (bd.K > -1 && ~og.cb < ~wd.g) {
													og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
													og.w[wd.g] = ia.Y.bb;
													og.Z[wd.g] = bd.K;
													og.Q[wd.g] = m.B;
													og.hb[wd.g] = ((ud) var6).ac;
													og.x[wd.g] = ((ud) var6).anInt_ob;
													og.v[wd.g] = ((ud) var6).Vb;
													og.qb[wd.g] = ((ud) var6).Bb;
													++wd.g;
												}
											}
										} else {
											ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
											if (bd.K > -1 && ~og.cb < ~wd.g) {
												og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
												og.w[wd.g] = ia.Y.bb;
												og.Z[wd.g] = bd.K;
												og.Q[wd.g] = m.B;
												og.hb[wd.g] = ((ud) var6).ac;
												og.x[wd.g] = ((ud) var6).anInt_ob;
												og.v[wd.g] = ((ud) var6).Vb;
												og.qb[wd.g] = ((ud) var6).Bb;
												++wd.g;
											}
										}
									}
									
									if (~((ud) var6).Pb < ~bi.f) {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 123) + 15);
										if (~bd.K < 0) {
											oi.d(var2 - (-bd.K + 15), var3 + (m.B - 3), ((ud) var6).yb, 5, '\uff00');
											oi.d(var2 - -bd.K - 15 + ((ud) var6).yb, m.B + var3 + -3, -((ud) var6).yb + 30, 5, 16711680);
										}
									}
									
									var18 = 0;
									if (var16 != 0) {
										if (((ud) var6).kb[var18] > bi.f) {
											ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 69) / 2);
											if (~bd.K < 0) {
												if (~var18 == -2) {
													m.B -= 20;
												}
												
												if (~var18 == -3) {
													bd.K -= 15;
													m.B -= 10;
												}
												
												if (~var18 == -4) {
													m.B -= 10;
													bd.K += 15;
												}
												
												re.t[((ud) var6).fc[var18]].c(-12 + var2 + bd.K, m.B + var3 + -12);
												qf.H.b(hh.a((byte) 93, ((ud) var6).Db[var18]), -1 + var2 - -bd.K, 3 + var3 + m.B, 16777215, 0);
											}
										}
										
										++var18;
									}
									break label1091;
								}
								
								ki[] var9 = ua.kis_a;
								var10 = 0;
								ki var11;
								if (var16 != 0) {
									var11 = var9[var10];
									if (var11 != null && var11.f == 10 && var11.c == si.cb[var5]) {
										ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 54));
										if (~bd.K < 0) {
											gg.u[var11.k].c(-12 + bd.K + var2, var3 - -m.B - var18);
										}
									}
									
									++var10;
								}
								
								for (; ~var9.length < ~var10; ++var10) {
									var11 = var9[var10];
									if (var11 != null && var11.f == 10 && var11.c == si.cb[var5]) {
										ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 54));
										if (~bd.K < 0) {
											gg.u[var11.k].c(-12 + bd.K + var2, var3 - -m.B - var18);
										}
									}
								}
								
								if (var16 == 0) {
									if (((ud) var6).Bb != null) {
										if (var5 < se.b) {
											if (gg.w != 0) {
												if (~gg.w != -4) {
													if (gg.w == 1 && ph.a(((dg) var6).Ic, (byte) -115)) {
														ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
														if (bd.K > -1 && ~og.cb < ~wd.g) {
															og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
															og.w[wd.g] = ia.Y.bb;
															og.Z[wd.g] = bd.K;
															og.Q[wd.g] = m.B;
															og.hb[wd.g] = ((ud) var6).ac;
															og.x[wd.g] = ((ud) var6).anInt_ob;
															og.v[wd.g] = ((ud) var6).Vb;
															og.qb[wd.g] = ((ud) var6).Bb;
															++wd.g;
														}
													}
												} else {
													ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
													if (bd.K > -1 && ~og.cb < ~wd.g) {
														og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
														og.w[wd.g] = ia.Y.bb;
														og.Z[wd.g] = bd.K;
														og.Q[wd.g] = m.B;
														og.hb[wd.g] = ((ud) var6).ac;
														og.x[wd.g] = ((ud) var6).anInt_ob;
														og.v[wd.g] = ((ud) var6).Vb;
														og.qb[wd.g] = ((ud) var6).Bb;
														++wd.g;
													}
												}
											} else {
												ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
												if (bd.K > -1 && ~og.cb < ~wd.g) {
													og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
													og.w[wd.g] = ia.Y.bb;
													og.Z[wd.g] = bd.K;
													og.Q[wd.g] = m.B;
													og.hb[wd.g] = ((ud) var6).ac;
													og.x[wd.g] = ((ud) var6).anInt_ob;
													og.v[wd.g] = ((ud) var6).Vb;
													og.qb[wd.g] = ((ud) var6).Bb;
													++wd.g;
												}
											}
										} else {
											ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
											if (bd.K > -1 && ~og.cb < ~wd.g) {
												og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
												og.w[wd.g] = ia.Y.bb;
												og.Z[wd.g] = bd.K;
												og.Q[wd.g] = m.B;
												og.hb[wd.g] = ((ud) var6).ac;
												og.x[wd.g] = ((ud) var6).anInt_ob;
												og.v[wd.g] = ((ud) var6).Vb;
												og.qb[wd.g] = ((ud) var6).Bb;
												++wd.g;
											}
										}
									}
									
									if (~((ud) var6).Pb < ~bi.f) {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 123) + 15);
										if (~bd.K < 0) {
											oi.d(var2 - (-bd.K + 15), var3 + (m.B - 3), ((ud) var6).yb, 5, '\uff00');
											oi.d(var2 - -bd.K - 15 + ((ud) var6).yb, m.B + var3 + -3, -((ud) var6).yb + 30, 5, 16711680);
										}
									}
									
									var18 = 0;
									if (var16 != 0) {
										if (((ud) var6).kb[var18] > bi.f) {
											ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 69) / 2);
											if (~bd.K < 0) {
												if (~var18 == -2) {
													m.B -= 20;
												}
												
												if (~var18 == -3) {
													bd.K -= 15;
													m.B -= 10;
												}
												
												if (~var18 == -4) {
													m.B -= 10;
													bd.K += 15;
												}
												
												re.t[((ud) var6).fc[var18]].c(-12 + var2 + bd.K, m.B + var3 + -12);
												qf.H.b(hh.a((byte) 93, ((ud) var6).Db[var18]), -1 + var2 - -bd.K, 3 + var3 + m.B, 16777215, 0);
											}
										}
										
										++var18;
									}
									break label1091;
								}
								
								var7 = ((nb) var6).pc;
								if (var7.lb != null) {
									var7 = var7.b((byte) 124);
									if (var7.mb >= 0 && ~ca.kb.length < ~var7.mb) {
										ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 95));
										if (bd.K > -1) {
											ca.kb[var7.mb].c(-12 + var2 + bd.K, m.B + var3 - 30);
										}
									}
								} else if (var7.mb >= 0 && ~ca.kb.length < ~var7.mb) {
									ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 95));
									if (bd.K > -1) {
										ca.kb[var7.mb].c(-12 + var2 + bd.K, m.B + var3 - 30);
									}
								}
								
								var19 = ua.kis_a;
								var21 = 0;
								if (var16 != 0) {
									var22 = var19[var21];
									if (var22 != null && ~var22.f == -2 && ud.Xb[-se.b + var5] == var22.c && ~(bi.f % 20) > -11) {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 61) - -15);
										if (~bd.K < 0) {
											gg.u[var22.k].c(var2 + (bd.K - 12), m.B + var3 + -28);
										}
									}
									
									++var21;
								}
							} else {
								var7 = ((nb) var6).pc;
								if (var7.lb != null) {
									var7 = var7.b((byte) 124);
									if (var7.mb >= 0 && ~ca.kb.length < ~var7.mb) {
										ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 95));
										if (bd.K > -1) {
											ca.kb[var7.mb].c(-12 + var2 + bd.K, m.B + var3 - 30);
										}
									}
								} else if (var7.mb >= 0 && ~ca.kb.length < ~var7.mb) {
									ed.a((ud) var6, (byte) -8, 15 + ((ud) var6).c((byte) 95));
									if (bd.K > -1) {
										ca.kb[var7.mb].c(-12 + var2 + bd.K, m.B + var3 - 30);
									}
								}
								
								var19 = ua.kis_a;
								var21 = 0;
								if (var16 != 0) {
									var22 = var19[var21];
									if (var22 != null && ~var22.f == -2 && ud.Xb[-se.b + var5] == var22.c && ~(bi.f % 20) > -11) {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 61) - -15);
										if (~bd.K < 0) {
											gg.u[var22.k].c(var2 + (bd.K - 12), m.B + var3 + -28);
										}
									}
									
									++var21;
								}
							}
							
							for (; ~var21 > ~var19.length; ++var21) {
								var22 = var19[var21];
								if (var22 != null && ~var22.f == -2 && ud.Xb[-se.b + var5] == var22.c && ~(bi.f % 20) > -11) {
									ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 61) - -15);
									if (~bd.K < 0) {
										gg.u[var22.k].c(var2 + (bd.K - 12), m.B + var3 + -28);
									}
								}
							}
							
							if (((ud) var6).Bb != null) {
								if (var5 < se.b) {
									if (gg.w != 0) {
										if (~gg.w != -4) {
											if (gg.w == 1 && ph.a(((dg) var6).Ic, (byte) -115)) {
												ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
												if (bd.K > -1 && ~og.cb < ~wd.g) {
													og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
													og.w[wd.g] = ia.Y.bb;
													og.Z[wd.g] = bd.K;
													og.Q[wd.g] = m.B;
													og.hb[wd.g] = ((ud) var6).ac;
													og.x[wd.g] = ((ud) var6).anInt_ob;
													og.v[wd.g] = ((ud) var6).Vb;
													og.qb[wd.g] = ((ud) var6).Bb;
													++wd.g;
												}
											}
										} else {
											ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
											if (bd.K > -1 && ~og.cb < ~wd.g) {
												og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
												og.w[wd.g] = ia.Y.bb;
												og.Z[wd.g] = bd.K;
												og.Q[wd.g] = m.B;
												og.hb[wd.g] = ((ud) var6).ac;
												og.x[wd.g] = ((ud) var6).anInt_ob;
												og.v[wd.g] = ((ud) var6).Vb;
												og.qb[wd.g] = ((ud) var6).Bb;
												++wd.g;
											}
										}
									} else {
										ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
										if (bd.K > -1 && ~og.cb < ~wd.g) {
											og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
											og.w[wd.g] = ia.Y.bb;
											og.Z[wd.g] = bd.K;
											og.Q[wd.g] = m.B;
											og.hb[wd.g] = ((ud) var6).ac;
											og.x[wd.g] = ((ud) var6).anInt_ob;
											og.v[wd.g] = ((ud) var6).Vb;
											og.qb[wd.g] = ((ud) var6).Bb;
											++wd.g;
										}
									}
								} else {
									ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 55));
									if (bd.K > -1 && ~og.cb < ~wd.g) {
										og.F[wd.g] = ia.Y.b(((ud) var6).Bb) / 2;
										og.w[wd.g] = ia.Y.bb;
										og.Z[wd.g] = bd.K;
										og.Q[wd.g] = m.B;
										og.hb[wd.g] = ((ud) var6).ac;
										og.x[wd.g] = ((ud) var6).anInt_ob;
										og.v[wd.g] = ((ud) var6).Vb;
										og.qb[wd.g] = ((ud) var6).Bb;
										++wd.g;
									}
								}
							}
							
							if (~((ud) var6).Pb < ~bi.f) {
								ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 123) + 15);
								if (~bd.K < 0) {
									oi.d(var2 - (-bd.K + 15), var3 + (m.B - 3), ((ud) var6).yb, 5, '\uff00');
									oi.d(var2 - -bd.K - 15 + ((ud) var6).yb, m.B + var3 + -3, -((ud) var6).yb + 30, 5, 16711680);
								}
							}
							
							var18 = 0;
							if (var16 != 0) {
								if (((ud) var6).kb[var18] > bi.f) {
									ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 69) / 2);
									if (~bd.K < 0) {
										if (~var18 == -2) {
											m.B -= 20;
										}
										
										if (~var18 == -3) {
											bd.K -= 15;
											m.B -= 10;
										}
										
										if (~var18 == -4) {
											m.B -= 10;
											bd.K += 15;
										}
										
										re.t[((ud) var6).fc[var18]].c(-12 + var2 + bd.K, m.B + var3 + -12);
										qf.H.b(hh.a((byte) 93, ((ud) var6).Db[var18]), -1 + var2 - -bd.K, 3 + var3 + m.B, 16777215, 0);
									}
								}
								
								++var18;
							}
						}
						
						for (; var18 < 4; ++var18) {
							if (((ud) var6).kb[var18] > bi.f) {
								ed.a((ud) var6, (byte) -8, ((ud) var6).c((byte) 69) / 2);
								if (~bd.K < 0) {
									if (~var18 == -2) {
										m.B -= 20;
									}
									
									if (~var18 == -3) {
										bd.K -= 15;
										m.B -= 10;
									}
									
									if (~var18 == -4) {
										m.B -= 10;
										bd.K += 15;
									}
									
									re.t[((ud) var6).fc[var18]].c(-12 + var2 + bd.K, m.B + var3 + -12);
									qf.H.b(hh.a((byte) 93, ((ud) var6).Db[var18]), -1 + var2 - -bd.K, 3 + var3 + m.B, 16777215, 0);
								}
							}
						}
						
						++var5;
					}
				}
				
				if (tf.n + se.b <= var5) {
					if (var0) {
						G = null;
					}
					
					var24 = 0;
					if (var16 == 0 && ~wd.g >= ~var24) {
						return;
					}
					
					do {
						var21 = og.F[var24];
						var10 = og.w[var24];
						var20 = og.Q[var24];
						var23 = true;
						var18 = og.Z[var24];
						if (var16 != 0 || var23) {
							do {
								var23 = false;
								var12 = 0;
								if (var16 != 0 || ~var12 > ~var24) {
									do {
										if (~(-og.w[var12] + og.Q[var12]) > ~(var20 - -2) && ~(2 + og.Q[var12]) < ~(var20 - var10) && ~(og.F[var12] + og.Z[var12]) < ~(-var21 + var18) && var21 + var18 > og.Z[var12] - og.F[var12] && ~(og.Q[var12] + -og.w[var12]) > ~var20) {
											var23 = true;
											var20 = og.Q[var12] + -og.w[var12];
										}
										
										++var12;
									} while (~var12 > ~var24);
								}
							} while (var23);
						}
						
						bd.K = og.Z[var24];
						m.B = og.Q[var24] = var20;
						var25 = og.qb[var24];
						if (je.Z != 0) {
							ia.Y.b(var25, var2 + bd.K, m.B + var3, 16776960, 0);
							if (var16 == 0) {
								++var24;
								continue;
							}
						}
						
						var13 = 16776960;
						if (~og.hb[var24] > -7) {
							var13 = me.n[og.hb[var24]];
							if (og.hb[var24] == 6) {
								var13 = ~(ed.d % 20) <= -11 ? 16776960 : 16711680;
							}
						} else if (og.hb[var24] == 6) {
							var13 = ~(ed.d % 20) <= -11 ? 16776960 : 16711680;
						}
						
						if (og.hb[var24] == 7) {
							var13 = ~(ed.d % 20) > -11 ? 255 : '\uffff';
							if (og.hb[var24] == 8) {
								var13 = ~(ed.d % 20) <= -11 ? 8454016 : '뀀';
							}
						} else if (og.hb[var24] == 8) {
							var13 = ~(ed.d % 20) <= -11 ? 8454016 : '뀀';
						}
						
						if (~og.hb[var24] == -10) {
							var14 = -og.v[var24] + 150;
							if (~var14 <= -51) {
								label316:
								{
									if (var14 < 100) {
										var13 = 16776960 + -(327680 * (var14 - 50));
										if (var16 == 0) {
											break label316;
										}
									}
									
									if (var14 < 150) {
										var13 = 'ﴌ' - -(var14 * 5);
										if (var16 != 0) {
											var13 = 16711680 + var14 * 1280;
										}
									}
								}
							} else {
								var13 = 16711680 + var14 * 1280;
							}
						}
						
						if (~og.hb[var24] == -11) {
							var14 = -og.v[var24] + 150;
							if (~var14 <= -51) {
								label309:
								{
									if (var14 >= 100) {
										if (var14 >= 150) {
											break label309;
										}
										
										var13 = 327680 * var14 + -32768000 + 255 + -((-100 + var14) * 5);
										if (var16 == 0) {
											break label309;
										}
									}
									
									var13 = 16384000 + -(327680 * var14) + 16711935;
									if (var16 != 0) {
										var13 = 5 * var14 + 16711680;
									}
								}
							} else {
								var13 = 5 * var14 + 16711680;
							}
						}
						
						if (~og.hb[var24] == -12) {
							var14 = 150 + -og.v[var24];
							if (var14 >= 50) {
								label300:
								{
									if (var14 < 100) {
										var13 = -16384250 - -(var14 * 327685) + '\uff00';
										if (var16 == 0) {
											break label300;
										}
									}
									
									if (var14 < 150) {
										var13 = 16777215 + -((-100 + var14) * 327680);
										if (var16 != 0) {
											var13 = 16777215 - 327685 * var14;
										}
									}
								}
							} else {
								var13 = 16777215 - 327685 * var14;
							}
						}
						
						if (~og.x[var24] == -1) {
							ia.Y.b(var25, var2 - -bd.K, var3 + m.B, var13, 0);
						}
						
						if (og.x[var24] == 1) {
							ia.Y.b(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d);
						}
						
						if (og.x[var24] == 2) {
							ia.Y.a(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d);
						}
						
						if (~og.x[var24] == -4) {
							ia.Y.a(var25, bd.K + var2, var3 + m.B, var13, 0, ed.d, -og.v[var24] + 150);
						}
						
						if (~og.x[var24] == -5) {
							var14 = (150 - og.v[var24]) * (100 + ia.Y.b(var25)) / 150;
							oi.e(-50 + (var2 - -bd.K), var3, var2 + bd.K - -50, var1 + var3);
							ia.Y.a(var25, 50 + var2 + bd.K + -var14, var3 + m.B, var13, 0);
							oi.b(var2, var3, var2 + var4, var3 - -var1);
						}
						
						if (og.x[var24] == 5) {
							var14 = 150 + -og.v[var24];
							oi.e(var2, var3 - (-m.B - (-ia.Y.bb + -1)), var2 + var4, var3 + m.B + 5);
							var15 = 0;
							if (var14 < 25) {
								var15 = -25 + var14;
								if (var16 != 0 && ~var14 < -126) {
									var15 = -125 + var14;
								}
							} else if (~var14 < -126) {
								var15 = -125 + var14;
							}
							
							ia.Y.b(var25, var2 - -bd.K, var15 + var3 + m.B, var13, 0);
							oi.b(var2, var3, var2 + var4, var3 + var1);
							++var24;
						} else {
							++var24;
						}
					} while (~wd.g < ~var24);
					
					return;
				}
				
				if (~var5 != 0) {
					if (~var5 > ~se.b) {
						var6 = lg.j[si.cb[var5]];
						if (var16 != 0) {
							var6 = ai.M[ud.Xb[var5 + -se.b]];
							if (var16 != 0) {
								var6 = le.T;
							}
						}
					} else {
						var6 = ai.M[ud.Xb[var5 + -se.b]];
						if (var16 != 0) {
							var6 = le.T;
						}
					}
				} else {
					var6 = le.T;
				}
			}
		} catch (RuntimeException var17) {
			throw bc.a(var17, "qb.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static void b(int var0, int var1) {
		pd var2 = nb.oc[0][var0][var1];
		
		for (int var3 = 0; var3 < 3; ++var3) {
			pd var4 = nb.oc[var3][var0][var1] = nb.oc[var3 + 1][var0][var1];
			if (var4 != null) {
				--var4.t;
				
				for (int var5 = 0; var5 < var4.B; ++var5) {
					ah var6 = var4.D[var5];
					if ((var6.b >> 29 & 3L) == 2L && var6.q == var0 && var6.d == var1) {
						--var6.k;
					}
				}
			}
		}
		
		if (nb.oc[0][var0][var1] == null) {
			nb.oc[0][var0][var1] = new pd(0, var0, var1);
		}
		
		nb.oc[0][var0][var1].v = var2;
		nb.oc[3][var0][var1] = null;
	}
	
	static void a(int var0, int var1, int var2, byte var3, int var4) {
		try {
			if (var3 == 55) {
				gh.R = var1;
				na.anInt_m = var4;
				ng.u = var0;
				dd.a = var2;
				++K;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "qb.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static int c(int var0, int var1) {
		try {
			++O;
			return var1 >= -113 ? 123 : (var0 & 954673) >> 17;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "qb.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			if (gh.R <= var2 && ~ng.u <= ~var2) {
				var0 = kg.a(dd.a, na.anInt_m, true, var0);
				var4 = kg.a(dd.a, na.anInt_m, true, var4);
				gf.a(var2, var1, var4, var0, 0);
			}
			
			if (var3 != 27908) {
				G = null;
			}
			
			++J;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "qb.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static kg a(int var0, int var1, int var2, Component component) {
		try {
			++D;
			
			try {
				Class class_k = Class.forName("k");
				if (var2 != 100) {
					a(-94, -4, 102, null);
				}
				
				kg kg = (kg) class_k.newInstance();
				kg.a(var0, 20053, component, var1);
				return kg;
			} catch (Throwable var6) {
				mc mc = new mc();
				mc.a(var0, 20053, component, var1);
				return mc;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "qb.D(" + var0 + ',' + var1 + ',' + var2 + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			I = null;
			L = null;
			if (var0 != 5) {
				c(26, -84);
			}
			
			H = null;
			G = null;
			N = null;
			M = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qb.F(" + var0 + ')');
		}
	}
	
	static {
		int var0 = 2;
		
		for (int var1 = 0; var1 < 32; ++var1) {
			H[var1] = -1 + var0;
			var0 += var0;
		}
		
		N = rf.a(40, "FULL");
		I = new int[104][104];
		L = rf.a(40, "Der Server wird gerade aktualisiert)3");
		M = N;
		gameState = 0;
	}
}
