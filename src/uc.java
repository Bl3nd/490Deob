import java.awt.Component;

final class uc extends af {
	
	static int S;
	static pi T = new pi();
	static ob U = rf.a(40, "(U5");
	private short[] V = new short[257];
	static int W;
	private int[] X;
	static ob Y = rf.a(40, "Verbinde mit Server)3)3)3");
	static int Z;
	private int[][] ab;
	static int bb;
	private int[] cb;
	private int db = 0;
	static int eb;
	static int fb;
	static int gb;
	static int hb;
	static md ib;
	static int jb = 0;
	static ob kb = rf.a(40, "Neuer Benutzer");
	private static ob hasLoggedIn = rf.a(40, " has logged in)3");
	static int mb = -1;
	static volatile boolean nb = true;
	static ob hasLoggedIn2;
	static boolean pb = false;
	
	public uc() {
		super(1, true);
	}
	
	static lg a(int var0, boolean var1, int var2, Component component, t var4) {
		try {
			++gb;
			if (~ki.sampleRate == -1) {
				throw new IllegalStateException();
			} else if (~var0 <= -1 && ~var0 > -3) {
				if (var2 < 256) {
					var2 = 256;
				}
				
				try {
					lg var9 = (lg) Class.forName("pf").newInstance();
					var9.q = new int[256 * (!be.forceSend ? 1 : 2)];
					var9.G = var2;
					var9.a(component);
					var9.K = (var2 & -1024) + 1024;
					if (var9.K > 16384) {
						var9.K = 16384;
					}
					
					var9.c(var9.K);
					if (~e.anInt_a < -1 && l.p == null) {
						l.p = new oc();
						l.p.f = var4;
						var4.a(3360, e.anInt_a, l.p);
					}
					
					if (l.p != null) {
						if (l.p.i[var0] != null) {
							throw new IllegalArgumentException();
						}
						
						l.p.i[var0] = var9;
					}
					
					return var9;
				} catch (Throwable var7) {
					try {
						if (!var1) {
							return null;
						} else {
							bb var5 = new bb(var4, var0);
							var5.q = new int[(!be.forceSend ? 1 : 2) * 256];
							var5.G = var2;
							var5.a(component);
							var5.K = 16384;
							var5.c(var5.K);
							if (~e.anInt_a < -1 && l.p == null) {
								l.p = new oc();
								l.p.f = var4;
								var4.a(3360, e.anInt_a, l.p);
							}
							
							if (l.p != null) {
								if (l.p.i[var0] != null) {
									throw new IllegalArgumentException();
								}
								
								l.p.i[var0] = var5;
							}
							
							return var5;
						}
					} catch (Throwable var6) {
						return new lg();
					}
				}
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "uc.I(" + var0 + ',' + var1 + ',' + var2 + ',' + (component != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	private int[] c(int var1, int var2) {
		try {
			if (var1 > -57) {
				this.a(13, 107, (og) null);
			}
			
			++hb;
			return var2 < 0 ? this.X : (this.ab.length <= var2 ? this.cb : this.ab[var2]);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "uc.A(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void b(byte var1) {
		try {
			++S;
			int[] var2 = this.ab[0];
			int[] var3 = this.ab[1];
			int[] var5 = this.ab[this.ab.length + -1];
			int[] var4 = this.ab[this.ab.length + -2];
			this.X = new int[] {var2[0] - var3[0] + var2[0], var2[1] - -var2[1] - var3[1]};
			this.cb = new int[] {-var5[0] + var4[0] + var4[0], -var5[1] - (-var4[1] - var4[1])};
			if (var1 < 5) {
				this.a((byte) -118, 4);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "uc.D(" + var1 + ')');
		}
	}
	
	public static void c(byte var0) {
		try {
			U = null;
			int var1 = 50 % ((37 - var0) / 49);
			Y = null;
			ib = null;
			hasLoggedIn2 = null;
			hasLoggedIn = null;
			T = null;
			kb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "uc.C(" + var0 + ')');
		}
	}
	
	private void i(int var1) {
		int var21 = client.anInt_wb;
		
		try {
			int var2;
			label289:
			{
				int var3;
				int var4;
				int[] var5;
				int[] var6;
				int var7;
				int var8;
				int var9;
				label290:
				{
					var2 = this.db;
					int var10;
					if (var2 != 2) {
						if (var2 != 1) {
							break label290;
						}
						
						if (var21 == 0) {
							var2 = 0;
							if (var21 != 0 || ~var2 > -258) {
								do {
									var4 = var2 << 4;
									var3 = 1;
									if (var21 != 0 || var3 < this.ab.length + -1) {
										do {
											if (~this.ab[var3][0] < ~var4) {
												if (var21 == 0) {
													break;
												}
												
												++var3;
											} else {
												++var3;
											}
										} while (var3 < this.ab.length + -1);
									}
									
									var6 = this.ab[var3];
									var5 = this.ab[var3 - 1];
									var7 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
									var8 = 4096 - nf.Y[255 & var7 >> 5] >> 1;
									var9 = -var8 + 4096;
									var10 = var6[1] * var8 + var5[1] * var9 >> 12;
									if (~var10 >= 32767) {
										var10 = -32767;
									}
									
									if (var10 >= '耀') {
										var10 = 32767;
									}
									
									this.V[var2] = (short) var10;
									++var2;
								} while (~var2 > -258);
							}
							
							if (var21 == 0) {
								break label289;
							}
							break label290;
						}
					}
					
					var2 = 0;
					if (var21 == 0 && ~var2 <= -258) {
						if (var21 == 0) {
							break label289;
						}
						
						var2 = 0;
						if (var21 != 0 || ~var2 > -258) {
							do {
								var4 = var2 << 4;
								var3 = 1;
								if (var21 != 0 || var3 < this.ab.length + -1) {
									do {
										if (~this.ab[var3][0] < ~var4) {
											if (var21 == 0) {
												break;
											}
											
											++var3;
										} else {
											++var3;
										}
									} while (var3 < this.ab.length + -1);
								}
								
								var6 = this.ab[var3];
								var5 = this.ab[var3 - 1];
								var7 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
								var8 = 4096 - nf.Y[255 & var7 >> 5] >> 1;
								var9 = -var8 + 4096;
								var10 = var6[1] * var8 + var5[1] * var9 >> 12;
								if (~var10 >= 32767) {
									var10 = -32767;
								}
								
								if (var10 >= '耀') {
									var10 = 32767;
								}
								
								this.V[var2] = (short) var10;
								++var2;
							} while (~var2 > -258);
						}
						
						if (var21 == 0) {
							break label289;
						}
					} else {
						while (true) {
							var4 = var2 << 4;
							var3 = 1;
							int var11;
							int var12;
							int var13;
							int var14;
							int var15;
							int var17;
							int var18;
							int var19;
							int var20;
							if (var21 == 0 && ~var3 <= ~(-1 + this.ab.length)) {
								var6 = this.ab[var3];
								var5 = this.ab[var3 - 1];
								var7 = this.c(-81, -2 + var3)[1];
								var8 = var5[1];
								var9 = var6[1];
								var10 = this.c(-94, var3 + 1)[1];
								var11 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
								var13 = var8 + -var7 + -var9 + var10;
								var12 = var11 * var11 >> 12;
								var15 = var9 - var7;
								var14 = var7 - (var8 + var13);
								var17 = var12 * (var11 * var13 >> 12) >> 12;
								var18 = var14 * var12 >> 12;
								var19 = var15 * var11 >> 12;
								var20 = var8 + var19 + var18 + var17;
								if (var20 <= -32768) {
									var20 = -32767;
								}
								
								if (var20 >= '耀') {
									var20 = 32767;
								}
								
								this.V[var2] = (short) var20;
								++var2;
							} else {
								while (true) {
									if (var4 < this.ab[var3][0]) {
										if (var21 == 0) {
											var6 = this.ab[var3];
											var5 = this.ab[var3 - 1];
											var7 = this.c(-81, -2 + var3)[1];
											var8 = var5[1];
											var9 = var6[1];
											var10 = this.c(-94, var3 + 1)[1];
											var11 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
											var13 = var8 + -var7 + -var9 + var10;
											var12 = var11 * var11 >> 12;
											var15 = var9 - var7;
											var14 = var7 - (var8 + var13);
											var17 = var12 * (var11 * var13 >> 12) >> 12;
											var18 = var14 * var12 >> 12;
											var19 = var15 * var11 >> 12;
											var20 = var8 + var19 + var18 + var17;
											if (var20 <= -32768) {
												var20 = -32767;
											}
											
											if (var20 >= '耀') {
												var20 = 32767;
											}
											
											this.V[var2] = (short) var20;
											++var2;
											break;
										}
										
										++var3;
									} else {
										++var3;
									}
									
									if (~var3 <= ~(-1 + this.ab.length)) {
										var6 = this.ab[var3];
										var5 = this.ab[var3 - 1];
										var7 = this.c(-81, -2 + var3)[1];
										var8 = var5[1];
										var9 = var6[1];
										var10 = this.c(-94, var3 + 1)[1];
										var11 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
										var13 = var8 + -var7 + -var9 + var10;
										var12 = var11 * var11 >> 12;
										var15 = var9 - var7;
										var14 = var7 - (var8 + var13);
										var17 = var12 * (var11 * var13 >> 12) >> 12;
										var18 = var14 * var12 >> 12;
										var19 = var15 * var11 >> 12;
										var20 = var8 + var19 + var18 + var17;
										if (var20 <= -32768) {
											var20 = -32767;
										}
										
										if (var20 >= '耀') {
											var20 = 32767;
										}
										
										this.V[var2] = (short) var20;
										++var2;
										break;
									}
								}
							}
							
							if (~var2 <= -258) {
								if (var21 == 0) {
									break label289;
								}
								
								var2 = 0;
								if (var21 != 0 || ~var2 > -258) {
									do {
										var4 = var2 << 4;
										var3 = 1;
										if (var21 != 0 || var3 < this.ab.length + -1) {
											do {
												if (~this.ab[var3][0] < ~var4) {
													if (var21 == 0) {
														break;
													}
													
													++var3;
												} else {
													++var3;
												}
											} while (var3 < this.ab.length + -1);
										}
										
										var6 = this.ab[var3];
										var5 = this.ab[var3 - 1];
										var7 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
										var8 = 4096 - nf.Y[255 & var7 >> 5] >> 1;
										var9 = -var8 + 4096;
										var10 = var6[1] * var8 + var5[1] * var9 >> 12;
										if (~var10 >= 32767) {
											var10 = -32767;
										}
										
										if (var10 >= '耀') {
											var10 = 32767;
										}
										
										this.V[var2] = (short) var10;
										++var2;
									} while (~var2 > -258);
								}
								
								if (var21 == 0) {
									break label289;
								}
								break;
							}
						}
					}
				}
				
				var2 = 0;
				if (var21 != 0 || ~var2 > -258) {
					do {
						var4 = var2 << 4;
						var3 = 1;
						if (var21 != 0 || -1 + this.ab.length > var3) {
							do {
								if (~var4 > ~this.ab[var3][0]) {
									if (var21 == 0) {
										break;
									}
									
									++var3;
								} else {
									++var3;
								}
							} while (-1 + this.ab.length > var3);
						}
						
						var6 = this.ab[var3];
						var5 = this.ab[var3 - 1];
						var7 = (var4 - var5[0] << 12) / (var6[0] + -var5[0]);
						var8 = 4096 + -var7;
						var9 = var7 * var6[1] + var8 * var5[1] >> 12;
						if (~var9 >= 32767) {
							var9 = -32767;
						}
						
						if (~var9 <= -32769) {
							var9 = 32767;
						}
						
						this.V[var2] = (short) var9;
						++var2;
					} while (~var2 > -258);
				}
			}
			
			++eb;
			var2 = -4 % ((var1 - -17) / 46);
		} catch (RuntimeException var22) {
			throw bc.a(var22, "uc.H(" + var1 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			if (this.ab == null) {
				this.ab = new int[][] {new int[2], {4096, 4096}};
			}
			
			++W;
			if (this.ab.length < 2) {
				throw new RuntimeException("Curve operation requires at least two markers");
			} else {
				if (this.db == 2) {
					this.b((byte) 86);
				}
				
				fc.f(var1);
				this.i(41);
				if (var1 != 1) {
					T = null;
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "uc.L(" + var1 + ')');
		}
	}
	
	static void d(int var0, int var1, int var2) {
		cf.Y = true;
		ff.P = var0;
		da.Bb = var1;
		client.anInt_lb = var2;
		mb = -1;
		cf.R = -1;
	}
	
	final int[] a(byte var1, int var2) {
		int var7 = client.anInt_wb;
		
		try {
			++bb;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int[] var5 = this.c(var2, 0, 120);
				int var6 = 0;
				if (var7 != 0 || lh.eb > var6) {
					do {
						int var4 = var5[var6] >> 4;
						if (var4 < 0) {
							var4 = 0;
						}
						
						if (var4 > 256) {
							var4 = 256;
						}
						
						var3[var6] = this.V[var4];
						++var6;
					} while (lh.eb > var6);
				}
			}
			
			return var1 <= 13 ? null : var3;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "uc.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			int var4;
			if (var1 == 0) {
				this.db = var3.readUnsignedByte(255);
				this.ab = new int[var3.readUnsignedByte(255)][2];
				var4 = 0;
				if (var5 != 0 || ~var4 > ~this.ab.length) {
					do {
						this.ab[var4][0] = var3.readShort(104);
						this.ab[var4][1] = var3.readShort(91);
						++var4;
					} while (~var4 > ~this.ab.length);
				}
			}
			
			var4 = 15 / ((var2 - 66) / 57);
			++fb;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "uc.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		hasLoggedIn2 = hasLoggedIn;
		ib = new md(4096);
	}
}
