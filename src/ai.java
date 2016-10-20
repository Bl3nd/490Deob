import java.io.IOException;

final class ai extends rg {
	
	private int[] D;
	private int E = 0;
	int F = -1;
	static int G;
	ob[] H = new ob[5];
	static int I;
	int J;
	private int K = 0;
	static int L;
	static nb[] M = new nb[32768];
	short N = 0;
	private int[] O;
	static int P;
	boolean Q = true;
	static int R = 0;
	private short[] S;
	private int T;
	boolean U;
	private int V = -1;
	ob W;
	static int X;
	private int Y;
	static pe cacheFile1;
	boolean ab = true;
	static int bb;
	static int anInt_cb;
	private short[] db;
	static ob cabbage = rf.a(40, "Cabbage");
	int fb = -1;
	int gb = -1;
	boolean hb;
	int ib = -1;
	private int jb;
	int kb;
	int[] lb;
	int mb;
	private short[] nb;
	static ob mapscene = rf.a(40, "mapscene");
	static int pb;
	static int qb;
	static int rb;
	int sb;
	int tb;
	static int ub;
	static int vb;
	static int wb = 0;
	short xb;
	static pe cacheFile20;
	int zb;
	int Ab;
	private short[] Bb;
	int Cb;
	
	final ai b(byte unused) {
		try {
			++pb;
			int i = -1;
			if (this.V == -1) {
				if (this.Y == -1) {
					i = sa.c[this.Y];
				}
			} else {
				i = af.b(this.V, -29);
			}
			return ~i <= -1 && i < this.lb.length && this.lb[i] != -1 ? ei.b(this.lb[i], 0) : null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ai.G(" + unused + ')');
		}
	}
	
	private void a(og og, int unused, int i) {
		unused = 1;
		int dummy = client.anInt_wb;
		
		try {
			label260:
			{
				int var4;
				int var5;
				if (i == unused) {
					var4 = og.readUnsignedByte(unused + 254);
					this.O = new int[var4];
					var5 = 0;
					if (/*dummy != 0 || */var4 > var5) {
						do {
							this.O[var5] = og.readShort(121);
							++var5;
						} while (var4 > var5);
					}
				} else if (i != 2) {
					if (i != 12) {
						if (i != 13) {
							if (i == 14) {
								this.ib = og.readShort(114);
							} else if (i == 15) {
								this.Ab = og.readShort(55);
							} else if (i == 16) {
								this.gb = og.readShort(59);
							} else if (i != 17) {
								if (i < 30 || ~i <= -36) {
									if (i != 40) {
										if (i != 41) {
											if (i == 60) {
												var4 = og.readUnsignedByte(unused + 254);
												this.D = new int[var4];
												var5 = 0;
												/*if (dummy != 0) {
													this.D[var5] = og.q(29);
													++var5;
												}*/
												
												while (true) {
													if (~var5 <= ~var4) {
														break;
													}
													
													this.D[var5] = og.readShort(29);
													++var5;
												}
											} else if (i == 93) {
												this.hb = false;
											} else if (i != 95) {
												if (i == 97) {
													this.jb = og.readShort(unused ^ 63);
												} else if (i == 98) {
													this.T = og.readShort(unused + 36);
												} else if (i == 99) {
													this.U = true;
												} else if (i != 100) {
													if (i == 101) {
														this.E = 5 * og.readByte(1064893128);
													} else if (i != 102) {
														if (i != 103) {
															if (i == 106) {
																this.V = og.readShort(76);
																if (this.V == '\uffff') {
																	this.V = -1;
																}
																
																this.Y = og.readShort(unused ^ 85);
																if (~this.Y == -65536) {
																	this.Y = -1;
																}
																
																var4 = og.readUnsignedByte(255);
																this.lb = new int[var4 - -1];
																var5 = 0;
																if (~var4 <= ~var5) {
																	while (true) {
																		this.lb[var5] = og.readShort(unused + 113);
																		if (~this.lb[var5] == -65536) {
																			this.lb[var5] = -1;
																		}
																		
																		++var5;
																		if (~var4 > ~var5) {
																			break;
																		}
																	}
																}
															} else if (i != 107) {
																if (i == 109) {
																	this.ab = false;
																} else if (i == 111) {
																	break label260;
																} else if (i != 113) {
																	if (i != 114) {
																		if (i != 115) {
																			break label260;
																		}
																		
																		this.N = (short) (4 * og.readUnsignedByte(255));
																		this.xb = (short) (4 * og.readUnsignedByte(255));
																	} else {
																		og.readByte(1064893128);
																		og.readByte(unused + 1064893127);
																	}
																} else {
																	og.readShort(68);
																	og.readShort(63);
																}
															} else {
																this.Q = false;
															}
														} else {
															this.Cb = og.readShort(43);
														}
													} else {
														this.mb = og.readShort(50);
													}
												} else {
													this.K = og.readByte(1064893128);
												}
											} else {
												this.kb = og.readShort(104);
											}
										} else {
											var4 = og.readUnsignedByte(255);
											this.Bb = new short[var4];
											this.S = new short[var4];
											var5 = 0;
											if (var4 > var5) {
												while (true) {
													this.Bb[var5] = (short) og.readShort(62);
													this.S[var5] = (short) og.readShort(33);
													++var5;
													if (var4 <= var5) {
														break;
													}
												}
											}
										}
									} else {
										var4 = og.readUnsignedByte(255);
										this.nb = new short[var4];
										this.db = new short[var4];
										var5 = 0;
										if (var4 > var5) {
											do {
												this.db[var5] = (short) og.readShort(35);
												this.nb[var5] = (short) og.readShort(36);
												++var5;
											} while (var4 > var5);
										}
									}
								} else {
									this.H[-30 + i] = og.t(unused + -19406);
									if (!this.H[-30 + i].b((byte) -81, ri.hidden2)) {
										break label260;
									}
									
									this.H[i - 30] = null;
								}
							} else {
								this.ib = og.readShort(unused + 122);
								this.zb = og.readShort(68);
								this.F = og.readShort(94);
								this.fb = og.readShort(117);
							}
						} else {
							this.sb = og.readShort(89);
						}
					} else {
						this.tb = og.readUnsignedByte(255);
					}
				} else {
					this.W = og.t(-19405);
				}
			}
			++X;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ai.E(" + (og != null ? "{...}" : "null") + ',' + unused + ',' + i + ')');
		}
	}
	
	final fe a(int unused, int i, ce ce) {
		int dummy = client.anInt_wb;
		
		try {
			++rb;
			if (this.lb != null) {
				ai ai = this.b((byte) 123);
				return ai == null ? null : ai.a(122, i, ce);
			} else if (this.D == null) {
				return null;
			} else {
				fe fe = (fe) ue.jb.a((long) this.J, (byte) -58);
				if (fe == null) {
					boolean flag = false;
					int i1 = 0;
					if (~i1 > ~this.D.length) {
						do {
							if (!sh.cacheFile7.b((byte) 75, this.D[i1], 0)) {
								flag = true;
							}
							
							++i1;
						} while (~i1 > ~this.D.length);
					}
					
					if (flag) {
						return null;
					}
					
					cb[] cbs = new cb[this.D.length];
					int i2 = 0;
					if (~this.D.length < ~i2) {
						do {
							cbs[i2] = cb.a(sh.cacheFile7, this.D[i2], 0);
							++i2;
						} while (~this.D.length < ~i2);
					}
					
					cb cb;
					if (~cbs.length == -2) {
						cb = cbs[0];
					} else {
						cb = new cb(cbs, cbs.length);
					}
					int i3;
					if (this.db != null) {
						i3 = 0;
						if (~i3 > ~this.db.length) {
							do {
								cb.b(this.db[i3], this.nb[i3]);
								++i3;
							} while (~i3 > ~this.db.length);
						}
					}
					
					if (this.Bb != null) {
						i3 = 0;
						if (this.Bb.length > i3) {
							do {
								cb.a(this.Bb[i3], this.S[i3]);
								++i3;
							} while (this.Bb.length > i3);
						}
					}
					
					fe = cb.b(64, 768, -50, -10, -50);
					ue.jb.a(fe, (byte) -90, (long) this.J);
				}
				
				if (ce != null) {
					fe = ce.a(fe, i, true);
				}
				
				return fe;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ai.C(" + unused + ',' + i + ',' + (ce != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(boolean unused) {
		try {
			++bb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ai.I(" + unused + ')');
		}
	}
	
	final boolean f(int unused) {
		try {
			++I;
			if (this.lb == null) {
				return true;
			} else {
				int i = -1;
				if (~this.V == 0) {
					if (this.Y == -1) {
						i = sa.c[this.Y];
						//return i >= 0 && ~this.lb.length < ~i && this.lb[i] != -1;
					}
				} else {
					i = af.b(this.V, -106);
				}
				return i >= 0 && ~this.lb.length < ~i && this.lb[i] != -1;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ai.J(" + unused + ')');
		}
	}
	
	final fe a(boolean flag, int i, ce ce, ce ce1, int i1) {
		int dummy = client.anInt_wb;
		
		try {
			++G;
			if (this.lb != null) {
				ai ai = this.b((byte) 122);
				return ai == null ? null : ai.a(true, i, ce, ce1, i1);
			} else {
				fe fe = (fe) qg.j.a((long) this.J, (byte) -10);
				if (fe == null) {
					boolean flag2 = false;
					int var8 = 0;
					if (~var8 > ~this.O.length) {
						do {
							if (!sh.cacheFile7.b((byte) 97, this.O[var8], 0)) {
								flag2 = true;
							}
							
							++var8;
						} while (~var8 > ~this.O.length);
					}
					
					if (flag2) {
						return null;
					}
					
					cb[] cbs = new cb[this.O.length];
					int i2 = 0;
					if (~this.O.length < ~i2) {
						do {
							cbs[i2] = cb.a(sh.cacheFile7, this.O[i2], 0);
							++i2;
						} while (~this.O.length < ~i2);
					}
					
					cb cb;
					if (cbs.length == 1) {
						cb = cbs[0];
					} else {
						cb = new cb(cbs, cbs.length);
					}
					int i3;
					if (this.db != null) {
						i3 = 0;
						if (~i3 > ~this.db.length) {
							do {
								cb.b(this.db[i3], this.nb[i3]);
								++i3;
							} while (~i3 > ~this.db.length);
						}
					}
					
					if (this.Bb != null) {
						i3 = 0;
						if (i3 < this.Bb.length) {
							do {
								cb.a(this.Bb[i3], this.S[i3]);
								++i3;
							} while (i3 < this.Bb.length);
						}
					}
					
					fe = cb.b(this.K + 64, this.E + 850, -30, -50, -30);
					qg.j.a(fe, (byte) -46, (long) this.J);
				}
				
				if (!flag) {
					this.mb = -84;
				}
				
				fe fe1;
				if (ce != null && ce1 != null) {
					fe1 = ce.a(fe, -18112, ce1, i, i1);
				} else if (ce == null) {
					if (ce1 != null) {
						fe1 = ce1.a(fe, i, -125);
					} else {
						fe1 = fe.a(true);
					}
				} else {
					fe1 = ce.a(fe, i1, -7);
				}
				if (~this.jb != -129 || this.T != 128) {
					fe1.c(this.jb, this.T, this.jb);
				}
				
				return fe1;
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "ai.K(" + flag + ',' + i + ',' + (ce != null ? "{...}" : "null") + ',' + (ce1 != null ? "{...}" : "null") + ',' + i1 + ')');
		}
	}
	
	final void a(og og, int unused) {
		int dummy = client.anInt_wb;
		
		try {
			do {
				int i = og.readUnsignedByte(255);
				if (i == 0) {
					break;
				}
				
				this.a(og, 1, i);
			} while (dummy == 0);
			
			++L;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ai.H(" + (og != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	public static void g(int unused) {
		try {
			M = null;
			cacheFile1 = null;
			mapscene = null;
			cacheFile20 = null;
			cabbage = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ai.D(" + unused + ')');
		}
	}
	
	static int a(int i, int i1, byte unused) {
		try {
			int var3;
			var3 = ac.a(4, '넵' + i1, i + 91923, (byte) 97)
					+ (-128 + (ac.a(2, 10294 + i1, i + '鎽', (byte) 97) - 128 >> 1))
					+ (ac.a(1, i1, i, (byte) 97) - 128 >> 2);
			var3 = (int) (0.3D * (double) var3) + 35;
			if (var3 >= 10) {
				if (~var3 < -61) {
					var3 = 60;
				}
			} else {
				var3 = 10;
			}
			
			++ub;
			return var3;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ai.F(" + i + ',' + i1 + ',' + unused + ')');
		}
	}
	
	static void a(int unused, boolean flag) {
		try {
			++P;
			li.c(-5);
			++fh.anInt_e;
			if (unused >= -102) {
				g(105);
			}
			
			if (~fh.anInt_e <= -51 || flag) {
				fh.anInt_e = 0;
				if (!gf.x && ch.W != null) {
					af.P.p(33, 12885);
					System.err.println(af.P.pointer);
					try {
						ch.W.a(39, af.P.buffer, af.P.pointer, 0);
						af.P.pointer = 0;
					} catch (IOException e) {
						gf.x = true;
						e.printStackTrace();
					}
					
					++me.p;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ai.B(" + unused + ',' + flag + ')');
		}
	}
	
	static int getTitleScreenCount(int unused) {
		try {
			++qb;
			return 6;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ai.A(" + unused + ')');
		}
	}
	
	public ai() {
		this.W = od.Y;
		this.jb = 128;
		this.hb = true;
		this.kb = -1;
		this.sb = -1;
		this.tb = 1;
		this.Ab = -1;
		this.T = 128;
		this.mb = -1;
		this.xb = 0;
		this.U = false;
		this.Cb = 32;
		this.zb = -1;
		this.Y = -1;
	}
}
