final class md {
	
	static ob a;
	static int b;
	static int c;
	static int d;
	static Object e;
	static pe cacheFile2;
	static ob g = rf.a(40, "gelb:");
	static volatile int h = 0;
	private vd i;
	private int j;
	private vd[] k;
	private long l;
	static int m;
	static ob yellow_keyword2;
	static int o;
	static int p;
	static int q;
	private vd r;
	static ob s = rf.a(40, "blinken2:");
	static int t;
	private int u = 0;
	static int v;
	private static ob yellow_keyword = rf.a(40, "yellow:");
	static ob x = rf.a(40, "<col=ffb000>");
	static int y;
	static ob title_mute;
	
	public static void a(int var0) {
		try {
			e = null;
			x = null;
			s = null;
			g = null;
			yellow_keyword2 = null;
			a = null;
			if (var0 < 80) {
				h = 64;
			}
			
			yellow_keyword = null;
			cacheFile2 = null;
			title_mute = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "md.B(" + var0 + ')');
		}
	}
	
	final vd a(long id, int var3) {
		try {
			this.l = id;
			vd var4 = this.k[(int) (id & (long) (this.j - 1))];
			this.i = var4.vd_n;
			++y;
			
			while (var4 != this.i) {
				if (~this.i.clientScriptId == ~id) {
					vd var5 = this.i;
					this.i = this.i.vd_n;
					return var5;
				}
				
				this.i = this.i.vd_n;
			}
			
			if (var3 != 22346) {
				this.b(90);
			}
			
			this.i = null;
			return null;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "md.G(" + id + ',' + var3 + ')');
		}
	}
	
	final vd b(int var1) {
		try {
			++v;
			if (this.i == null) {
				return null;
			} else {
				for (vd var2 = this.k[(int) ((long) (this.j - 1) & this.l)]; var2 != this.i; this.i = this.i.vd_n) {
					if (~this.i.clientScriptId == ~this.l) {
						vd var3 = this.i;
						this.i = this.i.vd_n;
						return var3;
					}
				}
				
				this.i = null;
				if (var1 > -33) {
					a(-48, 53L, 93, 112);
				}
				
				return null;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "md.F(" + var1 + ')');
		}
	}
	
	static int a(byte var0, int var1) {
		try {
			if (var0 != -112) {
				return -88;
			} else {
				++o;
				return var1 >>> -1937740537;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "md.H(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int height, int regionY, byte unused, int localX, int localY, int regionX) {
		int dummy = client.anInt_wb;
		
		try {
			++p;
			if (regionX != ci.regionX || rh.regionY != regionY || fc.ob != height && ag.forceSend) {
				rh.regionY = regionY;
				ci.regionX = regionX;
				fc.ob = height;
				if (!ag.forceSend) {
					fc.ob = 0;
				}
				
				pg.setGameState(25, (byte) -89);
				fb.a(-31122, true, sc.loadingPleaseWait2);
				int y = ic.entityYPosition;
				ic.entityYPosition = -48 + regionY * 8;
				int x = ic.entityXPosition;
				ic.entityXPosition = -48 + regionX * 8;
				int x2 = ic.entityXPosition - x;
				//x = ic.N;
				int y2 = -y + ic.entityYPosition;
				//y = ic.H;
				for (int var10 = 0; var10 < 32768; var10++) {
					nb var11 = ai.M[var10];
					if (var11 != null) {
						for (int var12 = 0; var12 < 10; var12++) {
							var11.regionLocalX[var12] -= x2;
							var11.regionLocalY[var12] -= y2;
						}
						
						var11.coordX -= x2 * 128;
						var11.coordY -= y2 * 128;
					}
				}
				
				int var25 = 0;
				byte var14;
				byte var15;
				byte var16;
				byte var17;
				int var18;
				int var19;
				int var20;
				int var21;
				int var22;
				byte var27;
				byte var28;
				gf class_gf;
				if (~var25 <= -2049) {
					var27 = 0;
					var28 = 104;
					gf.G = height;
					var15 = 0;
					var16 = 104;
					var14 = 1;
					if (x2 < 0) {
						var27 = 103;
						var14 = -1;
						var28 = -1;
					}
					
					le.T.a(localX, localY, -1, false);
					var17 = 1;
					if (~y2 > -1) {
						var16 = -1;
						var15 = 103;
						var17 = -1;
					}
					
					var18 = var27;
					if (/*dummy != 0 || */~var27 != ~var28) {
						do {
							var19 = var15;
							if (/*dummy != 0 || */~var16 != ~var15) {
								do {
									var21 = y2 + var19;
									var20 = var18 - -x2;
									var22 = 0;
									if (~var22 > -5) {
										do {
											if (~var20 > -1 || var21 < 0 || var20 >= 104 || var21 >= 104) {
												hf.C[var22][var18][var19] = null;
												++var22;
											} else {
												hf.C[var22][var18][var19] = hf.C[var22][var20][var21];
												++var22;
											}
										} while (~var22 > -5);
									}
									
									var19 += var17;
								} while (~var16 != ~var19);
							}
							
							var18 += var14;
						} while (~var18 != ~var28);
					}
					
					class_gf = (gf) vg.X.a((byte) -9);
					if (class_gf == null) {
						rh.t = -1;
						dh.k = 0;
						if (wg.db != 0) {
							wg.db -= x2;
							wd.q -= y2;
						}
						
						client.aBoolean_db = false;
						nf.ib.c(109);
						if (unused > -46) {
							md.x = null;
						}
						
						ci.u.c(-77);
					} else {
						do {
							class_gf.J -= y2;
							class_gf.E -= x2;
							if (class_gf.E >= 0) {
								if (class_gf.J >= 0) {
									if (~class_gf.E > -105) {
										if (~class_gf.J <= -105) {
											class_gf.c(128);
											class_gf = (gf) vg.X.b((byte) 107);
										} else {
											class_gf = (gf) vg.X.b((byte) 107);
										}
									} else {
										class_gf.c(128);
										class_gf = (gf) vg.X.b((byte) 107);
									}
								} else {
									class_gf.c(128);
									class_gf = (gf) vg.X.b((byte) 107);
								}
							} else {
								class_gf.c(128);
								class_gf = (gf) vg.X.b((byte) 107);
							}
						} while (class_gf != null);
						
						rh.t = -1;
						dh.k = 0;
						if (wg.db != 0) {
							wg.db -= x2;
							wd.q -= y2;
						}
						
						client.aBoolean_db = false;
						nf.ib.c(109);
						if (unused > -46) {
							md.x = null;
						}
						
						ci.u.c(-77);
					}
				} else {
					do {
						dg class_dg = lg.j[var25];
						if (class_dg == null) {
							++var25;
						} else {
							int var13 = 0;
							while (~var13 > -11) {
								class_dg.regionLocalX[var13] -= x2;
								class_dg.regionLocalY[var13] -= y2;
								++var13;
							}
							
							class_dg.coordX -= 128 * x2;
							class_dg.coordY -= y2 * 128;
							++var25;
						}
					} while (~var25 > -2049);
					
					var27 = 0;
					var28 = 104;
					gf.G = height;
					var15 = 0;
					var16 = 104;
					var14 = 1;
					if (x2 < 0) {
						var27 = 103;
						var14 = -1;
						var28 = -1;
					}
					
					le.T.a(localX, localY, -1, false);
					var17 = 1;
					if (~y2 > -1) {
						var16 = -1;
						var15 = 103;
						var17 = -1;
					}
					
					var18 = var27;
					if (~var27 != ~var28) {
						do {
							var19 = var15;
							if (~var16 != ~var15) {
								do {
									var21 = y2 + var19;
									var20 = var18 - -x2;
									var22 = 0;
									if (~var22 > -5) {
										do {
											if (~var20 > -1 || var21 < 0 || var20 >= 104 || var21 >= 104) {
												hf.C[var22][var18][var19] = null;
												++var22;
											} else {
												hf.C[var22][var18][var19] = hf.C[var22][var20][var21];
												++var22;
											}
										} while (~var22 > -5);
									}
									
									var19 += var17;
								} while (~var16 != ~var19);
							}
							
							var18 += var14;
						} while (~var18 != ~var28);
					}
					
					class_gf = (gf) vg.X.a((byte) -9);
					if (class_gf == null) {
						rh.t = -1;
						dh.k = 0;
						if (wg.db != 0) {
							wg.db -= x2;
							wd.q -= y2;
						}
						
						client.aBoolean_db = false;
						nf.ib.c(109);
						if (unused > -46) {
							md.x = null;
						}
						
						ci.u.c(-77);
					} else {
						do {
							class_gf.J -= y2;
							class_gf.E -= x2;
							if (class_gf.E >= 0) {
								if (class_gf.J >= 0) {
									if (~class_gf.E > -105) {
										if (~class_gf.J <= -105) {
											class_gf.c(128);
											class_gf = (gf) vg.X.b((byte) 107);
										} else {
											class_gf = (gf) vg.X.b((byte) 107);
										}
									} else {
										class_gf.c(128);
										class_gf = (gf) vg.X.b((byte) 107);
									}
								} else {
									class_gf.c(128);
									class_gf = (gf) vg.X.b((byte) 107);
								}
							} else {
								class_gf.c(128);
								class_gf = (gf) vg.X.b((byte) 107);
							}
						} while (class_gf != null);
						
						rh.t = -1;
						dh.k = 0;
						if (wg.db != 0) {
							wg.db -= x2;
							wd.q -= y2;
						}
						
						client.aBoolean_db = false;
						nf.ib.c(109);
						if (unused > -46) {
							md.x = null;
						}
						
						ci.u.c(-77);
					}
				}
			}
		} catch (RuntimeException var24) {
			throw bc.a(var24, "md.C(" + height + ',' + regionY + ',' + unused + ',' + localX + ',' + localY + ',' + regionX + ')');
		}
	}
	
	final vd a(byte unused) {
		try {
			++t;
			vd class_vd;
			if (this.u > 0 && this.r != this.k[this.u - 1]) {
				class_vd = this.r;
				this.r = class_vd.vd_n;
				return class_vd;
			} else {
				while (~this.u > ~this.j) {
					class_vd = this.k[this.u++].vd_n;
					if (class_vd != this.k[this.u - 1]) {
						this.r = class_vd.vd_n;
						return class_vd;
					}
				}
				
				return null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "md.I(" + unused + ')');
		}
	}
	
	md(int size) {
		try {
			this.j = size;
			this.k = new vd[size];
			
			for (int index = 0; ~size < ~index; ++index) {
				vd vd = this.k[index] = new vd();
				vd.vd_l = vd;
				vd.vd_n = vd;
			}
			
		} catch (RuntimeException var4) {
			throw bc.a(var4, "md.<init>(" + size + ')');
		}
	}
	
	final void a(vd class_vd, long scriptId, boolean unused) {
		try {
			if (!unused) {
				s = null;
			}
			
			if (class_vd.vd_l != null) {
				class_vd.c(128);
			}
			
			vd class_vd2 = this.k[(int) (scriptId & (long) (-1 + this.j))];
			class_vd.clientScriptId = scriptId;
			System.out.println("ClientScriptId: " + class_vd.clientScriptId);
			class_vd.vd_l = class_vd2.vd_l;
			class_vd.vd_n = class_vd2;
			class_vd.vd_l.vd_n = class_vd;
			class_vd.vd_n.vd_l = class_vd;
			++m;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "md.A(" + "{...}" + ',' + scriptId + ',' + unused + ')');
		}
	}
	
	static boolean a(int var0, long var1, int var3, int var4) {
		try {
			++q;
			if (var3 != 11) {
				a((byte) -52, -62);
			}
			
			int var6 = (int) var1 >> -912402028 & 3;
			int var5 = (int) var1 >> -576216850 & 31;
			int var7 = Integer.MAX_VALUE & (int) (var1 >>> -2011681824);
			if (~var5 != -11 && var5 != 11 && var5 != 22) {
				qc.a(2, 0, var0, var4, (byte) 22, true, le.T.regionLocalX[0], 0, var6, var5 - -1, le.T.regionLocalY[0], 0);
			} else {
				fc var8 = rf.b(var3 ^ -14107, var7);
				int var9;
				int var10;
				if (~var6 != -1 && ~var6 != -3) {
					var9 = var8.Gb;
					var10 = var8.Mb;
				} else {
					var9 = var8.Mb;
					var10 = var8.Gb;
				}
				
				int var11 = var8.yb;
				if (~var6 != -1) {
					var11 = (var11 << var6 & 15) + (var11 >> -var6 + 4);
				}
				
				qc.a(2, var10, var0, var4, (byte) -114, true, le.T.regionLocalX[0], var11, 0, 0, le.T.regionLocalY[0], var9);
			}
			
			ai.wb = 0;
			af.t = tf.m;
			jc.anInt_ib = 2;
			jh.h = ia.eb;
			return true;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "md.D(" + var0 + ',' + var1 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final vd b(byte unused) {
		try {
			++d;
			this.u = 0;
			return this.a((byte) -33);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "md.E(" + unused + ')');
		}
	}
	
	static {
		a = yellow_keyword;
		title_mute = rf.a(40, "title_mute");
		yellow_keyword2 = yellow_keyword;
		e = new Object();
	}
}
