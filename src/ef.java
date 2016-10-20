final class ef extends af {
	
	static hi[] R = new hi[4];
	static int S;
	private int[] T = new int[3];
	private static ob U = rf.a(40, "slide:");
	static boolean V = false;
	static long W = 0L;
	private int X = 409;
	static ob Y;
	static int Z;
	static fa[] ab;
	static ob bb = rf.a(40, "Spieler");
	private int cb = 4096;
	private int db = 4096;
	static ob eb = rf.a(40, "Benutzername: ");
	static ob ob_fb;
	static int[] gb = new int[] {0, 1, 2, 3};
	static int hb;
	static boolean members;
	static int jb;
	private int kb = 4096;
	static int[] ints_lb = new int[] {768, 1024, 1280, 512, 1536, 256, 0, 1792};
	static int mb;
	static int anInt_nb;
	
	static void a(byte unused, ob class_ob) {
		try {
			++S;
			int var2;
			if (~aa.F <= -3) {
				int var4;
				if (class_ob.b((byte) -57, vb.gcCommand)) {
					var2 = 0;
					while (true) {
						if (~var2 <= -11) {
							Runtime runtime = Runtime.getRuntime();
							int memory = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
							nb.a(0, (byte) -105, null, wc.a(new ob[] {da.qb, hh.a((byte) 93, memory), fh.i}, -3));
							break;
						}

						System.gc();
						++var2;
					}
				} else if (class_ob.b((byte) -87, ji.clientDropCommand)) {
					ac.dropClient(25005);
				} else if (class_ob.b((byte) -58, df.fpsonCommand)) {
					lg.displayFPS = true;
				} else if (class_ob.b((byte) -56, gf.fpsoffCommand)) {
					lg.displayFPS = false;
				}
				
				class_ob.b((byte) -74, kh.autoshadowOnCommand);
				class_ob.b((byte) -83, ah.autoshadowoffCommand);
				if (class_ob.b((byte) -86, ae.noclipCommand)) {
					var2 = 0;
					if (~var2 > -5) {
						do {
							int var7 = 1;
							if (~var7 > -104) {
								do {
									var4 = 1;
									if (~var4 > -104) {
										do {
											R[var2].i[var7][var4] = 0;
											++var4;
										} while (~var4 > -104);
									}
									
									++var7;
								} while (~var7 > -104);
							}
							
							++var2;
						} while (~var2 > -5);
					}
				} else if (class_ob.a(-93, gh.fpsCommand) && qa.l != 0) {
					ge.b(class_ob.a((byte) 75, 6).f(10), -12885);
				} else if (class_ob.b((byte) -84, tb.errortestCommand) && qa.l == 2) {
					throw new RuntimeException();
				} else if (class_ob.a(-76, ed.rect_debugCommand)) {
					rg.anInt_v = class_ob.a((byte) 87, 12).d(38).f(10);
					nb.a(0, (byte) -125, null, wc.a(new ob[] {dh.rect_debug, hh.a((byte) 93, rg.anInt_v)}, -3));
				} else if (class_ob.b((byte) -78, de.qa_op_testCommand)) {
					jh.j = true;
				}
			}
			
			++pi.r;
			af.P.p(123, 12885);
			af.P.writeByte(125, -1 + class_ob.a(false));
			af.P.writeString(class_ob.a((byte) 107, 2), (byte) -80);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ef.E(" + unused + ',' + (class_ob != null ? "{...}" : "null") + ')');
		}
	}
	
	static void i(int var0) {
		int var11 = client.anInt_wb;
		
		try {
			++mb;
			int var1 = le.anInt_fb;
			int var2 = th.bb;
			int var3 = ud.Zb;
			int var4 = hi.k;
			int var5 = 6116423;
			oi.d(var1, var2, var3, var4, var5);
			oi.d(var1 + 1, 1 + var2, -2 + var3, 16, 0);
			oi.a(1 + var1, 18 + var2, var3 - 2, var4 + -19, 0);
			if (var0 != 31970) {
				a((byte) 47, (ob) null);
			}
			
			ia.Y.a(b.chooseOption2, var1 - -3, var2 - -14, var5, -1);
			int var6 = og.o;
			int var7 = re.u;
			int var8 = 0;
			if (var11 == 0 && ~var8 <= ~si.S) {
				rc.a(false, hi.k, ud.Zb, le.anInt_fb, th.bb);
			} else {
				do {
					int var10 = 16777215;
					int var9 = 31 + (var2 - -(15 * (si.S - (1 + var8))));
					if (~var6 < ~var1 && ~var6 > ~(var3 + var1) && ~(-13 + var9) > ~var7 && ~(var9 + 3) < ~var7) {
						var10 = 16776960;
					}
					
					ia.Y.a(ee.a(var8, (byte) 8), 3 + var1, var9, var10, 0);
					++var8;
				} while (~var8 > ~si.S);
				
				rc.a(false, hi.k, ud.Zb, le.anInt_fb, th.bb);
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ef.A(" + var0 + ')');
		}
	}
	
	public ef() {
		super(1, false);
	}
	
	final int[][] b(int var1, byte var2) {
		int var17 = client.anInt_wb;
		
		try {
			++hb;
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[][] var5 = this.b(var1, -110, 0);
				int[] var6 = var5[0];
				int[] var7 = var5[1];
				int[] var8 = var5[2];
				int[] var11 = var3[2];
				int[] var9 = var3[0];
				int[] var10 = var3[1];
				int var12 = 0;
				int var13;
				int var14;
				if (var17 != 0) {
					var14 = var6[var12];
					var13 = var14 + -this.T[0];
					if (var13 < 0) {
						var13 = -var13;
					}
				} else {
					if (~lh.eb >= ~var12) {
						return var3;
					}
					
					var14 = var6[var12];
					var13 = var14 + -this.T[0];
					if (var13 < 0) {
						var13 = -var13;
					}
				}
				
				while (true) {
					label88:
					{
						int var15;
						if (~var13 < ~this.X) {
							var9[var12] = var14;
							var10[var12] = var7[var12];
							var11[var12] = var8[var12];
							if (var17 == 0) {
								++var12;
								break label88;
							}
							
							var15 = var7[var12];
							var13 = -this.T[1] + var15;
							if (~var13 > -1) {
								var13 = -var13;
							}
						} else {
							var15 = var7[var12];
							var13 = -this.T[1] + var15;
							if (~var13 > -1) {
								var13 = -var13;
							}
						}
						
						int var16;
						if (~this.X > ~var13) {
							var9[var12] = var14;
							var10[var12] = var15;
							var11[var12] = var8[var12];
							if (var17 == 0) {
								++var12;
								break label88;
							}
							
							var16 = var8[var12];
							var13 = -this.T[2] + var16;
							if (var13 < 0) {
								var13 = -var13;
							}
						} else {
							var16 = var8[var12];
							var13 = -this.T[2] + var16;
							if (var13 < 0) {
								var13 = -var13;
							}
						}
						
						if (this.X < var13) {
							var9[var12] = var14;
							var10[var12] = var15;
							var11[var12] = var16;
							if (var17 != 0) {
								var9[var12] = var14 * this.db >> 12;
								var10[var12] = this.kb * var15 >> 12;
								var11[var12] = this.cb * var16 >> 12;
								++var12;
							} else {
								++var12;
							}
						} else {
							var9[var12] = var14 * this.db >> 12;
							var10[var12] = this.kb * var15 >> 12;
							var11[var12] = this.cb * var16 >> 12;
							++var12;
						}
					}
					
					if (~lh.eb >= ~var12) {
						break;
					}
					
					var14 = var6[var12];
					var13 = var14 + -this.T[0];
					if (var13 < 0) {
						var13 = -var13;
					}
				}
			}
			
			return var3;
		} catch (RuntimeException var18) {
			throw bc.a(var18, "ef.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			Y = null;
			ob_fb = null;
			bb = null;
			U = null;
			gb = null;
			ab = null;
			if (var0 == 85) {
				R = null;
				eb = null;
				ints_lb = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ef.C(" + var0 + ')');
		}
	}
	
	static fa a(int var0, byte var1, pe var2, int var3) {
		try {
			++anInt_nb;
			if (!fb.a(-101, var3, var2, var0)) {
				return null;
			} else {
				return lf.a(false);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ef.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var6 = client.anInt_wb;
		
		try {
			int var4;
			label51:
			{
				label50:
				{
					label49:
					{
						label48:
						{
							label47:
							{
								++Z;
								if (~var1 != -1) {
									if (~var1 == -2) {
										break label47;
									}
									
									if (var1 == 2) {
										break label48;
									}
									
									if (var1 == 3) {
										break label49;
									}
									
									if (~var1 != -5) {
										break label51;
									}
									
									if (var6 == 0) {
										break label50;
									}
								}
								
								this.X = var3.readShort(33);
								if (var6 == 0) {
									break label51;
								}
							}
							
							this.cb = var3.readShort(84);
							if (var6 == 0) {
								break label51;
							}
						}
						
						this.kb = var3.readShort(62);
						if (var6 == 0) {
							break label51;
						}
					}
					
					this.db = var3.readShort(58);
					if (var6 == 0) {
						break label51;
					}
				}
				
				var4 = var3.readUnsignedMedInt(-1);
				this.T[0] = bd.b(16711680, var4) << 4;
				this.T[2] = bd.b(0, (int) (var4 >> 12));
				this.T[1] = bd.b(var4 >> 4, (int) 4080);
			}
			
			var4 = 86 % ((var2 - 66) / 57);
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ef.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(na var0, int var1) {
		try {
			++jb;
			if (var1 == 3) {
				if (qe.k == 1) {
					short var2 = 280;
					if (~var2 >= ~ia.eb && ~(14 + var2) <= ~ia.eb && ~tf.m <= -5 && ~tf.m >= -19) {
						a.a(0, -24129, 0);
						return;
					}
					
					if (15 + var2 <= ia.eb && ~(var2 + 80) <= ~ia.eb && tf.m >= 4 && tf.m <= 18) {
						a.a(0, -24129, 1);
						return;
					}
					
					short var3 = 390;
					if (~var3 >= ~ia.eb && ~ia.eb >= ~(var3 - -14) && tf.m >= 4 && tf.m <= 18) {
						a.a(1, -24129, 0);
						return;
					}
					
					if (15 + var3 <= ia.eb && 80 + var3 >= ia.eb && tf.m >= 4 && ~tf.m >= -19) {
						a.a(1, -24129, 1);
						return;
					}
					
					short var4 = 500;
					if (~ia.eb <= ~var4 && ~(14 + var4) <= ~ia.eb && tf.m >= 4 && ~tf.m >= -19) {
						a.a(2, -24129, 0);
						return;
					}
					
					if (~(var4 - -15) >= ~ia.eb && ~ia.eb >= ~(var4 + 80) && ~tf.m <= -5 && tf.m <= 18) {
						a.a(2, -24129, 1);
						return;
					}
					
					short var5 = 610;
					if (~var5 >= ~ia.eb && ~(var5 - -14) <= ~ia.eb && tf.m >= 4 && ~tf.m >= -19) {
						a.a(3, -24129, 0);
						return;
					}
					
					if (ia.eb >= 15 + var5 && ia.eb <= var5 + 80 && ~tf.m <= -5 && tf.m <= 18) {
						a.a(3, -24129, 1);
						return;
					}
					
					if (~ia.eb <= -709 && tf.m >= 4 && ia.eb <= 758 && ~tf.m >= -21) {
						ih.v = false;
						kh.H.b(0, 0);
						og.s.b(382, 0);
						q.Y.b(382 + -(q.Y.Q / 2), 18);
						return;
					}
					
					if (nc.i != -1) {
						cd var6 = ea.ab[nc.i];
						if (var6.d != !li.members) {
							byte[] var10 = wc.a(new ob[] {var6.l, ae.runescapeCom}, var1 + -6).getBytes((int) -35);
							ei.Eb = new String(var10, 0, var10.length);
							ih.v = false;
							rd.P = var6.k;
							if (~qa.l != -1) {
								qa.l = 0;
								r.Y = 443;
								qe.s = 'ꩊ';
								gi.w = 'ꩊ';
							}
							
							kh.H.b(0, 0);
							og.s.b(382, 0);
							q.Y.b(-(q.Y.Q / 2) + 382, 18);
							return;
						}
						
						ob var7 = wc.a(new ob[] {tb.q, var6.l, ae.runescapeCom, lb.db, da.yb, hh.a((byte) 93, ag.forceSend ? 1 : 0), li.i, hh.a((byte) 93, oc.g), wf.c, hh.a((byte) 93, client.anInt_tb)}, -3);
						
						try {
							var0.getAppletContext().showDocument(var7.e((byte) -54), "_self");
						} catch (Exception var8) {
							var8.printStackTrace();
						}
					}
				}
				
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ef.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static {
		ob_fb = U;
		Y = U;
	}
}
