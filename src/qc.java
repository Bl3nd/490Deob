final class qc extends vd {
	
	qe o;
	static pe cacheFile7;
	static int q = -1;
	byte[] bytes_r;
	static int s;
	int t;
	static int u;
	static vc vc_v = new vc(64);
	static int w;
	ca x;
	static int y;
	static int z;
	static int A;
	private static ob B = rf.a(40, "Free world");
	static ob C;
	static boolean D;
	static int E;
	static fa F;
	
	public static void a(byte var0) {
		try {
			F = null;
			if (var0 != 42) {
				cacheFile7 = null;
			}
			
			B = null;
			vc_v = null;
			C = null;
			cacheFile7 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qc.B(" + var0 + ')');
		}
	}
	
	static boolean a(int var0, int var1, int var2, int var3, byte var4, boolean var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		try {
			int var13;
			for (int var12 = 0; ~var12 > -105; ++var12) {
				for (var13 = 0; ~var13 > -105; ++var13) {
					qb.I[var12][var13] = 0;
					df.z[var12][var13] = 99999999;
				}
			}
			
			++u;
			qb.I[var6][var10] = 99;
			var13 = var6;
			int var14 = var10;
			byte var15 = 0;
			df.z[var6][var10] = 0;
			af.B[var15] = var6;
			boolean var17 = false;
			int var30 = var15 + 1;
			li.ints_l[var15] = var10;
			int var16 = 0;
			int var18 = af.B.length;
			int[][] var19 = ef.R[gf.G].i;
			
			int var20;
			while (var30 != var16) {
				var14 = li.ints_l[var16];
				var13 = af.B[var16];
				var16 = (var16 - -1) % var18;
				if (var2 == var13 && ~var14 == ~var3) {
					var17 = true;
					break;
				}
				
				if (~var9 != -1) {
					if ((~var9 > -6 || ~var9 == -11) && ef.R[gf.G].a(var2, var14, var9 - 1, var13, var8, var3, true)) {
						var17 = true;
						break;
					}
					
					if (~var9 > -11 && ef.R[gf.G].a(var13, var8, var14, 16816, var2, var9 + -1, var3)) {
						var17 = true;
						break;
					}
				}
				
				if (var11 != 0 && ~var1 != -1 && ef.R[gf.G].a(-1, var11, var13, var2, var3, var14, var7, var1)) {
					var17 = true;
					break;
				}
				
				var20 = df.z[var13][var14] - -1;
				if (var13 > 0 && ~qb.I[-1 + var13][var14] == -1 && (var19[var13 - 1][var14] & 19661064) == 0) {
					af.B[var30] = -1 + var13;
					li.ints_l[var30] = var14;
					var30 = (1 + var30) % var18;
					qb.I[var13 + -1][var14] = 2;
					df.z[-1 + var13][var14] = var20;
				}
				
				if (var13 < 103 && qb.I[var13 - -1][var14] == 0 && ~(var19[1 + var13][var14] & 19661184) == -1) {
					af.B[var30] = 1 + var13;
					li.ints_l[var30] = var14;
					var30 = (1 + var30) % var18;
					qb.I[1 + var13][var14] = 8;
					df.z[1 + var13][var14] = var20;
				}
				
				if (~var14 < -1 && ~qb.I[var13][var14 - 1] == -1 && ~(19661058 & var19[var13][var14 - 1]) == -1) {
					af.B[var30] = var13;
					li.ints_l[var30] = var14 - 1;
					var30 = (1 + var30) % var18;
					qb.I[var13][-1 + var14] = 1;
					df.z[var13][var14 + -1] = var20;
				}
				
				if (~var14 > -104 && ~qb.I[var13][var14 + 1] == -1 && ~(19661088 & var19[var13][1 + var14]) == -1) {
					af.B[var30] = var13;
					li.ints_l[var30] = 1 + var14;
					var30 = (var30 + 1) % var18;
					qb.I[var13][var14 + 1] = 4;
					df.z[var13][1 + var14] = var20;
				}
				
				if (var13 > 0 && ~var14 < -1 && ~qb.I[-1 + var13][var14 + -1] == -1 && ~(19661070 & var19[-1 + var13][var14 - 1]) == -1 && ~(var19[-1 + var13][var14] & 19661064) == -1 && ~(var19[var13][-1 + var14] & 19661058) == -1) {
					af.B[var30] = -1 + var13;
					li.ints_l[var30] = -1 + var14;
					qb.I[-1 + var13][var14 - 1] = 3;
					var30 = (1 + var30) % var18;
					df.z[var13 + -1][var14 - 1] = var20;
				}
				
				if (var13 < 103 && var14 > 0 && ~qb.I[1 + var13][-1 + var14] == -1 && (19661187 & var19[var13 + 1][-1 + var14]) == 0 && (19661184 & var19[1 + var13][var14]) == 0 && (19661058 & var19[var13][-1 + var14]) == 0) {
					af.B[var30] = var13 + 1;
					li.ints_l[var30] = -1 + var14;
					qb.I[var13 + 1][-1 + var14] = 9;
					var30 = (1 + var30) % var18;
					df.z[1 + var13][-1 + var14] = var20;
				}
				
				if (~var13 < -1 && ~var14 > -104 && ~qb.I[-1 + var13][var14 + 1] == -1 && ~(19661112 & var19[var13 - 1][1 + var14]) == -1 && ~(19661064 & var19[var13 - 1][var14]) == -1 && (var19[var13][var14 + 1] & 19661088) == 0) {
					af.B[var30] = -1 + var13;
					li.ints_l[var30] = 1 + var14;
					qb.I[var13 - 1][1 + var14] = 6;
					var30 = (1 + var30) % var18;
					df.z[var13 - 1][var14 - -1] = var20;
				}
				
				if (~var13 > -104 && ~var14 > -104 && qb.I[var13 - -1][1 + var14] == 0 && (19661280 & var19[var13 + 1][var14 - -1]) == 0 && ~(19661184 & var19[1 + var13][var14]) == -1 && ~(var19[var13][1 + var14] & 19661088) == -1) {
					af.B[var30] = var13 - -1;
					li.ints_l[var30] = var14 - -1;
					qb.I[1 + var13][1 + var14] = 12;
					df.z[1 + var13][var14 - -1] = var20;
					var30 = (var30 - -1) % var18;
				}
			}
			
			bd.U = 0;
			var20 = 48 % ((-52 - var4) / 54);
			int var21;
			int var22;
			int var24;
			int var25;
			if (!var17) {
				if (!var5) {
					return false;
				}
				
				var21 = 1000;
				byte var23 = 10;
				var22 = 100;
				
				for (var24 = var2 - var23; var24 <= var2 + var23; ++var24) {
					for (var25 = -var23 + var3; var25 <= var3 - -var23; ++var25) {
						if (var24 >= 0 && ~var25 <= -1 && ~var24 > -105 && var25 < 104 && df.z[var24][var25] < 100) {
							int var26 = 0;
							if (var24 < var2) {
								var26 = var2 + -var24;
							} else if (var24 > var11 + var2 + -1) {
								var26 = var24 - -1 - (var11 + var2);
							}
							
							int var27 = 0;
							if (~var25 > ~var3) {
								var27 = -var25 + var3;
							} else if (~var25 < ~(-1 + var3 + var1)) {
								var27 = var25 + 1 + -var1 + -var3;
							}
							
							int var28 = var27 * var27 + var26 * var26;
							if (var28 < var21 || var21 == var28 && ~df.z[var24][var25] > ~var22) {
								var13 = var24;
								var22 = df.z[var24][var25];
								var21 = var28;
								var14 = var25;
							}
						}
					}
				}
				
				if (~var21 == -1001) {
					return false;
				}
				
				if (var6 == var13 && ~var14 == ~var10) {
					return false;
				}
				
				bd.U = 1;
			}
			
			byte var31 = 0;
			af.B[var31] = var13;
			var16 = var31 + 1;
			li.ints_l[var31] = var14;
			
			for (var21 = var22 = qb.I[var13][var14]; var13 != var6 || ~var10 != ~var14; var21 = qb.I[var13][var14]) {
				if (var21 != var22) {
					af.B[var16] = var13;
					li.ints_l[var16++] = var14;
					var22 = var21;
				}
				
				if (~(var21 & 2) == -1) {
					if ((var21 & 8) != 0) {
						--var13;
					}
				} else {
					++var13;
				}
				
				if (~(var21 & 1) != -1) {
					++var14;
				} else if (~(var21 & 4) != -1) {
					--var14;
				}
			}
			
			if (~var16 >= -1) {
				if (~var0 == -2) {
					return false;
				} else {
					return true;
				}
			} else {
				var18 = var16--;
				var24 = li.ints_l[var16];
				if (var18 > 25) {
					var18 = 25;
				}
				
				int var32 = af.B[var16];
				if (~var0 == -1) {
					af.P.p(110, 12885);
					++hh.H;
					af.P.writeByte(94, var18 - (-var18 - 3));
				}
				
				if (~var0 == -2) {
					af.P.p(13, 12885);
					af.P.writeByte(82, 14 + 3 + var18 + var18);
					++r.cb;
				}
				
				if (~var0 == -3) {
					af.P.p(25, 12885);
					++va.g;
					af.P.writeByte(105, var18 + var18 - -3);
				}
				
				wg.db = af.B[0];
				wd.q = li.ints_l[0];
				
				for (var25 = 1; ~var18 < ~var25; ++var25) {
					--var16;
					af.P.g(36, -var32 + af.B[var16]);
					af.P.f(li.ints_l[var16] - var24, -1543);
				}
				
				af.P.a((byte) -72, fi.t[82] ? 1 : 0);
				af.P.d(26894, var24 + ic.entityYPosition);
				af.P.i(-122, var32 + ic.entityXPosition);
				return true;
			}
		} catch (RuntimeException var29) {
			throw bc.a(var29, "qc.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}
	
	static void b(int var0, int var1) {
		int var3 = client.anInt_wb;
		System.err.println(var1);
		
		try {
			label145:
			{
				++s;
				if (var1 != -3) {
					if (var1 == -2) {
						c.a(v.D, v.hb, jb.ob, (byte) -70);
					}
					
					if (~var1 == 0) {
						c.a(v.qb, qe.p, ca.pleaseTryUsingADifferentWorld4, (byte) -70);
					}
					
					if (~var1 == -4) {
						c.a(v.E, v.wb, gh.S, (byte) -70);
					}
					
					if (var1 != 4) {
						if (var1 == 5) {
							c.a(v.mb, ab.yourAccountIsAlreadyLoggedIn2, jb.fb, (byte) -70);
						}
						
						if (var1 == 6) {
							c.a(v.vb, qd.I, mf.ib, (byte) -70);
						}
						
						if (~var1 == -8) {
							c.a(v.eb, gh.U, le.hb, (byte) -70);
						}
						
						if (~var1 == -9) {
							c.a(v.F, ic.D, ba.loginServerOffline2, (byte) -70);
						}
						
						if (~var1 == -10) {
							c.a(v.H, re.s, kf.h, (byte) -70);
						}
						
						if (var1 == 10) {
							c.a(v.Ab, ic.Z, ug.q, (byte) -70);
						}
						
						if (var1 == 11) {
							c.a(v.rb, ni.W, jh.d, (byte) -70);
						}
						
						if (~var1 != -13) {
							if (~var1 != -14) {
								if (var1 == 14) {
									c.a(v.S, oe.u, dd.ob_g, (byte) -70);
								}
								
								if (~var1 == -17) {
									c.a(v.pb, ue.X, je.W, (byte) -70);
								}
								
								if (var1 != 17) {
									if (~var1 != -19) {
										if (var1 != 19) {
											if (~var1 == -21) {
												c.a(v.J, id.x, ca.pleaseTryUsingADifferentWorld3, (byte) -70);
											}
											
											if (var1 != 22) {
												if (~var1 == -24) {
													c.a(v.U, pe.cb, dd.c, (byte) -70);
												}
												
												if (~var1 != -25) {
													if (~var1 == -26) {
														c.a(v.V, ji.B, ca.pleaseTryUsingADifferentWorld6, (byte) -70);
													}
													
													if (~var1 == -27) {
														c.a(v.K, ue.fb, ae.asItWasUsedToBreakOurRules2, (byte) -70);
													}
													
													if (var1 != 27) {
														c.a(v.R, ab.unexpectedServerResponse2, ca.pleaseTryUsingADifferentWorld2, (byte) -70);
													}
													
													c.a(v.ob, v.N, oc.o, (byte) -70);
												}
												
												c.a(v.gb, hi.y, fh.o, (byte) -70);
											}
											
											c.a(v.L, ng.z, de.h, (byte) -70);
										}
										
										c.a(le.V, qa.E, ue.S, (byte) -70);
									}
									
									c.a(v.P, id.E, vg.db, (byte) -70);
								}
								
								c.a(v.Z, hb.s, ud.X, (byte) -70);
							}
							
							c.a(v.sb, rf.u, ca.pleaseTryUsingADifferentWorld5, (byte) -70);
						}
						
						c.a(v.Q, kg.m, eh.cb, (byte) -70);
					}
					
					c.a(v.fb, gb.cb, sa.h, (byte) -70);
				}
				
				c.a(v.ob_nb, wg.R, ca.pleaseTryUsingADifferentWorld7, (byte) -70);
			}
			
			if (var0 == 1) {
				pg.setGameState(10, (byte) -95);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "qc.A(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		C = B;
		D = true;
	}
}
