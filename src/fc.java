final class fc extends rg {
	
	boolean D = false;
	private int E = -1;
	int F = -1;
	static int G;
	private boolean H = false;
	static short[] I = new short[] {(short) -1, (short) -1, (short) -1, (short) -1, (short) -1};
	int[] J;
	int K = -1;
	static int L;
	ob M;
	int N;
	private int[] O;
	private short[] P;
	private int Q = -1;
	static int R;
	static ob hint_mapmarkers = rf.a(40, "hint_mapmarkers");
	private boolean T;
	private int U = 128;
	boolean V = true;
	private int W;
	private int X = 128;
	static int sl_backValue = -1;
	private int Z = 0;
	static int ab;
	private int[] bb;
	private int anInt_cb = 128;
	static int db;
	boolean eb = false;
	int fb;
	static int gb;
	static int titleboxValue = -1;
	int anInt_ib = -1;
	static int jb;
	int kb;
	boolean lb = true;
	private short[] mb;
	int[] nb;
	static int ob = 0;
	static int pb;
	boolean qb = true;
	boolean rb = false;
	int sb;
	static int tb;
	int ub;
	private int vb = 0;
	ob[] wb;
	int xb;
	int yb = 0;
	private int zb;
	static int Ab;
	int Bb;
	static ob Cb = rf.a(40, "T");
	private short[] Db;
	static int Eb;
	private int Fb;
	int Gb;
	int Hb;
	boolean Ib;
	static int scapeMainValue = -1;
	int Kb;
	static int Lb;
	int Mb;
	static int Nb;
	private short[] Ob;
	static int Pb = 0;
	static int Qb;
	private int Rb;
	static int Sb;
	
	static void f(int var0) {
		int var4 = client.anInt_wb;
		
		try {
			++Sb;
			if (var0 != 1) {
				b(-94, 109, -14);
			}
			
			if (rc.f == null || nf.Y == null) {
				nf.Y = new int[256];
				rc.f = new int[256];
				int var1 = 0;
				if (var4 != 0 || ~var1 > -257) {
					do {
						double var2 = 6.283185307179586D * ((double) var1 / 255.0D);
						rc.f[var1] = (int) (4096.0D * Math.sin(var2));
						nf.Y[var1] = (int) (4096.0D * Math.cos(var2));
						++var1;
					} while (~var1 > -257);
				}
			}
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "fc.G(" + var0 + ')');
		}
	}
	
	final boolean b(byte var1) {
		int var4 = client.anInt_wb;
		
		try {
			++L;
			if (this.bb == null) {
				return true;
			} else {
				boolean var2 = true;
				if (var1 <= 13) {
					this.fb = 28;
				}
				
				int var3 = 0;
				if (var4 == 0 && this.bb.length <= var3) {
					return var2;
				} else {
					do {
						var2 &= li.cacheFile7.b((byte) 107, this.bb[var3], 0);
						++var3;
					} while (this.bb.length > var3);
					
					return var2;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "fc.K(" + var1 + ')');
		}
	}
	
	private void a(int var1, int var2, og var3) {
		try {
			++Qb;
			if (var2 == -28) {
				int var4;
				int var5;
				if (~var1 == -2) {
					var4 = var3.readUnsignedByte(255);
					if (~var4 < -1) {
						if (this.bb != null && !ta.Z) {
							var3.pointer += 3 * var4;
							return;
						}
						
						this.O = new int[var4];
						this.bb = new int[var4];
						
						for (var5 = 0; var4 > var5; ++var5) {
							this.bb[var5] = var3.readShort(var2 + 150);
							this.O[var5] = var3.readUnsignedByte(255);
						}
						
					}
				} else {
					if (var1 == 2) {
						this.M = var3.t(var2 ^ 19415);
						return;
					}
					
					if (var1 != 5) {
						if (var1 == 14) {
							this.Mb = var3.readUnsignedByte(255);
							return;
						} else if (var1 == 15) {
							this.Gb = var3.readUnsignedByte(255);
							return;
						} else if (~var1 == -18) {
							this.ub = 0;
							this.V = false;
							return;
						} else if (~var1 == -19) {
							this.V = false;
							return;
						} else if (~var1 == -20) {
							this.kb = var3.readUnsignedByte(255);
							return;
						} else if (var1 != 21) {
							if (var1 == 22) {
								this.T = true;
								return;
							} else {
								if (~var1 != -24) {
									if (var1 != 24) {
										if (~var1 == -28) {
											this.ub = 1;
											return;
										}
										
										if (var1 == 28) {
											this.fb = var3.readUnsignedByte(255);
											return;
										}
										
										if (var1 == 29) {
											this.Rb = var3.readByte(1064893128);
											return;
										}
										
										if (~var1 == -40) {
											this.Z = 5 * var3.readByte(1064893128);
											return;
										}
										
										if (~var1 <= -31 && ~var1 > -36) {
											this.wb[var1 - 30] = var3.t(-19405);
											if (this.wb[var1 + -30].b((byte) -99, ri.hidden2)) {
												this.wb[-30 + var1] = null;
												return;
											}
										} else {
											if (~var1 == -41) {
												var4 = var3.readUnsignedByte(var2 ^ -229);
												this.Db = new short[var4];
												this.P = new short[var4];
												
												for (var5 = 0; ~var4 < ~var5; ++var5) {
													this.P[var5] = (short) var3.readShort(123);
													this.Db[var5] = (short) var3.readShort(76);
												}
												
												return;
											}
											
											if (var1 == 41) {
												var4 = var3.readUnsignedByte(255);
												this.Ob = new short[var4];
												this.mb = new short[var4];
												
												for (var5 = 0; var4 > var5; ++var5) {
													this.Ob[var5] = (short) var3.readShort(76);
													this.mb[var5] = (short) var3.readShort(59);
												}
												
												return;
											}
											
											if (~var1 == -61) {
												this.Kb = var3.readShort(37);
												return;
											}
											
											if (var1 == 62) {
												this.H = true;
												return;
											}
											
											if (var1 != 64) {
												if (~var1 == -66) {
													this.U = var3.readShort(var2 + 71);
													return;
												}
												
												if (~var1 == -67) {
													this.anInt_cb = var3.readShort(121);
													return;
												}
												
												if (~var1 == -68) {
													this.X = var3.readShort(114);
													return;
												}
												
												if (var1 == 68) {
													this.F = var3.readShort(125);
													return;
												}
												
												if (var1 == 69) {
													this.yb = var3.readUnsignedByte(255);
													return;
												}
												
												if (var1 == 70) {
													this.W = var3.readSignedShort((byte) -67);
													return;
												}
												
												if (var1 == 71) {
													this.Fb = var3.readSignedShort((byte) -67);
													return;
												}
												
												if (var1 == 72) {
													this.vb = var3.readSignedShort((byte) -67);
													return;
												}
												
												if (var1 == 73) {
													this.Ib = true;
													return;
												}
												
												if (var1 == 74) {
													this.eb = true;
													return;
												}
												
												if (~var1 == -76) {
													this.K = var3.readUnsignedByte(255);
													return;
												}
												
												if (var1 == 77) {
													this.E = var3.readShort(72);
													if (this.E == '\uffff') {
														this.E = -1;
													}
													
													this.zb = var3.readShort(42);
													if (this.zb == '\uffff') {
														this.zb = -1;
													}
													
													var4 = var3.readUnsignedByte(255);
													this.J = new int[var4 - -1];
													
													for (var5 = 0; ~var4 <= ~var5; ++var5) {
														this.J[var5] = var3.readShort(var2 + 82);
														if (this.J[var5] == '\uffff') {
															this.J[var5] = -1;
														}
													}
													
													return;
												}
												
												if (var1 == 78) {
													this.Hb = var3.readShort(var2 + 111);
													this.xb = var3.readUnsignedByte(255);
													return;
												}
												
												if (~var1 != -80) {
													if (var1 != 81) {
														if (~var1 != -83) {
															if (~var1 != -84) {
																if (~var1 == -85) {
																	var3.readSignedShort((byte) -67);
																	return;
																}
																
																if (var1 == 85) {
																	var3.readSignedShort((byte) -67);
																	return;
																}
																
																if (~var1 != -87) {
																	if (var1 == 87) {
																		var3.readShort(79);
																		return;
																	}
																	
																	if (~var1 != -89) {
																		if (var1 == 89) {
																			this.qb = false;
																			return;
																		}
																		
																		if (var1 == 90) {
																			this.D = true;
																			return;
																		}
																	}
																} else {
																	var3.readSignedShort((byte) -67);
																}
																
																return;
															}
															
															var3.readUnsignedByte(var2 ^ -229);
															return;
														}
													} else {
														this.Q = var3.readUnsignedByte(255) * 256;
													}
													
													return;
												}
												
												this.Bb = var3.readShort(69);
												this.sb = var3.readShort(var2 + 64);
												this.xb = var3.readUnsignedByte(255);
												var4 = var3.readUnsignedByte(var2 + 283);
												this.nb = new int[var4];
												
												for (var5 = 0; ~var4 < ~var5; ++var5) {
													this.nb[var5] = var3.readShort(var2 + 62);
												}
												
												return;
											}
											
											this.lb = false;
										}
										
										return;
									}
									
									this.anInt_ib = var3.readShort(89);
									if (~this.anInt_ib == -65536) {
										this.anInt_ib = -1;
										return;
									}
								} else {
									this.rb = true;
								}
								
								return;
							}
						} else {
							this.Q = 0;
							return;
						}
					}
					
					var4 = var3.readUnsignedByte(255);
					if (var4 <= 0) {
						return;
					}
					
					if (this.bb == null || ta.Z) {
						this.bb = new int[var4];
						this.O = null;
						
						for (var5 = 0; ~var5 > ~var4; ++var5) {
							this.bb[var5] = var3.readShort(60);
						}
						
						return;
					}
					
					var3.pointer += 2 * var4;
				}
				
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "fc.J(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void c(byte var1) {
		try {
			++G;
			if (~this.kb == 0) {
				this.kb = 0;
				if (this.bb != null && (this.O == null || this.O[0] == 10)) {
					this.kb = 1;
				}
				
				for (int var2 = 0; ~var2 > -6; ++var2) {
					if (this.wb[var2] != null) {
						this.kb = 1;
					}
				}
			}
			
			if (var1 < 60) {
				this.mb = null;
			}
			
			if (this.K == -1) {
				this.K = ~this.ub != -1 ? 1 : 0;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fc.A(" + var1 + ')');
		}
	}
	
	final void a(int var1, og var2) {
		try {
			while (true) {
				int var3 = var2.readUnsignedByte(255);
				if (var3 == 0) {
					++db;
					if (var1 != 45) {
						this.D = true;
						return;
					}
					
					return;
				}
				
				this.a(var3, var1 ^ -55, var2);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "fc.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void b(int var0, int var1, int var2) {
		int var7 = client.anInt_wb;
		
		try {
			ki[] var4 = ua.kis_a;
			int var5 = 0;
			if (var7 == 0 && var5 >= var4.length) {
				++gb;
			} else {
				do {
					ki var6 = var4[var5];
					if (var6 != null) {
						if (var6.f != 2 && var7 == 0) {
							++var5;
						} else {
							me.a(2 * var6.d, (-ic.entityYPosition + var6.e << 7) - -var6.j, var6.n + (-ic.entityXPosition + var6.g << 7), (byte) -85);
							if (bd.K > -1 && ~(bi.f % 20) > -11) {
								gg.u[var6.k].c(bd.K + var1 + -12, m.B + var0 + -28);
							}
							
							++var5;
						}
					} else {
						++var5;
					}
				} while (var5 < var4.length);
				
				++gb;
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "fc.F(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static int a(int var0, boolean var1) {
		try {
			if (var1) {
				d((byte) -121);
			}
			
			++Ab;
			return var0 >> 11 & 63;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fc.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void d(byte var0) {
		try {
			Cb = null;
			if (var0 != 115) {
				b(-21, -102, 31);
			}
			
			hint_mapmarkers = null;
			I = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "fc.D(" + var0 + ')');
		}
	}
	
	private cb c(int var1, int var2, int var3) {
		int var10 = client.anInt_wb;
		
		try {
			++tb;
			cb var4 = null;
			boolean var5 = this.H;
			if (var3 == 2 && ~var1 < -4) {
				var5 = !var5;
			}
			
			int var6;
			int var7;
			int var8;
			if (this.O == null) {
				if (var3 != 10) {
					return null;
				}
				
				if (this.bb == null) {
					return null;
				}
				
				var6 = this.bb.length;
				
				for (var7 = 0; ~var7 > ~var6; ++var7) {
					var8 = this.bb[var7];
					if (var5) {
						var8 += 65536;
					}
					
					var4 = (cb) jc.Z.a((long) var8, (byte) -87);
					if (var4 == null) {
						var4 = cb.a(li.cacheFile7, var8, 0);
						if (var4 == null) {
							return null;
						}
						
						if (var5) {
							var4.h();
						}
						
						jc.Z.a(var4, (byte) -73, (long) var8);
					}
					
					if (var6 > 1) {
						qi.t[var7] = var4;
					}
				}
				
				if (~var6 < -2) {
					var4 = new cb(qi.t, var6);
				}
			} else {
				var6 = -1;
				var7 = 0;
				if (var10 != 0 || ~var7 > ~this.O.length) {
					do {
						if (this.O[var7] == var3) {
							var6 = var7;
							if (var10 == 0) {
								break;
							}
						}
						
						++var7;
					} while (~var7 > ~this.O.length);
				}
				
				if (~var6 == 0) {
					return null;
				}
				
				var8 = this.bb[var6];
				if (var5) {
					var8 += 65536;
				}
				
				var4 = (cb) jc.Z.a((long) var8, (byte) 107);
				if (var4 == null) {
					var4 = cb.a(li.cacheFile7, var8, 0);
					if (var4 == null) {
						return null;
					}
					
					if (var5) {
						var4.h();
					}
					
					jc.Z.a(var4, (byte) -76, (long) var8);
				}
			}
			
			if (var2 != -24010) {
				this.a(99, (og) null);
			}
			
			boolean var12;
			label230:
			{
				if (~this.U != -129 || ~this.anInt_cb != -129 || this.X != 128) {
					var12 = true;
					if (var10 == 0) {
						break label230;
					}
				}
				
				var12 = false;
			}
			
			boolean var13;
			label177:
			{
				if (this.W == 0 && this.Fb == 0 && ~this.vb == -1) {
					var13 = false;
					if (var10 == 0) {
						break label177;
					}
				}
				
				var13 = true;
			}
			
			cb var14 = new cb(var4, var1 == 0 && !var12 && !var13, this.P == null, this.Ob == null, true);
			if (~var3 == -5 && var1 > 3) {
				var14.g(256);
				var14.c(45, 0, -45);
			}
			
			label220:
			{
				var1 &= 3;
				if (~var1 == -2) {
					var14.d();
					if (var10 == 0) {
						break label220;
					}
				}
				
				if (~var1 == -3) {
					var14.l();
					if (var10 == 0) {
						break label220;
					}
				}
				
				if (~var1 == -4) {
					var14.e();
				}
			}
			
			int var9;
			if (this.P != null) {
				var9 = 0;
				if (var10 != 0 || this.P.length > var9) {
					do {
						var14.b(this.P[var9], this.Db[var9]);
						++var9;
					} while (this.P.length > var9);
				}
			}
			
			if (this.Ob != null) {
				var9 = 0;
				if (var10 != 0 || ~this.Ob.length < ~var9) {
					do {
						var14.a(this.Ob[var9], this.mb[var9]);
						++var9;
					} while (~this.Ob.length < ~var9);
				}
			}
			
			if (var12) {
				var14.d(this.U, this.anInt_cb, this.X);
			}
			
			if (var13) {
				var14.c(this.W, this.Fb, this.vb);
			}
			
			return var14;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "fc.I(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final boolean g(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			++pb;
			if (var1 != -1) {
				this.rb = true;
			}
			
			if (this.J == null) {
				return this.Hb != -1 || this.nb != null;
			} else {
				int var2 = 0;
				if (var4 == 0 && var2 >= this.J.length) {
					return false;
				} else {
					do {
						if (this.J[var2] != -1) {
							fc var3 = rf.b(-14098, this.J[var2]);
							if (~var3.Hb != 0 || var3.nb != null) {
								return true;
							}
						}
						
						++var2;
					} while (var2 < this.J.length);
					
					return false;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "fc.N(" + var1 + ')');
		}
	}
	
	final qb a(int var1, int var2, int var3, int var4, int[][] var5, int var6, int var7, byte var8, ce var9) {
		try {
			if (var8 != 49) {
				return null;
			} else {
				long var10;
				label49:
				{
					++Lb;
					if (this.O == null) {
						var10 = (long) (var2 + (this.N << 10));
						if (client.anInt_wb == 0) {
							break label49;
						}
					}
					
					var10 = (long) ((this.N << 10) + ((var7 << 3) - -var2));
				}
				
				he var12 = (he) di.g.a(var10, (byte) -54);
				if (var12 == null) {
					cb var13 = this.c(var2, -24010, var7);
					if (var13 == null) {
						return null;
					}
					
					var12 = new he(var13, this.Rb + 64, 768 - -(this.Z * 5), -50, -10, -50);
					di.g.a(var12, (byte) -81, var10);
				}
				
				if (var9 != null) {
					var12 = (he) var9.a(var2, (byte) 85, var3, var12);
				}
				
				if (~this.Q <= -1) {
					if (var9 == null) {
						var12 = (he) var12.a(true);
					}
					
					var12 = var12.a(var5, var4, var6, var1, false, this.Q);
				}
				
				ib.b.E = var12;
				return ib.b;
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "fc.H(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean b(int var1, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			++Eb;
			if (var1 != -36) {
				this.F = 114;
			}
			
			if (this.O == null) {
				if (this.bb == null) {
					return true;
				} else if (~var2 != -11) {
					return true;
				} else {
					boolean var7 = true;
					int var4 = 0;
					if (var5 == 0 && this.bb.length <= var4) {
						return var7;
					} else {
						do {
							var7 &= li.cacheFile7.b((byte) 123, this.bb[var4], 0);
							++var4;
						} while (this.bb.length > var4);
						
						return var7;
					}
				}
			} else {
				int var3 = 0;
				if (var5 == 0 && this.O.length <= var3) {
					return true;
				} else {
					do {
						if (var2 == this.O[var3]) {
							return li.cacheFile7.b((byte) 126, this.bb[var3], 0);
						}
						
						++var3;
					} while (this.O.length > var3);
					
					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "fc.B(" + var1 + ',' + var2 + ')');
		}
	}
	
	final qb a(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int[][] var8) {
		int var14 = client.anInt_wb;
		
		try {
			long var9;
			label71:
			{
				++Nb;
				if (this.O == null) {
					var9 = (long) ((this.N << 10) + var4);
					if (var14 == 0) {
						break label71;
					}
				}
				
				var9 = (long) ((this.N << 10) + ((var2 << 3) - -var4));
			}
			
			boolean var11;
			label80:
			{
				if (!var3 || !this.T) {
					var11 = false;
					if (var14 == 0) {
						break label80;
					}
				}
				
				var11 = true;
				var9 |= Long.MIN_VALUE;
			}
			
			Object var12 = (aa) gi.x.a(var9, (byte) 112);
			if (var12 == null) {
				cb var13 = this.c(var4, -24010, var2);
				if (var13 == null) {
					ib.b.E = null;
					return ib.b;
				}
				
				label55:
				{
					var13.k();
					if (!var11) {
						var12 = new he(var13, 64 - -this.Rb, 768 + this.Z * 5, -50, -10, -50);
						if (var14 == 0) {
							break label55;
						}
					}
					
					var13.Z = (short) (64 + this.Rb);
					var12 = var13;
					var13.kb = (short) (5 * this.Z + 768);
					var13.i();
				}
				
				gi.x.a((rg) var12, (byte) -50, var9);
			}
			
			if (var11) {
				var12 = ((cb) var12).f();
			}
			
			if (~this.Q <= -1) {
				label48:
				{
					if (!(var12 instanceof he)) {
						if (!(var12 instanceof cb)) {
							break label48;
						}
						
						var12 = ((cb) var12).a(var8, var1, var5, var7, true, this.Q, false);
						if (var14 == 0) {
							break label48;
						}
					}
					
					var12 = ((he) var12).a(var8, var1, var5, var7, true, this.Q);
				}
			}
			
			if (var6 >= -2) {
				return null;
			} else {
				ib.b.E = (aa) var12;
				return ib.b;
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "fc.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ')');
		}
	}
	
	final fc e(byte var1) {
		try {
			++R;
			int var2 = -1;
			if (this.E != -1) {
				var2 = af.b(this.E, (int) -25);
			} else if (~this.zb != 0) {
				var2 = sa.c[this.zb];
			}
			
			return var1 != -3 ? null : (var2 >= 0 && var2 < this.J.length && this.J[var2] != -1 ? rf.b(var1 + -14095, this.J[var2]) : null);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fc.L(" + var1 + ')');
		}
	}
	
	public fc() {
		this.M = nf.ob;
		this.zb = -1;
		this.fb = 16;
		this.xb = 0;
		this.T = false;
		this.Gb = 1;
		this.kb = -1;
		this.sb = 0;
		this.ub = 2;
		this.W = 0;
		this.wb = new ob[5];
		this.Bb = 0;
		this.Fb = 0;
		this.Kb = -1;
		this.Rb = 0;
		this.Mb = 1;
		this.Ib = false;
		this.Hb = -1;
	}
}
