final class ke extends r {
	
	static int[] jb = new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
	static int kb;
	static fa[] lb;
	static int mb = -1;
	static int nb;
	static int ob;
	static int pb;
	static int[] qb;
	static eg[] rb = new eg[50];
	static volatile boolean sb = true;
	static int tb;
	static int anInt_ub;
	
	static void a(int var0, int var1, byte var2, int var3, int var4, int var5, int var6) {
		int var23 = client.anInt_wb;
		
		try {
			++ob;
			if (var2 == 86) {
				int var7 = 0;
				sc.a(-16361, var0);
				int var9 = var0;
				int var8 = -var5 + var0;
				if (var8 < 0) {
					var8 = 0;
				}
				
				int var11 = var8;
				int var10 = -var0;
				int var12 = -var8;
				int var13 = -1;
				int var14 = -1;
				int var16;
				int var17;
				int var18;
				int var19;
				if (~var1 <= ~dd.a) {
					if (na.anInt_m >= var1) {
						int[] var15 = e.ints_b[var1];
						var16 = kg.a(gh.R, ng.u, true, var6 - var0);
						var17 = kg.a(gh.R, ng.u, true, var0 + var6);
						var18 = kg.a(gh.R, ng.u, true, -var8 + var6);
						var19 = kg.a(gh.R, ng.u, true, var6 + var8);
						sa.a(var18, (byte) 52, var16, var4, var15);
						sa.a(var19, (byte) 52, var18, var3, var15);
						sa.a(var17, (byte) 52, var19, var4, var15);
						if (var23 == 0 && var0 <= var7) {
							return;
						}
					} else if (var0 <= var7) {
						return;
					}
				} else if (var0 <= var7) {
					return;
				}
				
				do {
					var13 += 2;
					var10 += var13;
					var14 += 2;
					var12 += var14;
					if (~var12 <= -1 && ~var11 <= -2) {
						--var11;
						vb.q[var11] = var7;
						var12 -= var11 << 1;
					}
					
					++var7;
					int var20;
					int var21;
					int[] var22;
					int var25;
					if (var10 >= 0) {
						--var9;
						var25 = var1 - var9;
						var10 -= var9 << 1;
						var16 = var1 - -var9;
						if (~dd.a >= ~var16 && ~var25 >= ~na.anInt_m) {
							label132:
							{
								if (~var8 < ~var9) {
									var17 = vb.q[var9];
									var18 = kg.a(gh.R, ng.u, true, var7 + var6);
									var19 = kg.a(gh.R, ng.u, true, -var7 + var6);
									var20 = kg.a(gh.R, ng.u, true, var17 + var6);
									var21 = kg.a(gh.R, ng.u, true, -var17 + var6);
									if (~na.anInt_m <= ~var16) {
										var22 = e.ints_b[var16];
										sa.a(var21, (byte) 52, var19, var4, var22);
										sa.a(var20, (byte) 52, var21, var3, var22);
										sa.a(var18, (byte) 52, var20, var4, var22);
									}
									
									if (~var25 > ~dd.a) {
										break label132;
									}
									
									var22 = e.ints_b[var25];
									sa.a(var21, (byte) 52, var19, var4, var22);
									sa.a(var20, (byte) 52, var21, var3, var22);
									sa.a(var18, (byte) 52, var20, var4, var22);
									if (var23 == 0) {
										break label132;
									}
								}
								
								var17 = kg.a(gh.R, ng.u, true, var6 - -var7);
								var18 = kg.a(gh.R, ng.u, true, -var7 + var6);
								if (~na.anInt_m <= ~var16) {
									sa.a(var17, (byte) 52, var18, var4, e.ints_b[var16]);
								}
								
								if (~dd.a >= ~var25) {
									sa.a(var17, (byte) 52, var18, var4, e.ints_b[var25]);
								}
							}
						}
					}
					
					var16 = var7 + var1;
					var25 = -var7 + var1;
					if (~dd.a >= ~var16 && var25 <= na.anInt_m) {
						var17 = var9 + var6;
						var18 = var6 + -var9;
						if (~gh.R >= ~var17 && ~var18 >= ~ng.u) {
							var17 = kg.a(gh.R, ng.u, true, var17);
							var18 = kg.a(gh.R, ng.u, true, var18);
							if (var8 > var7) {
								var19 = ~var11 <= ~var7 ? var11 : vb.q[var7];
								var20 = kg.a(gh.R, ng.u, true, var6 + var19);
								var21 = kg.a(gh.R, ng.u, true, -var19 + var6);
								if (~na.anInt_m <= ~var16) {
									var22 = e.ints_b[var16];
									sa.a(var21, (byte) 52, var18, var4, var22);
									sa.a(var20, (byte) 52, var21, var3, var22);
									sa.a(var17, (byte) 52, var20, var4, var22);
								}
								
								if (~dd.a >= ~var25) {
									var22 = e.ints_b[var25];
									sa.a(var21, (byte) 52, var18, var4, var22);
									sa.a(var20, (byte) 52, var21, var3, var22);
									sa.a(var17, (byte) 52, var20, var4, var22);
									if (var23 != 0) {
										if (var16 <= na.anInt_m) {
											sa.a(var17, (byte) 52, var18, var4, e.ints_b[var16]);
										}
										
										if (~dd.a >= ~var25) {
											sa.a(var17, (byte) 52, var18, var4, e.ints_b[var25]);
										}
									}
								}
							} else {
								if (var16 <= na.anInt_m) {
									sa.a(var17, (byte) 52, var18, var4, e.ints_b[var16]);
								}
								
								if (~dd.a >= ~var25) {
									sa.a(var17, (byte) 52, var18, var4, e.ints_b[var25]);
								}
							}
						}
					}
				} while (var9 > var7);
				
			}
		} catch (RuntimeException var24) {
			throw bc.a(var24, "ke.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	static void a(ud var0, int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			if (var2 == 13184) {
				label64:
				{
					++tb;
					if (~var0.eb < ~bi.f) {
						dd.a(var0, 776);
						if (var4 == 0) {
							break label64;
						}
					}
					
					if (var0.Qb >= bi.f) {
						ri.a((byte) 121, var0);
						if (var4 == 0) {
							break label64;
						}
					}
					
					kd.a(var0, -105);
				}
				
				if (var0.coordX < 128 || ~var0.coordY > -129 || var0.coordX >= 13184 || var0.coordY >= 13184) {
					var0.coordX = 128 * var0.regionLocalX[0] - -(var0.Gb * 64);
					var0.coordY = var0.Gb * 64 + 128 * var0.regionLocalY[0];
					var0.Qb = 0;
					var0.eb = 0;
					var0.mb = -1;
					var0.O = -1;
					var0.d((byte) -99);
				}
				
				if (var0 == le.T && (~var0.coordX > -1537 || var0.coordY < 1536 || var0.coordX >= 11776 || var0.coordY >= 11776)) {
					var0.coordY = var0.regionLocalY[0] * 128 - -(var0.Gb * 64);
					var0.O = -1;
					var0.Qb = 0;
					var0.mb = -1;
					var0.eb = 0;
					var0.coordX = var0.Gb * 64 + var0.regionLocalX[0] * 128;
					var0.d((byte) 118);
				}
				
				oh.a(var2 ^ -13302, var0);
				o.a(-1, var0);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ke.D(" + "{...}" + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	public static void j(int var0) {
		try {
			jb = null;
			qb = null;
			lb = null;
			if (var0 == 128) {
				rb = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ke.C(" + var0 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var11 = client.anInt_wb;
		
		try {
			++nb;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u && this.i(26239)) {
				int[] var6 = var4[1];
				int[] var7 = var4[2];
				int[] var5 = var4[0];
				int var8 = var1 % super.ab * super.ab;
				int var9 = 0;
				if (var11 != 0 || var9 < lh.eb) {
					do {
						int var10 = super.Z[var9 % super.S + var8];
						var7[var9] = bd.b(4080, (int) (var10 << 4));
						var6[var9] = bd.b('\uff00', (int) var10) >> 4;
						var5[var9] = bd.b(var10 >> 12, (int) 4080);
						++var9;
					} while (var9 < lh.eb);
				}
			}
			
			return var4;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ke.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void c(int var0, int var1) {
		int var17 = client.anInt_wb;
		
		try {
			++anInt_ub;
			ub.b += 128 * var1;
			int var3;
			if (ub.b > oc.h.length) {
				var3 = (int) (Math.random() * 12.0D);
				ub.b -= oc.h.length;
				ua.a(wg.ab[var3], 29499);
			}
			
			short var2 = 256;
			var3 = 0;
			int var5 = (var2 - var1) * 128;
			int var4 = var1 * 128;
			int var6 = 0;
			int var7;
			if (var17 != 0) {}
			if (/*var17 != 0 || */~var5 < ~var6) {
				do {
					var7 = r.R[var3 + var4] - var1 * oc.h[var3 - -ub.b & oc.h.length + -1] / 6;
					if (~var7 > -1) {
						var7 = 0;
					}
					
					r.R[var3++] = var7;
					++var6;
				} while (~var5 < ~var6);
			}
			
			var7 = var2 + -var1;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			var8 = 128 * var7;
			var9 = 0;
			while (true) {
				while (~var9 > -129) {
					var10 = (int) (Math.random() * 100.0D);
					if (~var10 > -51) {
						if (var9 > 10) {
							if (var9 < 118) {
								r.R[var8 + var9] = 255;
								if (var17 != 0) {
									r.R[var9 + var8] = 0;
									++var9;
								} else {
									++var9;
								}
							} else {
								r.R[var9 + var8] = 0;
								++var9;
							}
						} else {
							r.R[var9 + var8] = 0;
							++var9;
						}
					} else {
						r.R[var9 + var8] = 0;
						++var9;
					}
				}
				
				++var7;
				if (var7 >= var2) {
					if (~pa.e < -1) {
						pa.e -= var1 * 4;
					}
					
					if (si.db > 0) {
						si.db -= var1 * 4;
					}
					
					if (~pa.e == -1 && ~si.db == -1) {
						var8 = (int) ((double) (2000 / var1) * Math.random());
						if (var8 == 1) {
							si.db = 1024;
						} else if (var8 == 0) {
							pa.e = 1024;
						}
					}
					
					var8 = 0;
					while (~var8 > ~(var2 + -var1)) {
						sh.r[var8] = sh.r[var8 + var1];
						++var8;
					}
					
					var9 = -var1 + var2;
					if (var0 > -73) {
						qb = null;
					}
					
					while (var2 > var9) {
						sh.r[var9] = (int) (Math.sin((double) be.l / 14.0D) * 16.0D + 14.0D * Math.sin((double) be.l / 15.0D) + 12.0D * Math.sin((double) be.l / 16.0D));
						++be.l;
						++var9;
					}
					
					lh.V += var1;
					var10 = ((1 & bi.f) + var1) / 2;
					if (~var10 >= -1) {
						return;
					}
					
					var11 = 0;
					while (~(lh.V * 100) < ~var11) {
						var13 = 128 + (int) (128.0D * Math.random());
						var12 = (int) (Math.random() * 124.0D) - -2;
						r.R[var12 - -(var13 << 7)] = 192;
						++var11;
					}
					
					lh.V = 0;
					var12 = 0;
					if (var17 != 0) {}
					if (/*var17 != 0 || */~var2 < ~var12) {
						do {
							var14 = var12 * 128;
							var13 = 0;
							var15 = -var10;
							if (var17 != 0) {}
							if (/*var17 != 0 || */var15 < 128) {
								do {
									if (~(var10 + var15) > -129) {
										var13 += r.R[var10 + (var15 - -var14)];
									}
									
									if (-1 - (var10 - var15) >= 0) {
										var13 -= r.R[var15 - -var14 - (1 + var10)];
									}
									
									if (var15 >= 0) {
										ah.j[var14 + var15] = var13 / (var10 * 2 - -1);
									}
									
									++var15;
								} while (var15 < 128);
							}
							
							++var12;
						} while (~var2 < ~var12);
					}
					
					var13 = 0;
					if (/*var17 == 0 && */~var13 <= -129) {
						return;
					}
					
					do {
						var14 = 0;
						var15 = -var10;
						if (var17 != 0) {}
						if (/*var17 != 0 || */var2 > var15) {
							do {
								var16 = var15 * 128;
								if (var2 > var10 + var15) {
									var14 += ah.j[var10 * 128 + var16 + var13];
								}
								
								if (~(var15 - var10 - 1) <= -1) {
									var14 -= ah.j[var13 - -var16 - 128 * (var10 - -1)];
								}
								
								if (var15 >= 0) {
									r.R[var13 + var16] = var14 / (1 + var10 * 2);
								}
								
								++var15;
							} while (var2 > var15);
						}
						
						++var13;
					} while (~var13 > -129);
					
					return;
				}
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "ke.E(" + var0 + ',' + var1 + ')');
		}
	}
}
