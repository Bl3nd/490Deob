final class ei extends rg {
	
	static ob D = rf.a(40, " steht bereits auf Ihrer Ignorieren)2Liste(Q");
	static int E;
	boolean F;
	private int G;
	int[] H;
	static int I;
	ob[] groundOption;
	int K;
	int L;
	static int M;
	int N;
	ob name;
	int[] P;
	static int Q;
	static int R;
	static int S;
	int T;
	private short[] V;
	private int W;
	int X;
	private int Y;
	private int Z;
	int ab;
	static int bb;
	private int anInt_cb;
	static int db;
	ob[] inventoryOption;
	private int fb;
	private int gb;
	private short[] hb;
	static int ib;
	int jb;
	private int kb;
	int lb;
	private short[] mb;
	static int anInt_nb;
	private int ob;
	static int pb;
	private short[] qb;
	private int rb;
	static int anInt_sb = 0;
	int tb;
	private int ub;
	static int vb;
	int wb;
	boolean xb;
	int yb;
	int zb;
	private int Ab;
	static int Bb;
	private int Cb;
	static int Db;
	static String Eb;
	private int Fb;
	int Gb;
	int Hb;
	private int Ib;
	private int Jb;
	static pe cacheFile2;
	
	static ai b(int var0, int var1) {
		try {
			++bb;
			ai var2 = (ai) ki.p.a((long) var0, (byte) -91);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = sb.cacheFile18.a((byte) 82, gh.b((byte) -104, var0), md.a((byte) -112, var0));
				var2 = new ai();
				var2.J = var0;
				if (var3 != null) {
					var2.a(new og(var3), 0);
				}
				
				var2.a(false);
				ki.p.a(var2, (byte) -16, (long) var0);
				if (var1 != 0) {
					f(13);
				}
				
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ei.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	final cb a(int var1, boolean var2) {
		int var8 = client.anInt_wb;
		
		try {
			++Db;
			int var3 = this.ub;
			int var4 = this.fb;
			if (var2) {
				var4 = this.anInt_cb;
				var3 = this.gb;
			}
			
			if (~var3 == 0) {
				return null;
			} else {
				cb var5 = cb.a(cc.cacheFile7, var3, var1);
				if (var4 != -1) {
					cb var6 = cb.a(cc.cacheFile7, var4, 0);
					cb[] var7 = new cb[] {var5, var6};
					var5 = new cb(var7, 2);
				}
				
				int var10;
				if (this.V != null) {
					var10 = 0;
					if (var8 != 0 || ~this.V.length < ~var10) {
						do {
							var5.b(this.V[var10], this.hb[var10]);
							++var10;
						} while (~this.V.length < ~var10);
					}
				}
				
				if (this.mb != null) {
					var10 = 0;
					if (var8 != 0 || ~this.mb.length < ~var10) {
						do {
							var5.a(this.mb[var10], this.qb[var10]);
							++var10;
						} while (~this.mb.length < ~var10);
					}
				}
				
				return var5;
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ei.P(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var10 = client.anInt_wb;
		
		try {
			if (~na.anInt_m <= ~var4 && var3 >= dd.a) {
				label118:
				{
					boolean var6;
					label110:
					{
						if (var5 >= gh.R) {
							if (~ng.u > ~var5) {
								var5 = ng.u;
								var6 = false;
								if (var10 == 0) {
									break label110;
								}
							}
							
							var6 = true;
							if (var10 == 0) {
								break label110;
							}
						}
						
						var6 = false;
						var5 = gh.R;
					}
					
					boolean var7;
					label119:
					{
						if (~var0 > ~gh.R) {
							var7 = false;
							var0 = gh.R;
							if (var10 == 0) {
								break label119;
							}
						}
						
						if (~ng.u > ~var0) {
							var0 = ng.u;
							var7 = false;
							if (var10 == 0) {
								break label119;
							}
						}
						
						var7 = true;
					}
					
					label94:
					{
						if (dd.a <= var4) {
							sa.a(var0, (byte) 52, var5, var2, e.ints_b[var4++]);
							if (var10 == 0) {
								break label94;
							}
						}
						
						var4 = dd.a;
					}
					
					label89:
					{
						if (var3 > na.anInt_m) {
							var3 = na.anInt_m;
							if (var10 == 0) {
								break label89;
							}
						}
						
						sa.a(var0, (byte) 52, var5, var2, e.ints_b[var3--]);
					}
					
					int var8;
					if (var6 && var7) {
						var8 = var4;
						if (var10 != 0 || ~var4 >= ~var3) {
							do {
								int[] var9 = e.ints_b[var8];
								var9[var5] = var9[var0] = var2;
								++var8;
							} while (~var8 >= ~var3);
						}
						
						if (var10 == 0) {
							break label118;
						}
					}
					
					if (!var6) {
						if (!var7) {
							break label118;
						}
						
						var8 = var4;
						if (var10 != 0) {
							e.ints_b[var4][var0] = var2;
							var8 = var4 + 1;
						}
						
						while (~var8 >= ~var3) {
							e.ints_b[var8][var0] = var2;
							++var8;
						}
						
						if (var10 == 0) {
							break label118;
						}
					}
					
					var8 = var4;
					if (var10 != 0 || var3 >= var4) {
						do {
							e.ints_b[var8][var5] = var2;
							++var8;
						} while (var3 >= var8);
					}
				}
			}
			
			++I;
			if (var1 != 1) {
				D = null;
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ei.O(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	private void a(og class_og, int unused, int input) {
		int dummy = client.anInt_wb;
		try {
			label261:
			{
				if (input != 1) {
					if (input == 2) {
						this.name = class_og.t(-19405);
					} else if (input != 4) {
						if (input != 5) {
							if (input != 6) {
								if (input != 7) {
									if (input == 8) {
										this.N = class_og.readShort(103);
										if (~this.N < -32768) {
											this.N -= 65536;
										}
									} else if (input != 11) {
										if (input == 12) {
											this.Gb = class_og.readInt(1029109968);
										} else if (input != 16) {
											if (input != 23) {
												if (input == 24) {
													this.W = class_og.readShort(87);
												} else if (input == 25) {
													this.zb = class_og.readShort(118);
													this.kb = class_og.readUnsignedByte(255);
												} else if (input != 26) {
													if (input < 30 || ~input <= -36) {
														if (input >= 35 && input < 40) {
															this.inventoryOption[-35 + input] = class_og.t(-19405);
														} else if (input == 40) {
															int var4;
															int var5;
															var4 = class_og.readUnsignedByte(255);
															this.V = new short[var4];
															this.hb = new short[var4];
															var5 = 0;
															if (~var5 > ~var4) {
																do {
																	this.V[var5] = (short) class_og.readShort(41);
																	this.hb[var5] = (short) class_og.readShort(87);
																	++var5;
																} while (~var5 > ~var4);
															}
														} else if (input != 41) {
															if (input == 65) {
																this.F = true;
															} else if (input != 78) {
																if (input != 79) {
																	if (input == 90) {
																		this.ub = class_og.readShort(119);
																	} else if (input != 91) {
																		if (input != 92) {
																			if (input == 93) {
																				this.anInt_cb = class_og.readShort(50);
																			} else if (input != 95) {
																				if (input != 97) {
																					if (input == 98) {
																						this.ab = class_og.readShort(127);
																					} else if (~input > -101 || input >= 110) {
																						if (input == 110) {
																							this.Jb = class_og.readShort(124);
																						} else if (input != 111) {
																							if (input == 112) {
																								this.Y = class_og.readShort(117);
																							} else if (input != 113) {
																								if (input != 114) {
																									if (input == 115) {
																										this.Hb = class_og.readUnsignedByte(255);
																									}
																								} else {
																									this.rb = 5 * class_og.readByte(1064893128);
																								}
																							} else {
																								this.Cb = class_og.readByte(1064893128);
																							}
																						} else {
																							this.Fb = class_og.readShort(117);
																						}
																					} else {
																						if (this.P == null) {
																							this.P = new int[10];
																							this.H = new int[10];
																						}
																						
																						this.P[-100 + input] = class_og.readShort(ph.a(-30, -117));
																						this.H[input + -100] = class_og.readShort(93);
																					}
																				} else {
																					this.T = class_og.readShort(121);
																				}
																			} else {
																				this.yb = class_og.readShort(69);
																			}
																		} else {
																			this.fb = class_og.readShort(102);
																		}
																	} else {
																		this.gb = class_og.readShort(99);
																	}
																} else {
																	this.Z = class_og.readShort(98);
																}
															} else {
																this.ob = class_og.readShort(35);
															}
														} else {
															int var4 = class_og.readUnsignedByte(255);
															this.qb = new short[var4];
															this.mb = new short[var4];
															int var5 = 0;
															if (~var5 > ~var4) {
																while (true) {
																	this.mb[var5] = (short) class_og.readShort(51);
																	this.qb[var5] = (short) class_og.readShort(71);
																	++var5;
																	if (~var5 <= ~var4) {
																		if (dummy == 0) {
																			break label261;
																		}
																		break;
																	}
																}
															}
														}
													} else {
														this.groundOption[-30 + input] = class_og.t(-19405);
														if (this.groundOption[-30 + input].b((byte) -108, ri.hidden2)) {
															this.groundOption[input + -30] = null;
														}
													}
												} else {
													this.G = class_og.readShort(61);
												}
											} else {
												this.K = class_og.readShort(60);
												this.Ab = class_og.readUnsignedByte(255);
											}
										} else {
											this.xb = true;
										}
									} else {
										this.X = 1;
									}
								} else {
									this.tb = class_og.readShort(94);
									if (~this.tb < -32768) {
										this.tb -= 65536;
									}
								}
							} else {
								this.lb = class_og.readShort(71);
							}
						} else {
							this.wb = class_og.readShort(86);
						}
					} else {
						this.L = class_og.readShort(28);
					}
				} else {
					this.Ib = class_og.readShort(75);
				}
			}
			
			++db;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ei.A(" + (class_og != null ? "{...}" : "null") + ',' + unused + ',' + input + ')');
		}
	}
	
	static void b(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		if (var3 != null) {
			var3.x = null;
		}
	}
	
	final fe a(int var1, ce var2, int var3, int var4) {
		int var8 = client.anInt_wb;
		
		try {
			++anInt_nb;
			int var6;
			if (this.P != null && ~var3 < -2) {
				int var5 = -1;
				var6 = 0;
				if (var8 != 0 || ~var6 > -11) {
					do {
						if (var3 >= this.H[var6] && ~this.H[var6] != -1) {
							var5 = this.P[var6];
						}
						
						++var6;
					} while (~var6 > -11);
				}
				
				if (var5 != -1) {
					return jg.a((byte) -61, var5).a(64, var2, 1, var4);
				}
			}
			
			fe var10 = (fe) df.t.a((long) this.jb, (byte) 106);
			if (var10 == null) {
				cb var11 = cb.a(cc.cacheFile7, this.Ib, 0);
				if (var11 == null) {
					return null;
				}
				
				int var7;
				if (this.V != null) {
					var7 = 0;
					if (var8 != 0 || ~this.V.length < ~var7) {
						do {
							var11.b(this.V[var7], this.hb[var7]);
							++var7;
						} while (~this.V.length < ~var7);
					}
				}
				
				if (this.mb != null) {
					var7 = 0;
					if (var8 != 0 || this.mb.length > var7) {
						do {
							var11.a(this.mb[var7], this.qb[var7]);
							++var7;
						} while (this.mb.length > var7);
					}
				}
				
				var10 = var11.b(this.Cb + 64, 768 - -this.rb, -50, -10, -50);
				if (~this.Jb != -129 || ~this.Fb != -129 || this.Y != 128) {
					var10.c(this.Jb, this.Fb, this.Y);
				}
				
				df.t.a(var10, (byte) -113, (long) this.jb);
			}
			
			var6 = 126 / ((-26 - var1) / 52);
			if (var2 != null) {
				var10 = var2.a(var10, var4, true);
			}
			
			return var10;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ei.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			Eb = null;
			D = null;
			cacheFile2 = null;
			if (var0 != 25473) {
				D = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ei.B(" + var0 + ')');
		}
	}
	
	static id a(int var0, pe var1, int clientScriptId) {
		try {
			++pb;
			byte[] var3 = var1.a(clientScriptId, -9587);
			if (var3 == null) {
				return null;
			} else {
				return new id(var3);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ei.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + clientScriptId + ')');
		}
	}
	
	final void a(int var1, ei var2, ei var3) {
		try {
			this.qb = var2.qb;
			++R;
			this.mb = var2.mb;
			this.hb = var2.hb;
			this.Gb = var3.Gb;
			this.Ib = var2.Ib;
			this.yb = var2.yb;
			this.name = var3.name;
			this.V = var2.V;
			this.L = var2.L;
			this.X = var1;
			this.N = var2.N;
			this.lb = var2.lb;
			this.xb = var3.xb;
			this.tb = var2.tb;
			this.wb = var2.wb;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ei.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final ei c(int var1, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			if (var2 >= -69) {
				this.Hb = -117;
			}
			
			++M;
			if (this.P != null && var1 > 1) {
				int var3 = -1;
				int var4 = 0;
				if (var5 != 0 || var4 < 10) {
					do {
						if (~this.H[var4] >= ~var1 && ~this.H[var4] != -1) {
							var3 = this.P[var4];
						}
						
						++var4;
					} while (var4 < 10);
				}
				
				if (~var3 != 0) {
					return jg.a((byte) -61, var3);
				}
			}
			
			return this;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ei.L(" + var1 + ',' + var2 + ')');
		}
	}
	
	final boolean a(boolean var1, boolean var2) {
		try {
			++S;
			if (var2) {
				return false;
			} else {
				int var4 = this.fb;
				int var3 = this.ub;
				if (var1) {
					var3 = this.gb;
					var4 = this.anInt_cb;
				}
				
				if (~var3 == 0) {
					return true;
				} else {
					boolean var5 = true;
					if (!cc.cacheFile7.b((byte) 44, var3, 0)) {
						var5 = false;
					}
					
					if (var4 != -1 && !cc.cacheFile7.b((byte) 106, var4, 0)) {
						var5 = false;
					}
					
					return var5;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ei.K(" + var1 + ',' + var2 + ')');
		}
	}
	
	final he g(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			cb var2 = cb.a(cc.cacheFile7, this.Ib, 0);
			++Q;
			if (var2 == null) {
				return null;
			} else {
				int var3;
				if (this.V != null) {
					var3 = 0;
					if (var4 != 0 || var3 < this.V.length) {
						do {
							var2.b(this.V[var3], this.hb[var3]);
							++var3;
						} while (var3 < this.V.length);
					}
				}
				
				if (this.mb != null) {
					var3 = 0;
					if (var4 != 0 || ~var3 > ~this.mb.length) {
						do {
							var2.a(this.mb[var3], this.qb[var3]);
							++var3;
						} while (~var3 > ~this.mb.length);
					}
				}
				
				he var6 = var2.a(this.Cb + 64, this.rb + 768, -50, -10, -50);
				var6.O = true;
				if (var1 != this.Jb || ~this.Fb != -129 || this.Y != 128) {
					var6.c(this.Jb, this.Fb, this.Y);
				}
				
				return var6;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ei.M(" + var1 + ')');
		}
	}
	
	final void a(og var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			++vb;
			if (var2 == -1) {
				do {
					int var3 = var1.readUnsignedByte(var2 ^ -256);
					if (var3 == 0) {
						break;
					}
					
					this.a(var1, -30, var3);
				} while (var4 == 0);
				
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ei.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final boolean b(boolean var1, boolean var2) {
		try {
			++ib;
			int var3 = this.K;
			int var5 = this.ob;
			int var4 = this.W;
			if (var1) {
				var5 = this.Z;
				var3 = this.zb;
				var4 = this.G;
			}
			
			if (~var3 == 0) {
				return true;
			} else {
				boolean var6 = var2;
				if (!cc.cacheFile7.b((byte) 94, var3, 0)) {
					var6 = false;
				}
				
				if (var4 != -1 && !cc.cacheFile7.b((byte) 48, var4, 0)) {
					var6 = false;
				}
				
				if (var5 != -1 && !cc.cacheFile7.b((byte) 47, var5, 0)) {
					var6 = false;
				}
				
				return var6;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ei.J(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void h(int var1) {
		try {
			if (var1 == 0) {
				++E;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ei.I(" + var1 + ')');
		}
	}
	
	final cb c(boolean var1, boolean var2) {
		int var10 = client.anInt_wb;
		
		try {
			if (!var1) {
				return null;
			} else {
				++Bb;
				int var3 = this.K;
				int var4 = this.W;
				int var5 = this.ob;
				if (var2) {
					var3 = this.zb;
					var4 = this.G;
					var5 = this.Z;
				}
				
				if (var3 == -1) {
					return null;
				} else {
					cb var6 = cb.a(cc.cacheFile7, var3, 0);
					if (~var4 != 0) {
						label66:
						{
							cb var7 = cb.a(cc.cacheFile7, var4, 0);
							if (var5 == -1) {
								cb[] var8 = new cb[] {var6, var7};
								var6 = new cb(var8, 2);
								if (var10 == 0) {
									break label66;
								}
							}
							
							cb var13 = cb.a(cc.cacheFile7, var5, 0);
							cb[] var9 = new cb[] {var6, var7, var13};
							var6 = new cb(var9, 3);
						}
					}
					
					if (!var2 && this.Ab != 0) {
						var6.c(0, this.Ab, 0);
					}
					
					if (var2 && this.kb != 0) {
						var6.c(0, this.kb, 0);
					}
					
					int var12;
					if (this.V != null) {
						var12 = 0;
						if (var10 != 0 || ~var12 > ~this.V.length) {
							do {
								var6.b(this.V[var12], this.hb[var12]);
								++var12;
							} while (~var12 > ~this.V.length);
						}
					}
					
					if (this.mb != null) {
						var12 = 0;
						if (var10 != 0 || ~var12 > ~this.mb.length) {
							do {
								var6.a(this.mb[var12], this.qb[var12]);
								++var12;
							} while (~var12 > ~this.mb.length);
						}
					}
					
					return var6;
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ei.N(" + var1 + ',' + var2 + ')');
		}
	}
	
	public ei() {
		this.groundOption = new ob[] {null, null, fi.take2, null, null};
		this.G = -1;
		this.X = 0;
		this.Y = 128;
		this.N = 0;
		this.inventoryOption = new ob[] {null, null, null, null, ta.drop2};
		this.Z = -1;
		this.ab = -1;
		this.gb = -1;
		this.name = pe.r;
		this.F = false;
		this.lb = 0;
		this.kb = 0;
		this.W = -1;
		this.rb = 0;
		this.T = -1;
		this.ub = -1;
		this.K = -1;
		this.ob = -1;
		this.tb = 0;
		this.Ab = 0;
		this.zb = -1;
		this.anInt_cb = -1;
		this.L = 2000;
		this.Gb = 1;
		this.Cb = 0;
		this.yb = 0;
		this.Fb = 128;
		this.fb = -1;
		this.xb = false;
		this.wb = 0;
		this.Hb = 0;
		this.Jb = 128;
	}
}
