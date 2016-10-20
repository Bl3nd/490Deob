final class b extends af {
	
	private int R = 0;
	private int S = 1;
	static int T;
	static ob chooseOption2;
	static kc V;
	static int W;
	private static ob chooseOption = rf.a(40, "Choose Option");
	static kc Y;
	static int Z;
	private int ab = 0;
	static int bb;
	static int cb;
	static int db;
	static int eb;
	static int[] fb;
	
	static void a(int i, int i1, int i2, ai ai, int i3) {
		int dummy = client.anInt_wb;
		
		try {
			++bb;
			if (si.S < 400) {
				if (ai.lb != null) {
					ai = ai.b((byte) 118);
				}
				
				if (ai != null) {
					if (ai.Q) {
						ob ob = ai.W;
						if (ai.kb != 0) {
							ob = wc.a(new ob[] {ob, qg.a(le.T.Cc, ai.kb, false), ue.db, bg.ob_c, hh.a((byte) 93, ai.kb), ji.G}, i1 ^ 3);
						}
						
						if (i1 == ~ch.cb) {
							ge.a(wc.a(new ob[] {s.R, ac.B, ob}, -3), fh.h, i1 ^ -2, (short) 14, (long) i2, i, i3);
							++lh.tb;
						} else {
							if (g.O) {
								if (~(lb.ub & 2) == -3) {
									++jf.ab;
									ge.a(wc.a(new ob[] {sf.g, ac.B, ob}, -3), ac.s, 0, (short) 32, (long) i2, i, i3);
								}
							} else {
								++qf.Q;
								ob[] obs = ai.H;
								if (hb.x) {
									obs = tf.a(true, obs);
								}
								
								int i4;
								if (obs != null) {
									i4 = 4;
									if (i4 >= 0) {
										do {
											if (obs[i4] != null && (~qa.F != -1 || !obs[i4].b((byte) -104, ch.attack2))) {
												++l.f;
												byte b = 0;
												if (i4 == 0) {
													b = 37;
												}
												
												if (i4 == 1) {
													b = 9;
												}
												
												if (~i4 == -3) {
													b = 24;
												}
												
												if (i4 == 3) {
													b = 11;
												}
												
												if (~i4 == -5) {
													b = 18;
												}
												
												ge.a(wc.a(new ob[] {bh.f, ob}, -3), obs[i4], 0, b, (long) i2, i, i3);
											}
											
											--i4;
										} while (i4 >= 0);
									}
								}
								
								if (qa.F == 0 && obs != null) {
									i4 = 4;
									if (i4 >= 0) {
										do {
											if (obs[i4] != null && obs[i4].b((byte) -123, ch.attack2)) {
												short s = 0;
												if (ai.kb > le.T.Cc) {
													s = 2000;
												}
												
												++nf.gb;
												short s2 = 0;
												if (i4 == 0) {
													s2 = 37;
												}
												
												if (~i4 == -2) {
													s2 = 9;
												}
												
												if (~i4 == -3) {
													s2 = 24;
												}
												
												if (~i4 == -4) {
													s2 = 11;
												}
												
												if (i4 == 4) {
													s2 = 18;
												}
												
												if (s2 != 0) {
													s2 += s;
												}
												
												ge.a(wc.a(new ob[] {bh.f, ob}, -3), obs[i4], 0, s2, (long) i2, i, i3);
											}
											
											--i4;
										} while (i4 >= 0);
									}
								}
								ge.a(wc.a(new ob[] {bh.f, ob}, i1 ^ 3), jg.c, i1 + 2, (short) 1002, (long) i2, i, i3);
							}
							
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "b.E(" + i + ',' + i1 + ',' + i2 + ',' + "{...}" + ',' + i3 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			fc.f(var1);
			++cb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "b.L(" + var1 + ')');
		}
	}
	
	public static void b(byte unused) {
		try {
			chooseOption2 = null;
			chooseOption = null;
			Y = null;
			fb = null;
			V = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "b.A(" + unused + ')');
		}
	}
	
	static void a(int i, int i1, int i2, int i3) {
		pd pd = nb.oc[i][i1][i2];
		if (pd != null) {
			fg fg = pd.r;
			if (fg != null) {
				fg.j = fg.j * i3 / 16;
				fg.i = fg.i * i3 / 16;
			}
		}
	}
	
	final void a(int input, int unused, og og) {
		int dummy = client.anInt_wb;
		
		try {
			label37:
			{
				if (input != 0) {
					if (input != 1) {
						if (input != 3) {
							break label37;
						}
					}
				} else {
					this.ab = og.readUnsignedByte(255);
				}
				
				this.R = og.readUnsignedByte(255);
				if (dummy == 0) {
					break label37;
				}
				
				this.S = og.readUnsignedByte(255);
			}
			
			++W;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "b.B(" + input + ',' + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			++Z;
			if (unused <= 13) {
				V = null;
			}
			
			int[] ints = super.nd_v.a(i, 12);
			if (super.nd_v.n) {
				int i1 = rh.r[i];
				int i2 = i1 - 2048 >> 1;
				int i3 = 0;
				if (~i3 > ~lh.eb) {
					do {
						int i4;
						int i5 = bd.J[i3];
						int i6 = i5 - 2048 >> 1;
						if (~this.ab == -1) {
							i4 = this.S * (i5 + -i1);
						} else {
							int i7 = i6 * i6 - -(i2 * i2) >> 12;
							i4 = (int) (4096.0D * Math.sqrt((double) ((float) i7 / 4096.0F)));
							i4 = (int) (3.141592653589793D * (double) (i4 * this.S));
						}
						
						i4 &= -4096;
						if (this.R == 0) {
							i4 = 4096 + rc.f[(4083 & i4) >> 4] >> 1;
							if (dummy == 0) {/*
								ints[i3] = i4;
								++i3;
								continue;
							*/
							}
						} else if (this.R == 2) {
							i4 -= 2048;
							if (i4 < 0) {
								i4 = -i4;
							}
							
							i4 = -i4 + 2048 << 1;
						}
						
						ints[i3] = i4;
						++i3;
					} while (~i3 > ~lh.eb);
				}
			}
			return ints;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "b.F(" + unused + ',' + i + ')');
		}
	}
	
	public b() {
		super(0, true);
	}
	
	static void a(byte[] bytes, byte unused) {
		int dummy = client.anInt_wb;
		
		try {
			++T;
			og og = new og(bytes);
			og.pointer = bytes.length + -2;
			th.X = og.readShort(84);
			ci.x = new int[th.X];
			ub.g = new int[th.X];
			le.db = new int[th.X];
			wg.V = new byte[th.X][];
			ci.A = new int[th.X];
			og.pointer = -(th.X * 8) + -7 + bytes.length;
			kd.S = og.readShort(119);
			tg.b = og.readShort(85);
			int i = 1 + (255 & og.readUnsignedByte(255));
			int i1 = 0;
			while (~th.X < ~i1) {
				ci.A[i1] = og.readShort(42);
				++i1;
			}
			int i2 = 0;
			while (th.X > i2) {
				ci.x[i2] = og.readShort(88);
				++i2;
			}
			
			int i3 = 0;
			if (th.X > i3) {
				do {
					ub.g[i3] = og.readShort(106);
					++i3;
				} while (th.X > i3);
			}
			
			int i4 = 0;
			while (~i4 > ~th.X) {
				le.db[i4] = og.readShort(63);
				++i4;
			}
			
			og.pointer = bytes.length - 7 - th.X * 8 - (-3 + 3 * i);
			be.h = new int[i];
			int i5 = 1;
			if (i > i5) {
				do {
					be.h[i5] = og.readUnsignedMedInt(-124);
					if (be.h[i5] == 0) {
						be.h[i5] = 1;
					}
					
					++i5;
				} while (i > i5);
			}
			
			og.pointer = 0;
			int i6 = 0;
			if (~th.X < ~i6) {
				do {
					int i7 = ub.g[i6];
					int i8 = le.db[i6];
					int i9 = i8 * i7;
					byte[] bytes1 = new byte[i9];
					wg.V[i6] = bytes1;
					int i10 = og.readUnsignedByte(255);
					int i11;
					if (i10 != 0) {
						if (i10 != 1) {
							++i6;
							continue;
						}
						
						i11 = 0;
						int i12;
						if (i11 < i7) {
							i12 = 0;
							while (true) {
								while (i8 > i12) {
									bytes1[i7 * i12 + i11] = og.readByte(1064893128);
									++i12;
								}
								
								++i11;
								if (i11 >= i7) {
									break;
								}
								
								i12 = 0;
							}
						}
						
						if (dummy == 0) {
							++i6;
							continue;
						}
						
						i11 = 0;
					} else {
						i11 = 0;
					}
					
					while (i11 < i9) {
						bytes1[i11] = og.readByte(1064893128);
						++i11;
					}
					
					++i6;
				} while (~th.X < ~i6);
				
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "b.C(" + (bytes != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static {
		chooseOption2 = chooseOption;
		eb = 0;
		fb = new int[2000];
	}
}
