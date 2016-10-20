final class ed {
	
	static ob rect_debugCommand = rf.a(40, "::rect_debug");
	static int b;
	static ob ob_c = rf.a(40, "und die Schaltfl-=che (WSpielkonto erstellen(W am");
	static int d = 0;
	static int[] ints_e = new int[99];
	static int f;
	static int anInt_g = 0;
	static int anInt_h;
	static ob i;
	static ob j;
	static ja k;
	
	static void a(ra var0, byte var1, int var2, int var3) {
		int var14 = client.anInt_wb;
		
		try {
			if (~var0.uc == -2) {
				ge.a(lb.T, var0.sc, 0, (short) 39, 0L, 0, var0.Ec);
				++bh.k;
			}
			
			++anInt_h;
			if (~var0.uc == -3 && !g.O) {
				ob var4 = e.a((byte) -11, var0);
				if (var4 != null) {
					++dh.f;
					ge.a(wc.a(new ob[] {th.T, var0.Bb}, -3), var4, 0, (short) 36, 0L, -1, var0.Ec);
				}
			}
			
			if (~var0.uc == -4) {
				ge.a(lb.T, g.Y, 0, (short) 12, 0L, 0, var0.Ec);
				++tf.f;
			}
			
			if (~var0.uc == -5) {
				ge.a(lb.T, var0.sc, 0, (short) 50, 0L, 0, var0.Ec);
				++qc.w;
			}
			
			if (var0.uc == 5) {
				ge.a(lb.T, var0.sc, 0, (short) 25, 0L, 0, var0.Ec);
				++pb.c;
			}
			
			if (var0.uc == 6 && sb.Z == null) {
				++pa.j;
				ge.a(lb.T, var0.sc, 0, (short) 35, 0L, -1, var0.Ec);
			}
			
			int var5;
			int var7;
			if (var0.Ac == 2) {
				var5 = 0;
				int var6 = 0;
				if (var14 != 0 || var6 < var0.w) {
					do {
						var7 = 0;
						if (var14 != 0 || var7 < var0.L) {
							do {
								int var9 = var6 * (32 + var0.hb);
								int var8 = (32 - -var0.Ab) * var7;
								if (~var5 > -21) {
									var9 += var0.d[var5];
									var8 += var0.m[var5];
								}
								
								if (var8 <= var3 && var9 <= var2 && var8 - -32 > var3 && ~var2 > ~(32 + var9)) {
									wa.w = var5;
									ib.f = var0;
									if (~var0.ints_tc[var5] < -1) {
										label321:
										{
											ei var10 = jg.a((byte) -61, var0.ints_tc[var5] + -1);
											if (ch.cb == 1 && hf.a(70, (int) ce.a(var0, 18125))) {
												if (var0.Ec == be.b && var5 == ae.Mb) {
													break label321;
												}
												
												ge.a(wc.a(new ob[] {s.R, vf.w, var10.name}, -3), fh.h, 0, (short) 21, (long) var10.jb, var5, var0.Ec);
												++vg.V;
												if (var14 == 0) {
													break label321;
												}
											}
											
											if (g.O && hf.a(67, (int) ce.a(var0, 18125))) {
												if (~(16 & lb.ub) != -17) {
													break label321;
												}
												
												++h.nb;
												ge.a(wc.a(new ob[] {sf.g, vf.w, var10.name}, -3), ac.s, 0, (short) 20, (long) var10.jb, var5, var0.Ec);
												if (var14 == 0) {
													break label321;
												}
											}
											
											++hh.N;
											ob[] var11 = var10.inventoryOption;
											if (hb.x) {
												var11 = tf.a(true, var11);
											}
											
											int var12;
											byte var13;
											if (hf.a(81, (int) ce.a(var0, 18125))) {
												var12 = 4;
												if (var14 != 0 || ~var12 <= -4) {
													do {
														if (var11 == null || var11[var12] == null) {
															if (var12 != 4) {
																--var12;
																continue;
															}
															
															++c.W;
															ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), ta.drop2, 0, (short) 58, (long) var10.jb, var5, var0.Ec);
															if (var14 == 0) {
																--var12;
																continue;
															}
														}
														
														++ai.vb;
														if (var12 != 3) {
															var13 = 58;
															if (var14 != 0) {
																var13 = 28;
															}
														} else {
															var13 = 28;
														}
														
														ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), var11[var12], 0, var13, (long) var10.jb, var5, var0.Ec);
														--var12;
													} while (~var12 <= -4);
												}
											}
											
											if (ag.a(ce.a(var0, 18125), 4)) {
												ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), fh.h, 0, (short) 3, (long) var10.jb, var5, var0.Ec);
												++client.anInt_fb;
											}
											
											if (hf.a(94, (int) ce.a(var0, 18125)) && var11 != null) {
												var12 = 2;
												if (var14 != 0 || var12 >= 0) {
													do {
														if (var11[var12] != null) {
															++ie.y;
															var13 = 0;
															if (var12 == 0) {
																var13 = 10;
															}
															
															if (~var12 == -2) {
																var13 = 31;
															}
															
															if (~var12 == -3) {
																var13 = 1;
															}
															
															ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), var11[var12], 0, var13, (long) var10.jb, var5, var0.Ec);
														}
														
														--var12;
													} while (var12 >= 0);
												}
											}
											
											var11 = var0.jc;
											if (hb.x) {
												var11 = tf.a(true, var11);
											}
											
											if (var11 != null) {
												var12 = 4;
												if (var14 != 0 || ~var12 <= -1) {
													do {
														if (var11[var12] != null) {
															++rd.F;
															var13 = 0;
															if (var12 == 0) {
																var13 = 49;
															}
															
															if (~var12 == -2) {
																var13 = 7;
															}
															
															if (~var12 == -3) {
																var13 = 8;
															}
															
															if (var12 == 3) {
																var13 = 33;
															}
															
															if (var12 == 4) {
																var13 = 4;
															}
															
															ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), var11[var12], 0, var13, (long) var10.jb, var5, var0.Ec);
														}
														
														--var12;
													} while (~var12 <= -1);
												}
											}
											
											ge.a(wc.a(new ob[] {le.cb, var10.name}, -3), jg.c, 0, (short) 1001, (long) var10.jb, var5, var0.Ec);
										}
									}
								}
								
								++var5;
								++var7;
							} while (var7 < var0.L);
						}
						
						++var6;
					} while (var6 < var0.w);
				}
			}
			
			if (var0.R) {
				if (g.O) {
					if (oc.a(ce.a(var0, 18125), 10) && ~(lb.ub & 32) == -33) {
						++ra.fc;
						ge.a(wc.a(new ob[] {sf.g, lf.w, var0.Mb}, -3), ac.s, 0, (short) 22, 0L, var0.Rb, var0.Ec);
						return;
					}
				} else {
					var5 = 9;
					ob var17;
					if (var14 != 0 || var5 >= 5) {
						do {
							var17 = bg.a(var5, true, var0);
							if (var17 != null) {
								ge.a(var0.Mb, var17, 0, (short) 1003, (long) (var5 - -1), var0.Rb, var0.Ec);
								++ea.V;
							}
							
							--var5;
						} while (var5 >= 5);
					}
					
					var17 = e.a((byte) -11, var0);
					if (var17 != null) {
						ge.a(var0.Mb, var17, 0, (short) 36, 0L, var0.Rb, var0.Ec);
						++dh.f;
					}
					
					var7 = 4;
					if (var14 != 0 || ~var7 <= -1) {
						do {
							ob var18 = bg.a(var7, true, var0);
							if (var18 != null) {
								++ea.V;
								ge.a(var0.Mb, var18, 0, (short) 15, (long) (var7 - -1), var0.Rb, var0.Ec);
							}
							
							--var7;
						} while (~var7 <= -1);
					}
					
					if (!pg.d(ce.a(var0, 18125), (byte) 42)) {
						return;
					}
					
					ge.a(lb.T, kd.gb, 0, (short) 35, 0L, var0.Rb, var0.Ec);
					++pa.j;
				}
				
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "ed.D(" + "{...}" + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			if (var0 != -24701) {
				a(-59, 23, -70);
			}
			
			ints_e = null;
			k = null;
			rect_debugCommand = null;
			ob_c = null;
			i = null;
			j = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ed.B(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			if (var2 > -57) {
				anInt_g = -110;
			}
			
			int var3;
			if (~var0 != ~lh.eb) {
				bd.J = new int[var0];
				var3 = 0;
				if (var4 != 0 || var0 > var3) {
					do {
						bd.J[var3] = (var3 << 12) / var0;
						++var3;
					} while (var0 > var3);
				}
				
				lh.eb = var0;
				kg.b = var0 + -1;
				qd.E = ~var0 == -65 ? 2048 : 4096;
			}
			
			if (~fi.q != ~var1) {
				label63:
				{
					if (~fi.q == ~lh.eb) {
						rh.r = bd.J;
						if (var4 == 0) {
							break label63;
						}
					}
					
					rh.r = new int[var1];
					var3 = 0;
					if (var4 != 0 || ~var1 < ~var3) {
						do {
							rh.r[var3] = (var3 << 12) / var1;
							++var3;
						} while (~var1 < ~var3);
					}
				}
				
				fc.jb = var1 - 1;
				fi.q = var1;
			}
			
			++f;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ed.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(ud var0, byte var1, int var2) {
		try {
			me.a(var2, var0.coordY, var0.coordX, (byte) -25);
			if (var1 == -8) {
				++b;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ed.C(" + "{...}" + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		int var0 = 0;
		
		for (int var1 = 0; ~var1 > -100; ++var1) {
			int var2 = 1 + var1;
			int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
			var0 += var3;
			ints_e[var1] = var0 / 4;
		}
		
		i = rf.a(40, "Fehler beim Laden Ihres Spielcharakters)3");
		j = rf.a(40, " ");
	}
}
