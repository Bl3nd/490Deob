import java.util.Random;

final class lh extends af {
	
	private int R = 81;
	static int S;
	private int T = 1024;
	static byte U;
	static int V = 0;
	static ob W = rf.a(40, "(U3");
	static int X;
	private int Y = 0;
	static int Z;
	private int[][] ab;
	static int bb;
	private int cb = 4;
	private int db = 8;
	static int eb;
	private int[][] fb;
	private int gb;
	static int hb;
	private int ib = 204;
	private int jb = 1024;
	private int kb;
	static int lb;
	static ob m_string = rf.a(40, "m");
	static int anInt_nb;
	private int[] ob;
	static int pb;
	private int qb = 409;
	private int rb;
	static int sb;
	static int tb;
	static kc ub;
	
	static ob a(byte var0, og var1, int var2) {
		try {
			++lb;
			
			try {
				if (var0 != 66) {
					W = null;
				}
				
				ob var3 = new ob();
				var3.length = var1.r(-2);
				if (var3.length > var2) {
					var3.length = var2;
				}
				
				var3.buffer = new byte[var3.length];
				var1.pointer += mg.h.a(3, 0, var3.buffer, var1.pointer, var1.buffer, var3.length);
				return var3;
			} catch (Exception var4) {
				return ai.cabbage;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "lh.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var17 = client.anInt_wb;
		
		try {
			if (var1 <= 13) {
				return null;
			} else {
				++X;
				int[] var3 = super.nd_v.a(var2, 12);
				if (super.nd_v.n) {
					int var7 = 0;
					int var9 = rh.r[var2] - -this.Y;
					if (var17 != 0) {
						var9 += 4096;
					}
					
					while (~var9 > -1) {
						var9 += 4096;
					}
					
					if (var17 != 0) {
						var9 -= 4096;
					}
					
					while (~var9 < -4097) {
						var9 -= 4096;
					}
					
					if (var17 != 0 || this.db > var7) {
						while (var9 >= this.ob[var7]) {
							++var7;
							if (this.db <= var7) {
								break;
							}
						}
					}
					
					int var11 = var7 - 1;
					int var15 = this.ob[var7];
					boolean var12 = (1 & var7) == 0;
					int var16 = this.ob[var7 - 1];
					if (this.gb + var16 < var9 && var9 < -this.gb + var15) {
						int var4 = 0;
						if (var17 != 0 || eb > var4) {
							do {
								int var6 = 0;
								int var5 = !var12 ? -this.T : this.T;
								int var8 = (this.rb * var5 >> 12) + bd.J[var4];
								if (var17 != 0) {
									var8 += 4096;
								}
								
								while (var8 < 0) {
									var8 += 4096;
								}
								
								if (var17 != 0) {
									var8 -= 4096;
								}
								
								while (~var8 < -4097) {
									var8 -= 4096;
								}
								
								if (var17 != 0 || ~this.cb < ~var6) {
									while (this.fb[var11][var6] <= var8) {
										++var6;
										if (~this.cb >= ~var6) {
											break;
										}
									}
								}
								
								int var14 = this.fb[var11][var6];
								int var10 = -1 + var6;
								int var13 = this.fb[var11][var10];
								if (this.gb + var13 < var8 && -this.gb + var14 > var8) {
									var3[var4] = this.ab[var11][var10];
									if (var17 == 0) {
										++var4;
										continue;
									}
								}
								
								var3[var4] = 0;
								++var4;
							} while (eb > var4);
						}
						
						if (var17 == 0) {
							return var3;
						}
					}
					
					p.a(var3, 0, eb, 0);
				}
				
				return var3;
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "lh.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void b(boolean var0) {
		int var4 = client.anInt_wb;
		
		try {
			if (var0) {
				int var1 = -1;
				if (var4 == 0 && se.b <= var1) {
					++hb;
				} else {
					do {
						int var2;
						if (var1 == -1) {
							var2 = 2047;
							if (var4 != 0) {
								var2 = si.cb[var1];
							}
						} else {
							var2 = si.cb[var1];
						}
						
						dg var3 = lg.j[var2];
						if (var3 != null) {
							ke.a(var3, 1, 13184);
						}
						
						++var1;
					} while (se.b > var1);
					
					++hb;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "lh.C(" + var0 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			if (var1 == 1) {
				this.c((byte) -12);
				++pb;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lh.L(" + var1 + ')');
		}
	}
	
	static void c(int var0, int var1) {
		int var19 = client.anInt_wb;
		
		try {
			++Z;
			int[] var2 = ki.h.pixels;
			int var3 = var2.length;
			int var4 = 0;
			if (var19 != 0) {
				var2[var4] = 1;
				++var4;
			}
			
			while (var4 < var3) {
				var2[var4] = 1;
				++var4;
			}
			
			int var5 = 1;
			if (var1 == -4) {
				int var6;
				int var7;
				for (; var5 < 103; ++var5) {
					var6 = ('츀' - 512 * var5) * 4 + 24628;
					var7 = 1;
					if (var19 != 0 || ~var7 > -104) {
						do {
							if ((24 & qe.r[var0][var7][var5]) == 0) {
								cf.a(var2, var6, 512, var0, var7, var5);
							}
							
							if (~var0 > -4 && ~(qe.r[var0 + 1][var7][var5] & 8) != -1) {
								cf.a(var2, var6, 512, 1 + var0, var7, var5);
							}
							
							var6 += 4;
							++var7;
						} while (~var7 > -104);
					}
				}
				
				var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - -(-10 + (int) (Math.random() * 20.0D) + 238 << 8) - (-238 - (int) (Math.random() * 20.0D)) + -10;
				ki.h.f();
				var7 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
				int var8 = 1;
				int var9;
				if (var19 != 0 || ~var8 > -104) {
					do {
						var9 = 1;
						if (var19 != 0 || ~var9 > -104) {
							do {
								if (~(qe.r[var0][var9][var8] & 24) == -1) {
									a.a(var6, var7, var9, var0, var8, -108);
								}
								
								if (~var0 > -4 && (8 & qe.r[var0 - -1][var9][var8]) != 0) {
									a.a(var6, var7, var9, var0 - -1, var8, -100);
								}
								
								++var9;
							} while (~var9 > -104);
						}
						
						++var8;
					} while (~var8 > -104);
				}
				
				ii.z = 0;
				var9 = 0;
				if (var19 == 0 && var9 >= 104) {
					wb.V.a((int) -5);
				} else {
					do {
						int var10 = 0;
						if (var19 != 0 || ~var10 > -105) {
							do {
								long var11 = rh.a(gf.G, var9, var10);
								if (var11 != 0L) {
									int var13 = rf.b(-14098, (int) (var11 >>> 32) & Integer.MAX_VALUE).Kb;
									if (var13 < 0) {
										++var10;
									} else {
										int var15 = var10;
										int var14 = var9;
										if (~var13 != -23 && ~var13 != -30 && var13 != 34 && ~var13 != -37 && var13 != 46 && var13 != 47 && ~var13 != -49) {
											int[][] var16 = ef.R[gf.G].i;
											int var17 = 0;
											if (var19 != 0 || var17 < 10) {
												do {
													int var18 = (int) (Math.random() * 4.0D);
													if (~var18 == -1 && var14 > 0 && var14 > var9 - 3 && (var16[-1 + var14][var15] & 19661064) == 0) {
														--var14;
													}
													
													if (var18 == 1 && ~var14 > -104 && ~var14 > ~(3 + var9) && ~(19661184 & var16[1 + var14][var15]) == -1) {
														++var14;
													}
													
													if (var18 == 2 && ~var15 < -1 && var10 - 3 < var15 && ~(19661058 & var16[var14][-1 + var15]) == -1) {
														--var15;
													}
													
													if (var18 == 3 && ~var15 > -104 && ~var15 > ~(var10 - -3) && ~(19661088 & var16[var14][var15 - -1]) == -1) {
														++var15;
													}
													
													++var17;
												} while (var17 < 10);
											}
										}
										
										jh.a[ii.z] = ca.lb[var13];
										jc.bb[ii.z] = var14;
										wc.F[ii.z] = var15;
										++ii.z;
										++var10;
									}
								} else {
									++var10;
								}
							} while (~var10 > -105);
						}
						
						++var9;
					} while (var9 < 104);
					
					wb.V.a((int) -5);
				}
			}
		} catch (RuntimeException var20) {
			throw bc.a(var20, "lh.K(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void i(int var0) {
		int var11 = client.anInt_wb;
		
		try {
			++sb;
			if (og.ub == null) {
				if (gf.u == null) {
					int var2 = -69 % ((-77 - var0) / 35);
					int var1 = qe.k;
					int var4;
					int var5;
					if (le.X) {
						int var13;
						if (var1 != 1) {
							var4 = re.u;
							var13 = og.o;
							if (-10 + le.anInt_fb > var13 || ~var13 < ~(10 + ud.Zb + le.anInt_fb) || th.bb - 10 > var4 || 10 + th.bb + hi.k < var4) {
								le.X = false;
								od.a(th.bb, le.anInt_fb, ud.Zb, hi.k, 2);
							}
						}
						
						if (~var1 != -2) {
							return;
						}
						
						var13 = le.anInt_fb;
						var5 = ud.Zb;
						int var14 = ia.eb;
						var4 = th.bb;
						int var7 = tf.m;
						int var8 = -1;
						int var9 = 0;
						if (/*var11 != 0 || */~si.S < ~var9) {
							do {
								int var10 = var4 + (31 - -((si.S + -1 - var9) * 15));
								if (var14 > var13 && ~(var5 + var13) < ~var14 && var7 > -13 + var10 && ~var7 > ~(var10 + 3)) {
									var8 = var9;
								}
								
								++var9;
							} while (~si.S < ~var9);
						}
						
						if (var8 != -1) {
							hf.a(var8, (byte) -37);
						}
						
						le.X = false;
						od.a(th.bb, le.anInt_fb, ud.Zb, hi.k, 2);
					} else {
						if (var1 == 1 && ~si.S < -1) {
							short var3 = ph.i[si.S + -1];
							if (var3 == 49 || ~var3 == -8 || var3 == 8 || var3 == 33 || ~var3 == -5 || ~var3 == -11 || var3 == 31 || ~var3 == -2 || var3 == 28 || ~var3 == -59 || ~var3 == -4 || var3 == 1001) {
								var5 = nd.i[-1 + si.S];
								var4 = ae.Rb[-1 + si.S];
								ra var6 = tc.b(var5, (int) -79);
								if (sh.a(8, ce.a(var6, 18125)) || se.a(ce.a(var6, 18125), (byte) 84)) {
									bd.I = 0;
									wa.p = false;
									if (og.ub != null) {
										dg.a(og.ub, -107);
									}
									
									og.ub = tc.b(var5, (int) -62);
									ee.m = ia.eb;
									re.G = var4;
									id.s = tf.m;
									dg.a(og.ub, -125);
									return;
								}
							}
						}
						
						if (var1 == 1 && (og.db == 1 && si.S > 2 || fg.a(si.S + -1, 0))) {
							var1 = 2;
						}
						
						if (var1 == 1 && ~si.S < -1) {
							hf.a(si.S + -1, (byte) -37);
						}
						
						if (var1 == 2 && si.S > 0) {
							bf.j(765);
							return;
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "lh.A(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, aa var4, aa var5, int var6, int var7, int var8, int var9, long var10) {
		if (var4 != null) {
			fg var12 = new fg();
			var12.m = var10;
			var12.c = var1 * 128 + 64;
			var12.p = var2 * 128 + 64;
			var12.r = var3;
			var12.o = var4;
			var12.s = var5;
			var12.q = var6;
			var12.a = var7;
			var12.j = var8;
			var12.i = var9;
			
			for (int var13 = var0; var13 >= 0; --var13) {
				if (nb.oc[var13][var1][var2] == null) {
					nb.oc[var13][var1][var2] = new pd(var13, var1, var2);
				}
			}
			
			nb.oc[var0][var1][var2].r = var12;
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var6 = client.anInt_wb;
		
		try {
			label72:
			{
				label71:
				{
					label70:
					{
						label69:
						{
							label68:
							{
								label67:
								{
									label66:
									{
										label65:
										{
											if (~var1 != -1) {
												if (~var1 == -2) {
													break label65;
												}
												
												if (var1 == 2) {
													break label66;
												}
												
												if (var1 == 3) {
													break label67;
												}
												
												if (~var1 == -5) {
													break label68;
												}
												
												if (var1 == 5) {
													break label69;
												}
												
												if (var1 == 6) {
													break label70;
												}
												
												if (var1 != 7) {
													break label72;
												}
												
												if (var6 == 0) {
													break label71;
												}
											}
											
											this.cb = var3.readUnsignedByte(255);
											if (var6 == 0) {
												break label72;
											}
										}
										
										this.db = var3.readUnsignedByte(255);
										if (var6 == 0) {
											break label72;
										}
									}
									
									this.qb = var3.readShort(28);
									if (var6 == 0) {
										break label72;
									}
								}
								
								this.ib = var3.readShort(107);
								if (var6 == 0) {
									break label72;
								}
							}
							
							this.T = var3.readShort(91);
							if (var6 == 0) {
								break label72;
							}
						}
						
						this.Y = var3.readShort(72);
						if (var6 == 0) {
							break label72;
						}
					}
					
					this.R = var3.readShort(44);
					if (var6 == 0) {
						break label72;
					}
				}
				
				this.jb = var3.readShort(95);
			}
			
			++S;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "lh.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			W = null;
			m_string = null;
			if (var0 != -115) {
				V = 31;
			}
			
			ub = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lh.I(" + var0 + ')');
		}
	}
	
	static int a(int var0, int var1, byte var2) {
		try {
			ng var3 = (ng) jg.a.a((long) var1, 22346);
			++anInt_nb;
			return var3 == null ? 0 : (var0 >= 0 && ~var0 > ~var3.y.length ? (var2 < 32 ? 14 : var3.y[var0]) : 0);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "lh.E(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	public lh() {
		super(0, true);
	}
	
	private void c(byte var1) {
		int var9 = client.anInt_wb;
		
		try {
			++bb;
			Random var2 = new Random((long) this.db);
			this.rb = 4096 / this.cb;
			this.fb = new int[this.db][this.cb - -1];
			int var3 = this.rb / 2;
			this.ab = new int[this.db][this.cb];
			if (var1 <= -1) {
				this.kb = 4096 / this.db;
				this.gb = this.R / 2;
				int var4 = this.kb / 2;
				this.ob = new int[this.db + 1];
				this.ob[0] = 0;
				int var5 = 0;
				if (var9 == 0 && ~this.db >= ~var5) {
					this.ob[this.db] = 4096;
				} else {
					do {
						int var6;
						int var7;
						if (~var5 < -1) {
							var6 = this.kb;
							var7 = (-2048 + v.a((byte) 95, var2, 4096)) * this.ib >> 12;
							var6 += var7 * var4 >> 12;
							this.ob[var5] = var6 + this.ob[var5 + -1];
						}
						
						this.fb[var5][0] = 0;
						var6 = 0;
						if (var9 != 0 || ~var6 > ~this.cb) {
							do {
								if (~var6 < -1) {
									var7 = this.rb;
									int var8 = (-2048 + v.a((byte) 119, var2, 4096)) * this.qb >> 12;
									var7 += var8 * var3 >> 12;
									this.fb[var5][var6] = this.fb[var5][-1 + var6] - -var7;
								}
								
								this.ab[var5][var6] = ~this.jb >= -1 ? 4096 : -v.a((byte) 88, var2, this.jb) + 4096;
								++var6;
							} while (~var6 > ~this.cb);
						}
						
						this.fb[var5][this.cb] = 4096;
						++var5;
					} while (~this.db < ~var5);
					
					this.ob[this.db] = 4096;
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "lh.D(" + var1 + ')');
		}
	}
}
