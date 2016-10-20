abstract class hg {
	
	static ca cacheFile_21;
	static ob b = rf.a(40, "leuchten3:");
	static pe cacheFile16;
	static int d;
	static int anInt_e;
	static int f;
	static ob g = rf.a(40, "<col=ffff00>");
	static ob h = rf.a(40, "<col=00ffff>");
	
	abstract int a(int var1, int var2, int var3);
	
	static void a(int var0, int var1, byte var2, int var3, int var4, int var5, int var6, int var7) {
		int var47 = client.anInt_wb;
		
		try {
			++f;
			int var8 = 0;
			int var9 = var1;
			int var11 = var3 - var5;
			int var12 = -var5 + var1;
			int var15 = var11 * var11;
			if (var2 == -97) {
				int var13 = var3 * var3;
				int var10 = 0;
				int var16 = var12 * var12;
				int var18 = var13 << 1;
				int var14 = var1 * var1;
				int var17 = var14 << 1;
				int var21 = var1 << 1;
				int var24 = -(var18 * (-1 + var21)) + var14;
				int var19 = var16 << 1;
				int var20 = var15 << 1;
				int var23 = var17 + (-var21 + 1) * var13;
				int var22 = var12 << 1;
				int var26 = var16 - var20 * (-1 + var22);
				int var27 = var13 << 2;
				int var28 = var14 << 2;
				int var29 = var15 << 2;
				int var25 = var15 * (-var22 + 1) + var19;
				int var30 = var16 << 2;
				int var31 = var17 * 3;
				int var34 = var20 * (-3 + var22);
				int var33 = var19 * 3;
				int var32 = var18 * (var21 + -3);
				int var36 = (var1 + -1) * var27;
				int var37 = var30;
				int var35 = var28;
				int var40;
				int var41;
				int var42;
				int var43;
				if (~dd.a >= ~var6 && var6 <= na.anInt_m) {
					int[] var39 = e.ints_b[var6];
					var40 = kg.a(gh.R, ng.u, true, -var3 + var4);
					var41 = kg.a(gh.R, ng.u, true, var3 + var4);
					var42 = kg.a(gh.R, ng.u, true, var4 - var11);
					var43 = kg.a(gh.R, ng.u, true, var11 + var4);
					sa.a(var42, (byte) 52, var40, var7, var39);
					sa.a(var43, (byte) 52, var42, var0, var39);
					sa.a(var41, (byte) 52, var43, var7, var39);
				}
				
				int var38 = (-1 + var12) * var29;
				if (var47 != 0 || ~var1 < -1) {
					do {
						if (var23 < 0) {
							if (var47 != 0) {
								++var8;
								var23 += var31;
								var31 += var28;
								var24 += var35;
								var35 += var28;
							}
							
							while (~var23 > -1) {
								++var8;
								var23 += var31;
								var31 += var28;
								var24 += var35;
								var35 += var28;
							}
						}
						
						boolean var10000;
						if (var24 < 0) {
							var23 += var31;
							var24 += var35;
							var35 += var28;
							++var8;
							var31 += var28;
							var23 += -var36;
							var10000 = ~var9 >= ~var12;
						} else {
							var23 += -var36;
							var10000 = ~var9 >= ~var12;
						}
						
						boolean var49 = var10000;
						var36 -= var27;
						--var9;
						var41 = var6 - -var9;
						if (var49) {
							if (var25 < 0) {
								if (var47 != 0) {
									++var10;
									var25 += var33;
									var26 += var37;
									var33 += var30;
									var37 += var30;
								}
								
								while (var25 < 0) {
									++var10;
									var25 += var33;
									var26 += var37;
									var33 += var30;
									var37 += var30;
								}
							}
							
							if (var26 < 0) {
								++var10;
								var26 += var37;
								var37 += var30;
								var25 += var33;
								var33 += var30;
							}
							
							var26 += -var34;
							var34 -= var29;
							var25 += -var38;
							var38 -= var29;
						}
						
						var24 += -var32;
						var32 -= var27;
						var40 = -var9 + var6;
						if (~dd.a >= ~var41 && var40 <= na.anInt_m) {
							var42 = kg.a(gh.R, ng.u, true, var4 + var8);
							var43 = kg.a(gh.R, ng.u, true, -var8 + var4);
							if (var49) {
								int var44 = kg.a(gh.R, ng.u, true, var4 + var10);
								int var45 = kg.a(gh.R, ng.u, true, var4 + -var10);
								int[] var46;
								if (~dd.a >= ~var40) {
									var46 = e.ints_b[var40];
									sa.a(var45, (byte) 52, var43, var7, var46);
									sa.a(var44, (byte) 52, var45, var0, var46);
									sa.a(var42, (byte) 52, var44, var7, var46);
								}
								
								if (na.anInt_m >= var41) {
									var46 = e.ints_b[var41];
									sa.a(var45, (byte) 52, var43, var7, var46);
									sa.a(var44, (byte) 52, var45, var0, var46);
									sa.a(var42, (byte) 52, var44, var7, var46);
									if (var47 != 0) {
										if (~dd.a >= ~var40) {
											sa.a(var42, (byte) 52, var43, var7, e.ints_b[var40]);
										}
										
										if (var41 <= na.anInt_m) {
											sa.a(var42, (byte) 52, var43, var7, e.ints_b[var41]);
										}
									}
								}
							} else {
								if (~dd.a >= ~var40) {
									sa.a(var42, (byte) 52, var43, var7, e.ints_b[var40]);
								}
								
								if (var41 <= na.anInt_m) {
									sa.a(var42, (byte) 52, var43, var7, e.ints_b[var41]);
								}
							}
						}
					} while (~var9 < -1);
					
				}
			}
		} catch (RuntimeException var48) {
			throw bc.a(var48, "hg.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	abstract void a(byte var1);
	
	static void b(byte var0) {
		try {
			++anInt_e;
			pg.packetBuffer.initBITAccess((byte) -107);
			int updateRequired = pg.packetBuffer.readBits(1, 11339);
			System.out.println("PLAYER UPDATE: update required - " + updateRequired);
			if (updateRequired != 0) {
				int action = pg.packetBuffer.readBits(2, 11339);
				if (action == 0) {
					mf.nb[qf.I++] = 2047;
				} else {
					if (action == 1) {
						int walkDirection = pg.packetBuffer.readBits(3, 11339);
						le.T.a(true, walkDirection, false);
						int update = pg.packetBuffer.readBits(1, 11339);
						if (update == 1) {
							mf.nb[qf.I++] = 2047;
						}
					} else {
						if (action == 2) {
							int walkDirection = pg.packetBuffer.readBits(3, 11339);
							le.T.a(true, walkDirection, true);
							int runDirection = pg.packetBuffer.readBits(3, 11339);
							le.T.a(true, runDirection, true);
							int update = pg.packetBuffer.readBits(1, 11339);
							if (update == 1) {
								mf.nb[qf.I++] = 2047;
							}
						} else if (action == 3) {
							int i = pg.packetBuffer.readBits(1, 11339);
							gf.G = pg.packetBuffer.readBits(2, 11339);
							int localY = pg.packetBuffer.readBits(7, 11339);
							int update = pg.packetBuffer.readBits(1, 11339);
							if (update == 1) {
								mf.nb[qf.I++] = 2047;
							}
							
							int localX = pg.packetBuffer.readBits(7, 11339);
							le.T.a(localX, localY, -1, i == 1);
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "hg.B(" + var0 + ')');
		}
	}
	
	public static void c(byte var0) {
		try {
			b = null;
			g = null;
			cacheFile16 = null;
			if (var0 <= 93) {
				cacheFile_21 = null;
			}
			
			h = null;
			cacheFile_21 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hg.A(" + var0 + ')');
		}
	}
}
