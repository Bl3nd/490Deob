final class dh {
	
	static int a;
	static int b;
	static int c;
	static ob ob_d;
	static ob e;
	static int f;
	static int g;
	static ob rect_debug;
	static ob i = rf.a(40, " ");
	static int j;
	static int k;
	private static ob ob_l = rf.a(40, "white:");
	static ui m;
	static ob n;
	static int o;
	static ob p;
	static int q;
	static short[] r;
	
	static void a(int var0) {
		int var30 = client.anInt_wb;
		
		try {
			++q;
			int var1;
			int var2;
			int var4;
			int var5;
			int var6;
			int var7;
			int var32;
			if (~gf.F == -233) {
				var1 = pg.packetBuffer.f(var0 ^ -711444086);
				var2 = (7 & var1 >> 4) + le.bb;
				var32 = (7 & var1) + pa.d;
				var4 = pg.packetBuffer.readUnsignedByteS(-8544);
				var5 = var4 >> 2;
				var6 = var4 & 3;
				var7 = ke.jb[var5];
				if (var2 >= 0 && var32 >= 0 && ~var2 > -105 && var32 < 104) {
					tg.a(var5, var2, -1, var6, var7, 117, 0, var32, gf.G, -1);
				}
				
			} else {
				int var38;
				if (~gf.F == -248) {
					var1 = pg.packetBuffer.readUByteC((byte) -127);
					var32 = pa.d - -(7 & var1);
					var2 = (var1 >> 4 & 7) + le.bb;
					var4 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
					var5 = pg.packetBuffer.readUnsignedByteS(var0 + -8546);
					var7 = var5 & 3;
					var6 = var5 >> 2;
					var38 = ke.jb[var6];
					if (~var2 <= -1 && var32 >= 0 && ~var2 > -105 && var32 < 104) {
						tg.a(var6, var2, -1, var7, var38, 25, 0, var32, gf.G, var4);
					}
					
				} else {
					int var11;
					int var12;
					int var13;
					int var40;
					int var43;
					if (~gf.F == -150) {
						var1 = pg.packetBuffer.readUnsignedByte(var0 ^ 253);
						var32 = (var1 & 7) + pa.d;
						var2 = le.bb - -(var1 >> 4 & 7);
						var4 = pg.packetBuffer.readByte(var0 + 1064893126) + var2;
						var5 = pg.packetBuffer.readByte(1064893128) + var32;
						var6 = pg.packetBuffer.readSignedShort((byte) -67);
						var7 = pg.packetBuffer.readShort(120);
						var38 = pg.packetBuffer.readUnsignedByte(255) * 4;
						var40 = 4 * pg.packetBuffer.readUnsignedByte(var0 ^ 253);
						var43 = pg.packetBuffer.readShort(45);
						var11 = pg.packetBuffer.readShort(43);
						var12 = pg.packetBuffer.readUnsignedByte(255);
						var13 = pg.packetBuffer.readUnsignedByte(255);
						if (~var2 <= -1 && ~var32 <= -1 && ~var2 > -105 && var32 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && ~var5 > -105 && ~var7 != -65536) {
							var2 = 128 * var2 - -64;
							var4 = var4 * 128 - -64;
							var32 = 128 * var32 - -64;
							var5 = 64 + var5 * 128;
							da var46 = new da(var7, gf.G, var2, var32, ug.a(gf.G, var2, (byte) 40, var32) - var38, var43 + bi.f, var11 - -bi.f, var12, var13, var6, var40);
							var46.a(var43 + bi.f, var5, -var40 + ug.a(gf.G, var4, (byte) 40, var5), var0 ^ -120, var4);
							ci.u.a(var0 + -2, var46);
						}
						
					} else {
						if (gf.F == 142) {
							byte var3;
							byte var8;
							byte var9;
							byte var10;
							int var14;
							dg var16;
							label328:
							{
								var1 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
								var2 = pg.packetBuffer.readUnsignedShort((byte) -127);
								var3 = pg.packetBuffer.readByte(1064893128);
								var4 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
								var5 = pg.packetBuffer.readUnsignedByte(255);
								var6 = (var5 >> 4 & 7) + le.bb;
								var7 = (var5 & 7) + pa.d;
								var8 = pg.packetBuffer.readByte(1064893128);
								var9 = pg.packetBuffer.u(-91);
								var10 = pg.packetBuffer.e(1844990088);
								var11 = pg.packetBuffer.readUnsignedByteS(-8544);
								var13 = 3 & var11;
								var12 = var11 >> 2;
								var14 = ke.jb[var12];
								int var15 = pg.packetBuffer.readShort(67);
								if (var15 == jh.c) {
									var16 = le.T;
									if (var30 == 0) {
										break label328;
									}
								}
								
								var16 = lg.j[var15];
							}
							
							if (var16 != null) {
								fc var17;
								int var18;
								int var19;
								label362:
								{
									var17 = rf.b(-14098, var2);
									if (var13 == 1 || var13 == 3) {
										var18 = var17.Gb;
										var19 = var17.Mb;
										if (var30 == 0) {
											break label362;
										}
									}
									
									var18 = var17.Mb;
									var19 = var17.Gb;
								}
								
								int var20 = (var18 >> 1) + var6;
								int var22 = var7 - -(var19 >> 1);
								int var21 = (1 + var18 >> 1) + var6;
								int var23 = var7 + (var19 + 1 >> 1);
								int[][] var24 = d.D[gf.G];
								int var26 = (var18 << 6) + (var6 << 7);
								int var25 = var24[var20][var22] + var24[var21][var22] + (var24[var20][var23] - -var24[var21][var23]) >> 2;
								int var27 = (var7 << 7) + (var19 << 6);
								qb var28 = var17.a(var26, var12, false, var13, var25, -107, var27, var24);
								if (var28 != null) {
									tg.a(0, var6, var4 + 1, 0, var14, 76, var1 - -1, var7, gf.G, -1);
									var16.mc = var25;
									var16.oc = var1 - -bi.f;
									var16.rc = (fe) var28.E;
									var16.zc = 128 * var6 + var18 * 64;
									var16.Bc = var19 * 64 + var7 * 128;
									byte var29;
									if (~var10 > ~var3) {
										var29 = var3;
										var3 = var10;
										var10 = var29;
									}
									
									if (~var8 < ~var9) {
										var29 = var8;
										var8 = var9;
										var9 = var29;
									}
									
									var16.Gc = var7 + var8;
									var16.hc = var4 - -bi.f;
									var16.Jc = var3 + var6;
									var16.sc = var10 + var6;
									var16.yc = var7 + var9;
								}
							}
						}
						
						if (gf.F == 221) {
							var1 = pg.packetBuffer.readUnsignedByte(255);
							var32 = (7 & var1) + pa.d;
							var2 = le.bb - -(7 & var1 >> 4);
							var4 = pg.packetBuffer.readShort(105);
							if (var4 == '\uffff') {
								var4 = -1;
							}
							
							var5 = pg.packetBuffer.readUnsignedByte(255);
							var38 = pg.packetBuffer.readUnsignedByte(var0 + 253);
							var6 = 15 & var5 >> 4;
							var7 = 7 & var5;
							if (var2 >= 0 && var32 >= 0 && ~var2 > -105 && ~var32 > -105) {
								var40 = var6 - -1;
								if (-var40 + var2 <= le.T.regionLocalX[0] && var40 + var2 >= le.T.regionLocalX[0] && le.T.regionLocalY[0] >= -var40 + var32 && ~le.T.regionLocalY[0] >= ~(var40 + var32) && ~qf.L != -1 && ~var7 < -1 && ~k > -51 && ~var4 != 0) {
									ri.k[k] = var4;
									ii.G[k] = var7;
									eh.Y[k] = var38;
									ke.rb[k] = null;
									kg.o[k] = var6 + ((var2 << 16) - -(var32 << 8));
									++k;
								}
							}
						}
						
						ta var34;
						if (~gf.F == -53) {
							var1 = pg.packetBuffer.readUnsignedShortA((byte) 92);
							var2 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
							var32 = pg.packetBuffer.readUByteC((byte) -127);
							var4 = le.bb + ((122 & var32) >> 4);
							var5 = pa.d - -(7 & var32);
							if (var4 >= 0 && var5 >= 0 && ~var4 > -105 && var5 < 104) {
								var34 = new ta();
								var34.Y = var1;
								var34.P = var2;
								if (hf.C[gf.G][var4][var5] == null) {
									hf.C[gf.G][var4][var5] = new pi();
								}
								
								hf.C[gf.G][var4][var5].a(0, var34);
								ta.c(0, var5, var4);
							}
							
						} else if (gf.F == 85) {
							var1 = pg.packetBuffer.readUnsignedShortA((byte) 82);
							var2 = pg.packetBuffer.readUnsignedShort((byte) -119);
							var32 = pg.packetBuffer.readUnsignedByte(255);
							var4 = (var32 >> 4 & 7) + le.bb;
							var5 = (var32 & 7) + pa.d;
							var6 = pg.packetBuffer.readUnsignedShort((byte) -115);
							if (var4 >= 0 && ~var5 <= -1 && ~var4 > -105 && ~var5 > -105 && ~jh.c != ~var2) {
								ta var37 = new ta();
								var37.P = var1;
								var37.Y = var6;
								if (hf.C[gf.G][var4][var5] == null) {
									hf.C[gf.G][var4][var5] = new pi();
								}
								
								hf.C[gf.G][var4][var5].a(0, var37);
								ta.c(0, var5, var4);
							}
							
						} else if (~gf.F == -173) {
							var1 = pg.packetBuffer.readUnsignedShortA((byte) 76);
							var2 = pg.packetBuffer.f(-711444088);
							var32 = le.bb - -(var2 >> 4 & 7);
							var4 = (var2 & 7) + pa.d;
							if (var32 >= 0 && var4 >= 0 && ~var32 > -105 && var4 < 104) {
								pi var33 = hf.C[gf.G][var32][var4];
								if (var33 != null) {
									var34 = (ta) var33.a((byte) -9);
									if (var30 != 0 || var34 != null) {
										do {
											if (~var34.P == ~(32767 & var1)) {
												var34.c(128);
												if (var30 == 0) {
													break;
												}
											}
											
											var34 = (ta) var33.b((byte) 96);
										} while (var34 != null);
									}
									
									if (var33.a((byte) -9) == null) {
										hf.C[gf.G][var32][var4] = null;
									}
									
									ta.c(0, var4, var32);
								}
							}
							
						} else if (~gf.F == -184) {
							var1 = pg.packetBuffer.readUnsignedByte(255);
							var32 = pa.d + (7 & var1);
							var2 = le.bb + (7 & var1 >> 4);
							var4 = pg.packetBuffer.readShort(36);
							var5 = pg.packetBuffer.readUnsignedByte(255);
							var6 = pg.packetBuffer.readShort(49);
							if (var2 >= 0 && var32 >= 0 && ~var2 > -105 && var32 < 104) {
								var2 = var2 * 128 - -64;
								var32 = 64 + 128 * var32;
								gh var36 = new gh(var4, gf.G, var2, var32, -var5 + ug.a(gf.G, var2, (byte) 40, var32), var6, bi.f);
								nf.ib.a(var0 + -2, var36);
							}
							
						} else {
							if (var0 != 2) {
								m = null;
							}
							
							if (~gf.F == -49) {
								var1 = pg.packetBuffer.readUnsignedByteS(var0 + -8546);
								var32 = var1 & 3;
								var2 = var1 >> 2;
								var4 = ke.jb[var2];
								var5 = pg.packetBuffer.readUnsignedByte(255);
								var6 = le.bb + (var5 >> 4 & 7);
								var7 = (var5 & 7) + pa.d;
								var38 = pg.packetBuffer.readUnsignedShortA((byte) -44);
								if (var38 == '\uffff') {
									var38 = -1;
								}
								
								if (~var6 <= -1 && ~var7 <= -1 && ~var6 > -104 && ~var7 > -104) {
									if (var4 == 0) {
										rc var41 = v.b(gf.G, var6, var7);
										if (var41 != null) {
											label356:
											{
												var43 = (int) (var41.j >>> 32) & Integer.MAX_VALUE;
												if (~var2 != -3) {
													var41.k = new ff(var43, var2, var32, gf.G, var6, var7, var38, false, var41.k);
													if (var30 == 0) {
														break label356;
													}
												}
												
												var41.k = new ff(var43, 2, 4 - -var32, gf.G, var6, var7, var38, false, var41.k);
												var41.b = new ff(var43, 2, 1 + var32 & 3, gf.G, var6, var7, var38, false, var41.b);
											}
										}
									}
									
									if (var4 == 1) {
										fg var42 = sf.a(gf.G, var6, var7);
										if (var42 != null) {
											label364:
											{
												var43 = Integer.MAX_VALUE & (int) (var42.m >>> 32);
												if (~var2 == -5 || var2 == 5) {
													var42.o = new ff(var43, 4, var32, gf.G, var6, var7, var38, false, var42.o);
													if (var30 == 0) {
														break label364;
													}
												}
												
												if (~var2 != -7) {
													if (~var2 == -8) {
														var42.o = new ff(var43, 4, 4 + (3 & 2 + var32), gf.G, var6, var7, var38, false, var42.o);
														if (var30 == 0) {
															break label364;
														}
													}
													
													if (~var2 != -9) {
														break label364;
													}
													
													var42.o = new ff(var43, 4, var32 - -4, gf.G, var6, var7, var38, false, var42.o);
													var42.s = new ff(var43, 4, 4 + (var32 - -2 & 3), gf.G, var6, var7, var38, false, var42.s);
													if (var30 == 0) {
														break label364;
													}
												}
												
												var42.o = new ff(var43, 4, var32 - -4, gf.G, var6, var7, var38, false, var42.o);
											}
										}
									}
									
									if (~var4 == -3) {
										ah var44 = ni.d(gf.G, var6, var7);
										if (var2 == 11) {
											var2 = 10;
										}
										
										if (var44 != null) {
											var44.h = new ff((int) (var44.b >>> 32) & Integer.MAX_VALUE, var2, var32, gf.G, var6, var7, var38, false, var44.h);
										}
									}
									
									if (var4 == 3) {
										me var45 = vd.a(gf.G, var6, var7);
										if (var45 != null) {
											var45.c = new ff(Integer.MAX_VALUE & (int) (var45.o >>> 32), 22, var32, gf.G, var6, var7, var38, false, var45.c);
										}
									}
								}
								
							} else if (~gf.F == -241) {
								var1 = pg.packetBuffer.readUnsignedByte(255);
								var2 = ((var1 & 115) >> 4) + le.bb;
								var32 = pa.d + (var1 & 7);
								var4 = pg.packetBuffer.readShort(67);
								var5 = pg.packetBuffer.readShort(var0 ^ 58);
								var6 = pg.packetBuffer.readShort(100);
								if (~var2 <= -1 && ~var32 <= -1 && ~var2 > -105 && var32 < 104) {
									pi var35 = hf.C[gf.G][var2][var32];
									if (var35 != null) {
										ta var39 = (ta) var35.a((byte) -9);
										if (var30 != 0 || var39 != null) {
											do {
												if (~(var4 & 32767) == ~var39.P && ~var5 == ~var39.Y) {
													var39.Y = var6;
													if (var30 == 0) {
														break;
													}
												}
												
												var39 = (ta) var35.b((byte) -16);
											} while (var39 != null);
										}
										
										ta.c(var0 ^ 2, var32, var2);
									}
								}
								
							}
						}
					}
				}
			}
		} catch (RuntimeException var31) {
			throw bc.a(var31, "dh.E(" + var0 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			if (var0 == 7) {
				ob_d = null;
				ob_l = null;
				m = null;
				r = null;
				i = null;
				p = null;
				rect_debug = null;
				e = null;
				n = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dh.G(" + var0 + ')');
		}
	}
	
	static boolean a(int var0, int var1) {
		try {
			++j;
			if (var0 <= 125) {
				a(-67, (ca) null, (qe) null, false);
			}
			
			return ~var1 <= -98 && var1 <= 122 || ~var1 <= -66 && ~var1 >= -91;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "dh.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void a(byte var0) {
		try {
			++b;
			synchronized (md.e) {
				if (pi.s != 0) {
					pi.s = 1;
					
					try {
						md.e.wait();
					} catch (InterruptedException var6) {
						var6.printStackTrace();
					}
				}
			}
			
		} catch (RuntimeException var8) {
			throw bc.a(var8, "dh.C(" + var0 + ')');
		}
	}
	
	static void a(boolean var0, int var1, int var2, int var3, int var4, int var5, ra var6) {
		try {
			++g;
			if (!var0) {
				int var7 = Math.min(var6.L / 2, var6.w / 2);
				int var8 = var5 * var5 + var3 * var3;
				if (~(var7 * var7) > ~var8 && var8 < 90000) {
					var7 -= 10;
					int var9 = jg.h + ve.anInt_l & 2047;
					int var11 = ec.L[var9];
					int var10 = ec.W[var9];
					var11 = var11 * 256 / (lg.d + 256);
					var10 = 256 * var10 / (256 + lg.d);
					int var12 = var5 * var10 - -(var3 * var11) >> 16;
					int var13 = -(var3 * var10) + var5 * var11 >> 16;
					double var14 = Math.atan2((double) var12, (double) var13);
					int var16 = (int) (Math.sin(var14) * (double) var7);
					int var17 = (int) (Math.cos(var14) * (double) var7);
					ug.u[var2].a(var1 - (-(var6.L / 2) + -var16) + -10, var4 - (-(var6.w / 2) + (var17 - -10)), 20, 20, 15, 15, var14, 256);
				} else {
					ac.a(vb.g[var2], -113, var1, var5, var6, var4, var3);
				}
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "dh.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + "{...}" + ')');
		}
	}
	
	static int b(int var0, int var1) {
		try {
			if (var0 != 28905) {
				b(-39);
			}
			
			++a;
			return var1 >>> 8;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "dh.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void a(int clientScriptId, ca var1, qe var2, boolean var3) {
		int var8 = client.anInt_wb;
		
		try {
			byte[] var4 = null;
			synchronized (l.pi_c) {
				if (var3) {
					a(10, null, null, true);
				}
				
				qc var7 = (qc) l.pi_c.a((byte) -9);
				if (var8 != 0 || var7 != null) {
					do {
						if (var7 != null && ~var7.clientScriptId == ~((long) clientScriptId) && var7.o == var2 && var7.t == 0) {
							var4 = var7.bytes_r;
							break;
						}

						var7 = (qc) l.pi_c.b((byte) -100);
					} while (var7 != null);
				}
			}
			
			++c;
			if (var4 != null) {
				var1.a((byte) -14, clientScriptId, var4, true, var2);
			} else {
				byte[] var13 = var2.a(80, clientScriptId);
				var1.a((byte) -14, clientScriptId, var13, true, var2);
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "dh.F(" + clientScriptId + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	static {
		ob_d = ob_l;
		n = rf.a(40, "Update)2Liste geladen)3");
		e = rf.a(40, "<col=ffffff>");
		k = 0;
		p = ob_l;
		r = new short[] {(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
		rect_debug = rf.a(40, "rect_debug=");
	}
}
