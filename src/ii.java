import java.io.IOException;

final class ii extends vd {
	
	static int o = 0;
	int p;
	static short[] q;
	static int r;
	static int s;
	static int t;
	static int u;
	static int anInt_v;
	static int w;
	int[][] x;
	static int y;
	static int z = 0;
	static int B;
	private boolean[] C;
	private int D;
	static ob E = rf.a(40, "<col=00ff80>");
	int[] F;
	static int[] G = new int[50];
	
	static boolean a(boolean var0) {
		int var16 = client.anInt_wb;
		
		try {
			++B;
			long var1 = a.a((byte) -100);
			int var3 = (int) (var1 - ri.aLong_h);
			if (var3 > 200) {
				var3 = 200;
			}
			
			ri.aLong_h = var1;
			hh.M += var3;
			if (pb.a == 0 && ~rg.anint_s == -1 && jd.b == 0 && ~gh.hb == -1) {
				return true;
			} else if (rg.z == null) {
				return false;
			} else {
				try {
					if (~hh.M < -30001) {
						throw new IOException();
					} else {
						label260:
						while (true) {
							v var4;
							og var5;
							if (rg.anint_s < 20) {
								if (gh.hb > 0) {
									var4 = (v) qe.a.b((byte) 117);
									var5 = new og(4);
									var5.writeByte(86, 1);
									var5.writeMedInt(-78, (int) var4.clientScriptId);
									rg.z.a(39, var5.buffer, 4, 0);
									pe.E.a(var4, var4.clientScriptId, true);
									++rg.anint_s;
									--gh.hb;
									continue;
								}
								
								if (var16 == 0 && (pb.a >= 20 || ~jd.b >= -1)) {
									break;
								}
							} else if (pb.a >= 20 || ~jd.b >= -1) {
								break;
							}
							
							while (true) {
								var4 = (v) mg.a.a(15843);
								var5 = new og(4);
								var5.writeByte(81, 0);
								var5.writeMedInt(-128, (int) var4.clientScriptId);
								rg.z.a(39, var5.buffer, 4, 0);
								var4.a((byte) 122);
								rh.m.a(var4, var4.clientScriptId, true);
								--jd.b;
								++pb.a;
								if (pb.a >= 20 || ~jd.b >= -1) {
									break label260;
								}
							}
						}
						
						int var21 = 0;
						if (var0) {
							b(59, 104);
							if (var16 == 0 && var21 >= 100) {
								return true;
							}
						} else if (var21 >= 100) {
							return true;
						}
						
						do {
							int var22 = rg.z.available(0);
							if (~var22 > -1) {
								throw new IOException();
							}
							
							if (~var22 == -1) {
								break;
							}
							
							hh.M = 0;
							byte var6 = 0;
							if (ff.Z == null) {
								var6 = 8;
							} else if (ga.j == 0) {
								var6 = 1;
							}
							
							int len;
							int var8;
							int var9;
							int var11;
							if (var6 <= 0) {
								len = -ff.Z.O + v.Cb.buffer.length;
								var8 = -ga.j + 512;
								if (~(-v.Cb.pointer + len) > ~var8) {
									var8 = len - v.Cb.pointer;
									if (var8 > var22) {
										var8 = var22;
									}
								} else if (var8 > var22) {
									var8 = var22;
								}
								
								rg.z.read(var8, (byte) 96, v.Cb.buffer, v.Cb.pointer);
								if (tb.aByte_h != 0) {
									var9 = 0;
									while (~var9 > ~var8) {
										v.Cb.buffer[var9 + v.Cb.pointer] = (byte) ph.a(v.Cb.buffer[var9 + v.Cb.pointer], tb.aByte_h);
										++var9;
									}
								}
								
								ga.j += var8;
								v.Cb.pointer += var8;
								if (v.Cb.pointer != len) {
									if (~ga.j != -513) {
										break;
									}
									
									ga.j = 0;
									if (var16 == 0) {/*
										++var21;
										continue;
									*/}
								}
								
								label280: {
									if (ff.Z.clientScriptId != 16711935L) {
										ue.hb.reset();
										ue.hb.update(v.Cb.buffer, 0, len);
										var9 = (int) ue.hb.getValue();
										if (ff.Z.xb != var9) {
											try {
												rg.z.b(-2);
											} catch (Exception var18) {
												var18.printStackTrace();
											}
											
											rg.z = null;
											++b.eb;
											tb.aByte_h = (byte) ((int) (1.0D + Math.random() * 255.0D));
											return false;
										}
										
										dg.nc = 0;
										b.eb = 0;
										ff.Z.zb.a((ff.Z.clientScriptId & 16711680L) == 16711680L, v.Cb.buffer, ff.W, (int) (65535L & ff.Z.clientScriptId), (byte) 102);
										if (var16 == 0) {
											break label280;
										}
									}
									
									ig.c = v.Cb;
									var9 = 0;
									if (var16 != 0 || var9 < 256) {
										do {
											ca var10 = qi.s[var9];
											if (var10 != null) {
												ig.c.pointer = 8 * var9 + 5;
												var11 = ig.c.readInt(1029109968);
												int var12 = ig.c.readInt(1029109968);
												var10.a(var11, (byte) 88, var12);
											}
											
											++var9;
										} while (var9 < 256);
									}
								}
								
								ff.Z.c(128);
								v.Cb = null;
								ga.j = 0;
								ff.Z = null;
								if (ff.W) {
									--rg.anint_s;
									if (var16 == 0) {
										++var21;
										continue;
									}
								}
								
								--pb.a;
								if (var16 == 0) {
									++var21;
									continue;
								}
								
								len = var6 - wb.R.pointer;
								if (~var22 > ~len) {
									len = var22;
								}
							} else {
								len = var6 - wb.R.pointer;
								if (~var22 > ~len) {
									len = var22;
								}
							}
							
							rg.z.read(len, (byte) -127, wb.R.buffer, wb.R.pointer);
							if (~tb.aByte_h != -1) {
								var8 = 0;
								if (var16 != 0) {
									wb.R.buffer[wb.R.pointer + var8] = (byte) ph.a(wb.R.buffer[wb.R.pointer + var8], tb.aByte_h);
									++var8;
								}
								
								while (~len < ~var8) {
									wb.R.buffer[wb.R.pointer + var8] = (byte) ph.a(wb.R.buffer[wb.R.pointer + var8], tb.aByte_h);
									++var8;
								}
								
								wb.R.pointer += len;
								if (var6 > wb.R.pointer) {
									break;
								}
							} else {
								wb.R.pointer += len;
								if (var6 > wb.R.pointer) {
									break;
								}
							}
							
							if (ff.Z == null) {
								wb.R.pointer = 0;
								var8 = wb.R.readUnsignedByte(255);
								var9 = wb.R.readShort(102);
								int var23 = wb.R.readUnsignedByte(255);
								var11 = wb.R.readInt(1029109968);
								long var24 = (long) (var9 + (var8 << 16));
								v var14 = (v) pe.E.a(var24, 22346);
								ff.W = true;
								if (var14 == null) {
									var14 = (v) rh.m.a(var24, 22346);
									ff.W = false;
								}
								
								if (var14 == null) {
									throw new IOException();
								}
								
								ff.Z = var14;
								int var15 = var23 == 0 ? 5 : 9;
								v.Cb = new og(var15 + var11 - -ff.Z.O);
								v.Cb.writeByte(104, var23);
								v.Cb.writeInt(var11, (byte) -125);
								wb.R.pointer = 0;
								ga.j = 8;
								if (var16 == 0) {
									++var21;
									continue;
								}
							}
							
							if (ga.j == 0) {
								if (~wb.R.buffer[0] != 0) {
									ff.Z = null;
									if (var16 != 0) {
										wb.R.pointer = 0;
										ga.j = 1;
									}
								} else {
									wb.R.pointer = 0;
									ga.j = 1;
								}
							}
							
							++var21;
						} while (var21 < 100);
						
						return true;
					}
				} catch (IOException e) {
					e.printStackTrace();
					try {
						rg.z.b(-2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					++dg.nc;
					rg.z = null;
					return false;
				}
			}
		} catch (RuntimeException var20) {
			throw bc.a(var20, "ii.F(" + var0 + ')');
		}
	}
	
	static int a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6) {
		try {
			int var7;
			if (~(1 & var2) == -2) {
				var7 = var0;
				var0 = var4;
				var4 = var7;
			}
			
			var7 = -105 % ((var5 - -31) / 62);
			++anInt_v;
			var3 &= 3;
			return ~var3 == -1 ? var1 : (var3 == 1 ? -var0 - (-1 - -var6 - 7) : (var3 == 2 ? -var4 + 1 + (7 - var1) : var6));
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ii.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	static void a(boolean var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var16 = client.anInt_wb;
		
		try {
			++u;
			int var8 = var4 + var2;
			int var10 = var6 + var2;
			int var9 = -var2 + var5;
			int var11 = -var2 + var7;
			if (!var0) {
				a(true);
			}
			
			int var12 = var4;
			if (var16 != 0) {
				sa.a(var7, (byte) 52, var6, var1, e.ints_b[var4]);
				var12 = var4 + 1;
			}
			
			while (var8 > var12) {
				sa.a(var7, (byte) 52, var6, var1, e.ints_b[var12]);
				++var12;
			}
			
			int var13 = var5;
			if (var16 != 0 || var5 > var9) {
				do {
					sa.a(var7, (byte) 52, var6, var1, e.ints_b[var13]);
					--var13;
				} while (var13 > var9);
			}
			
			int var14 = var8;
			if (var16 != 0 || ~var8 >= ~var9) {
				do {
					int[] var15 = e.ints_b[var14];
					sa.a(var10, (byte) 52, var6, var1, var15);
					sa.a(var11, (byte) 52, var10, var3, var15);
					sa.a(var7, (byte) 52, var11, var1, var15);
					++var14;
				} while (~var14 >= ~var9);
				
			}
		} catch (RuntimeException var17) {
			throw bc.a(var17, "ii.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	public static void d(int var0) {
		try {
			if (var0 != 13786) {
				b(17, 43);
			}
			
			E = null;
			q = null;
			G = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ii.H(" + var0 + ')');
		}
	}
	
	static int b(int var0, int var1) {
		try {
			++s;
			return 1023 & var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ii.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int unused, pe cacheFile7, boolean forceSend, pe cacheFile16) {
		try {
			++y;
			ta.Z = forceSend;
			hg.cacheFile16 = cacheFile16;
			li.cacheFile7 = cacheFile7;
		} catch (RuntimeException e) {
			throw bc.a(e, "ii.C(" + unused + ',' + (cacheFile7 != null ? "{...}" : "null") + ',' + forceSend
					+ ',' + (cacheFile16 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void e(int var0) {
		try {
			ub.g = null;
			be.h = null;
			wg.V = null;
			ci.A = null;
			if (var0 >= -21) {
				o = -43;
			}
			
			ci.x = null;
			++w;
			le.db = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ii.E(" + var0 + ')');
		}
	}
	
	ii(int var1, byte[] var2) {
		super();
		int var9 = client.anInt_wb;
		
		try {
			this.p = var1;
			og var3 = new og(var2);
			this.D = var3.readUnsignedByte(255);
			this.C = new boolean[this.D];
			this.F = new int[this.D];
			this.x = new int[this.D][];
			int var4 = 0;
			if (var9 != 0) {
				this.F[var4] = var3.readUnsignedByte(255);
				++var4;
			}
			
			while (~var4 > ~this.D) {
				this.F[var4] = var3.readUnsignedByte(255);
				++var4;
			}
			
			int var5 = 0;
			if (var9 != 0) {
				this.C[var5] = var3.readUnsignedByte(255) == 1;
				++var5;
			}
			
			while (~this.D < ~var5) {
				this.C[var5] = var3.readUnsignedByte(255) == 1;
				++var5;
			}
			
			int var6 = 0;
			if (var9 != 0 || ~var6 > ~this.D) {
				do {
					this.x[var6] = new int[var3.readUnsignedByte(255)];
					++var6;
				} while (~var6 > ~this.D);
			}
			
			int var7 = 0;
			if (var9 != 0 || ~var7 > ~this.D) {
				do {
					int var8 = 0;
					if (var9 != 0 || var8 < this.x[var7].length) {
						do {
							this.x[var7][var8] = var3.readUnsignedByte(255);
							++var8;
						} while (var8 < this.x[var7].length);
					}
					
					++var7;
				} while (~var7 > ~this.D);
				
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ii.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void b(int var0, int var1, int var2) {
		try {
			++r;
			d var3 = ob.b(var1, var2 + -23272);
			int var4 = var3.I;
			if (var2 != 23207) {
				o = 68;
			}
			
			int var5 = var3.F;
			int var6 = var3.K;
			int var7 = qb.H[-var5 + var6];
			if (~var0 > -1 || ~var0 < ~var7) {
				var0 = 0;
			}
			
			var7 <<= var5;
			sa.c[var4] = ff.b(bd.b(sa.c[var4], ~var7), bd.b(var7, var0 << var5));
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ii.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
