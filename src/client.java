import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

public final class client extends na {
	
	static int P;
	private static ob Q = rf.a(40, "OFF");
	static int R;
	static ob S;
	static ob T;
	static int U;
	static ob[] V;
	static int W;
	private static ob X;
	static int Y;
	private static ob Z = rf.a(40, "flash1:");
	static int anInt_ab;
	static ob ob_bb;
	static int anInt_cb;
	static boolean aBoolean_db;
	static int anInt_eb;
	static int anInt_fb;
	static int anInt_gb;
	static ob ob_hb;
	static int anInt_ib;
	static int anInt_jb;
	static ob ob_kb;
	static int anInt_lb;
	static int anInt_mb;
	static int anInt_nb;
	static int anInt_ob;
	static int anInt_pb;
	static volatile int anInt_qb;
	static lg lg_rb;
	static ob ob_sb;
	static int anInt_tb;
	static int anInt_ub;
	static int anInt_vb;
	public static int anInt_wb;
	
	private static fa[] a(pe cacheFile8, ob class_ob, int unused, ob class_ob2) {
		try {
			++anInt_eb;
			int id = cacheFile8.a((byte) -121, class_ob);
			int i1 = cacheFile8.a(id, true, class_ob2);
			return pa.a(id, cacheFile8, i1, 865);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "client.K(" + (cacheFile8 != null ? "{...}" : "null") + ',' + (class_ob != null ? "{...}" : "null") + ',' + unused + ',' + (class_ob2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void f(int var0) {
		try {
			if (var0 > -92) {
				f(-3);
			}
			
			++P;
			int var1 = 64 + 128 * ca.Fb;
			int var2 = hf.anInt_g * 128 + 64;
			int var3 = ug.a(gf.G, var1, (byte) 40, var2) + -sb.gb;
			if (ri.b < var1) {
				ri.b += ke.pb - -(ja.r * (var1 + -ri.b) / 1000);
				if (~ri.b < ~var1) {
					ri.b = var1;
				}
			}
			
			if (ri.b > var1) {
				ri.b -= ja.r * (ri.b - var1) / 1000 + ke.pb;
				if (var1 > ri.b) {
					ri.b = var1;
				}
			}
			
			if (var2 > se.d) {
				se.d += ke.pb + ja.r * (var2 + -se.d) / 1000;
				if (se.d > var2) {
					se.d = var2;
				}
			}
			
			var1 = vb.N * 128 - -64;
			if (~se.d < ~var2) {
				se.d -= ja.r * (-var2 + se.d) / 1000 + ke.pb;
				if (~se.d > ~var2) {
					se.d = var2;
				}
			}
			
			if (~tb.b > ~var3) {
				tb.b += ke.pb + (-tb.b + var3) * ja.r / 1000;
				if (tb.b > var3) {
					tb.b = var3;
				}
			}
			
			var2 = qg.m * 128 - -64;
			if (var3 < tb.b) {
				tb.b -= ja.r * (tb.b - var3) / 1000 + ke.pb;
				if (var3 > tb.b) {
					tb.b = var3;
				}
			}
			
			var3 = ug.a(gf.G, var1, (byte) 40, var2) - qc.E;
			int var5 = -tb.b + var3;
			int var4 = var1 - ri.b;
			int var6 = var2 - se.d;
			int var7 = (int) Math.sqrt((double) (var4 * var4 - -(var6 * var6)));
			int var8 = (int) (Math.atan2((double) var5, (double) var7) * 325.949D) & 2047;
			if (~var8 > -129) {
				var8 = 128;
			}
			
			if (~var8 < -384) {
				var8 = 383;
			}
			
			int var9 = 2047 & (int) (Math.atan2((double) var4, (double) var6) * -325.949D);
			int var10 = -rf.x + var9;
			if (var8 > bh.l) {
				bh.l += (-bh.l + var8) * fi.d / 1000 + me.b;
				if (~var8 > ~bh.l) {
					bh.l = var8;
				}
			}
			
			if (var10 > 1024) {
				var10 -= 2048;
			}
			
			if (~var10 > 1023) {
				var10 += 2048;
			}
			
			if (~bh.l < ~var8) {
				bh.l -= fi.d * (-var8 + bh.l) / 1000 + me.b;
				if (var8 > bh.l) {
					bh.l = var8;
				}
			}
			
			if (~var10 < -1) {
				rf.x += me.b + fi.d * var10 / 1000;
				rf.x &= 2047;
			}
			
			if (var10 < 0) {
				rf.x -= fi.d * -var10 / 1000 + me.b;
				rf.x &= 2047;
			}
			
			int var11 = -rf.x + var9;
			if (~var11 < -1025) {
				var11 -= 2048;
			}
			
			if (var11 < -1024) {
				var11 += 2048;
			}
			
			if (~var11 > -1 && var10 > 0 || var11 > 0 && var10 < 0) {
				rf.x = var9;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "client.J(" + var0 + ')');
		}
	}
	
	final void a(int var1) {
		int var3 = anInt_wb;
		
		try {
			++bi.f;
			++anInt_gb;
			if (~(bi.f % 1000) == -2) {
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				bc.V = 600 * gregorianCalendar.get(11) + (10 * gregorianCalendar.get(12) - -(gregorianCalendar.get(13) / 6));
				wd.k.setSeed((long) bc.V);
			}
			
			this.h(var1 ^ -943);
			ug.d((byte) 106);
			bc.i(0);
			li.c(-5);
			if (var1 != 70) {
				S = null;
			}
			
			ri.a(false);
			pg.c(false);
			if (rf.z != null) {
				ce.hb = rf.z.e(var1 ^ 45);
			}
			
			{
				if (qb.gameState != 0) {
					if (~qb.gameState != -6) {
						if (qb.gameState != 10) {
							if (qb.gameState != 20) {
								if (~qb.gameState == -26) {
									n.a(false);
									if (var3 == 0) {
									}
								}
							} else {
								gi.a((byte) 28, this);
								le.i(333485964);
								if (var3 == 0) {
								}
							}
						} else {
							gi.a((byte) 28, this);
						}
					} else {
						gi.a((byte) 28, this);
						this.i(-21939);
						qa.b(48);
						if (var3 == 0) {
						}
					}
				} else {
					this.i(-21939);
					qa.b(var1 + -3);
				}
			}
			
			if (qb.gameState != 30) {
				if (~qb.gameState == -41) {
					le.i(333485964);
				}
			} else {
				li.a(var1 + -149);
			}
			
		} catch (RuntimeException var4) {
			throw bc.a(var4, "client.F(" + var1 + ')');
		}
	}
	
	private void g(int var1) {
		try {
			++anInt_ib;
			if (~b.eb <= -5) {
				this.a(-82, "js5crc");
				qb.gameState = 1000;
			} else {
				if (~dg.nc <= -5) {
					if (~qb.gameState >= -6) {
						this.a(-92, "js5io");
						qb.gameState = 1000;
						return;
					}
					
					dg.nc = 3;
					og.fb = 3000;
				}
				
				if (~(og.fb--) >= -1) {
					
					try {
						if (aa.M == 0) {
							af.O = gi.y.a(ei.Eb, qe.s, -89);
							++aa.M;
						}
						
						if (~aa.M == -2) {
							if (af.O.d == 2) {
								this.a(-1, (byte) -65);
								return;
							}
							
							if (~af.O.d == -2) {
								++aa.M;
							}
						}
						
						if (aa.M == 2) {
							tf.ph_o = new ph((Socket) af.O.e, gi.y);
							og var3 = new og(5);
							var3.writeByte(127, 15);
							var3.writeInt(490, (byte) -121);
							tf.ph_o.a(39, var3.buffer, 5, 0);
							++aa.M;
							fi.aLong_a = a.a((byte) -75);
						}
						
						if (aa.M == 3) {
							if (qb.gameState > 5 && tf.ph_o.available(0) <= 0) {
								if (~(-fi.aLong_a + a.a((byte) -47)) < -30001L) {
									this.a(-2, (byte) -65);
									return;
								}
							} else {
								int var6 = tf.ph_o.read(-119);
								if (var6 != 0) {
									this.a(var6, (byte) -65);
									return;
								}
								
								++aa.M;
							}
						}
						
						if (aa.M == 4) {
							c.a(tf.ph_o, ~qb.gameState < -21, (byte) 40);
							tf.ph_o = null;
							ai.R = 0;
							aa.M = 0;
							af.O = null;
						}
					} catch (IOException var4) {
						this.a(-3, (byte) -65);
					}
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "client.G(" + var1 + ')');
		}
	}
	
	private void a(int var1, byte var2) {
		try {
			++U;
			if (var2 != -65) {
				ob_sb = null;
			}
			
			label48:
			{
				aa.M = 0;
				tf.ph_o = null;
				++ai.R;
				af.O = null;
				if (~qe.s == ~gi.w) {
					qe.s = r.Y;
					if (anInt_wb == 0) {
						break label48;
					}
				}
				
				qe.s = gi.w;
			}
			
			if (ai.R >= 2 && (var1 == 7 || ~var1 == -10)) {
				if (qb.gameState > 5) {
					og.fb = 3000;
				} else {
					this.a(97, "js5connect_full");
					qb.gameState = 1000;
				}
			} else if (~ai.R <= -3 && ~var1 == -7) {
				this.a(-114, "js5connect_outofdate");
				qb.gameState = 1000;
			} else if (~ai.R <= -5) {
				if (qb.gameState > 5) {
					og.fb = 3000;
				} else {
					this.a(var2 ^ -12, "js5connect");
					qb.gameState = 1000;
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "client.O(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void b(boolean var1) {
		int var5 = anInt_wb;
		
		try {
			boolean var2 = q.i(75);
			if (var2 && li.aBoolean_q && lg_rb != null) {
				lg_rb.a((byte) -47);
			}
			
			++anInt_ab;
			if (bg.j) {
				ea.a(-751, rg.canvas_t);
				fi.a((byte) 98, rg.canvas_t);
				if (rf.z != null) {
					rf.z.a(rg.canvas_t, 15929);
				}
				
				this.a(!var1);
				mg.a(0, rg.canvas_t);
				ba.a(rg.canvas_t, -111);
				if (rf.z != null) {
					rf.z.a(rg.canvas_t, (byte) -55);
				}
			}
			
			{
				if (qb.gameState != 0) {
					if (qb.gameState != 5) {
						if (qb.gameState == 10) {
							pe.a(ia.Y, -127, qf.H);
						} else if (qb.gameState == 20) {
							pe.a(ia.Y, -122, qf.H);
						} else if (qb.gameState == 25) {
							int var3;
							if (cc.K == 1) {
								if (~ph.k < ~sc.i) {
									sc.i = ph.k;
								}
								
								var3 = 50 * (-ph.k + sc.i) / sc.i;
								fb.a(-31122, false, wc.a(new ob[] {sc.loadingPleaseWait2, qf.O, hh.a((byte) 93, var3), ab.e}, -3));
							} else if (cc.K != 2) {
								fb.a(-31122, false, sc.loadingPleaseWait2);
							}
							
							if (hh.P > re.p) {
								re.p = hh.P;
							}
							
							var3 = 50 * (re.p + -hh.P) / re.p + 50;
							fb.a(-31122, false, wc.a(new ob[] {sc.loadingPleaseWait2, qf.O, hh.a((byte) 93, var3), ab.e}, -3));
						} else if (qb.gameState == 30) {
							jc.l(-67);
						} else if (qb.gameState == 40) {
							fb.a(-31122, false, wc.a(new ob[] {og.eb, h.gb, ug.x}, -3));
						}
					} else {
						pe.a(ia.Y, -83, qf.H);
					}
				} else {
					va.a(kf.c, null, (byte) -123, ud.Ab);
				}
			}
			
			if (var1) {
				int var4;
				Graphics graphics;
				if (~qb.gameState == -31 && ~rg.anInt_v == -1 && !ke.sb) {
					try {
						graphics = rg.canvas_t.getGraphics();
						var4 = 0;
						if (var5 != 0) {
						}
						if (/*var5 != 0 || */~var4 > ~e.anInt_d) {
							do {
								if (wf.f[var4]) {
									wb.V.a(3, l.o[var4], df.v[var4], graphics, be.f[var4], ki.r[var4]);
									wf.f[var4] = false;
								}
								
								++var4;
							} while (~var4 > ~e.anInt_d);
							
						}
					} catch (Exception e) {
						rg.canvas_t.repaint();
						e.printStackTrace();
					}
				} else if (~qb.gameState < -1) {
					try {
						graphics = rg.canvas_t.getGraphics();
						wb.V.a(0, graphics, 0, 123);
						ke.sb = false;
						var4 = 0;
						if (var5 != 0) {/*
							wf.f[var4] = false;
							++var4;
						*/
						}
						
						while (~e.anInt_d < ~var4) {
							wf.f[var4] = false;
							++var4;
						}
						
					} catch (Exception e) {
						rg.canvas_t.repaint();
						e.printStackTrace();
					}
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "client.I(" + var1 + ')');
		}
	}
	
	static int b(int var0, byte var1) {
		try {
			++anInt_ub;
			return var1 <= 9 ? -99 : var0 >>> 10;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "client.P(" + var0 + ',' + var1 + ')');
		}
	}
	
	static int a(boolean var0, byte var1, boolean var2) {
		try {
			if (var1 > -23) {
				X = null;
			}
			
			++anInt_mb;
			int var3 = 0;
			if (var2) {
				var3 += gh.hb + rg.anint_s;
			}
			
			if (var0) {
				var3 += pb.a + jd.b;
			}
			
			return var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "client.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	final void b(byte var1) {
		try {
			e((byte) 114);
			ob.d((byte) -85);
			++anInt_pb;
			na.d(1000);
			hg.c((byte) 114);
			kg.b(-5218);
			gg.a(true);
			ki.a(3073);
			og.l(1013841624);
			ph.a(-99);
			ca.e(0);
			ja.a((byte) 63);
			qe.a(true);
			nb.g(-31056);
			ae.i((byte) -117);
			hi.b((byte) -59);
			ra.a(0);
			dg.e((byte) 127);
			pi.b(100);
			md.a(108);
			bh.a((byte) 121);
			vf.d(3);
			jg.a(21528);
			lg.a(0);
			tg.a(-1);
			hc.a(29450);
			ce.g(113);
			ud.a(false);
			gf.a((byte) -39);
			ai.g(-7018);
			re.a((byte) 94);
			vd.b(17480);
			jd.b(-28934);
			qh.a(true);
			vc.a(-1);
			jh.a(-6424);
			se.b(35);
			fh.b(48);
			ah.a((byte) 109);
			ih.a(false);
			aa.f(128);
			rc.a(24147);
			fg.a(24711);
			me.a(-115);
			hf.a(-16225);
			kb.a();
			pa.a(80);
			ed.a(-24701);
			tb.a((byte) 54);
			ua.a(true);
			a.b((byte) -112);
			qg.a(false);
			dd.a(-7607);
			pe.b(18034);
			h.j(123);
			oe.a(-5079);
			bi.a(-18944);
			wd.b(true);
			cd.a((byte) 103);
			oc.a(-103);
			ub.a((byte) 87);
			tf.a(false);
			n.b(-93);
			v.f(-2900);
			ab.a((byte) -34);
			wh.a((byte) 51);
			e.b((byte) 29);
			oi.b();
			rg.e(8);
			ec.f();
			lf.f(-104);
			mb.b();
			ie.a(false);
			id.a((byte) -123);
			ig.b(104);
			bd.b((byte) 30);
			ge.h(119);
			cb.m();
			fc.d((byte) 115);
			qb.f(5);
			if (var1 >= -55) {
				f(122);
			}
			
			ei.f(25473);
			he.g();
			hh.f(0);
			kh.f(-125);
			d.g(4);
			rd.f(0);
			cc.g(11520);
			ic.b((byte) 10);
			nh.d();
			qa.a(26285);
			g.f(-16733);
			sh.a(0);
			be.a(67);
			mg.a(64);
			sf.a(false);
			ng.a((byte) 89);
			qf.e(-102);
			oh.f(-1);
			ag.b(4);
			sc.a(118);
			wc.d(4585);
			wf.a(100);
			li.b(-127);
			ne.a();
			ib.a(128);
			da.h(1);
			gh.g(118);
			la.d(-2);
			ta.h(1610612736);
			ff.b(true);
			sa.a(-121);
			ld.a((byte) -108);
			nc.b(-115);
			pc.a(false);
			di.a(-1155);
			ga.a(114);
			mc.c(0);
			ee.a((byte) -115);
			ri.b(false);
			va.a(2);
			ba.a(1);
			bb.e();
			we.a();
			dh.b(7);
			o.a((byte) 72);
			db.a();
			de.a(-23);
			qc.a((byte) 42);
			rb.a();
			vb.a((byte) -123);
			ci.a((byte) -105);
			fi.a(94);
			cg.a();
			f.b();
			kf.a((byte) -97);
			ii.d(13786);
			l.a((byte) -87);
			af.g(4);
			wa.d(70);
			nf.i(-3);
			ve.a((byte) -83);
			nd.a((byte) 65);
			r.b((byte) 106);
			eb.b(true);
			jc.i(96);
			wb.i(-799263056);
			ea.b(true);
			lh.b((byte) -115);
			ia.b(false);
			c.b((byte) 5);
			jf.i(0);
			uc.c((byte) -84);
			vg.j(-3);
			od.c((byte) -56);
			ue.i(4096);
			b.b((byte) 11);
			fb.i(-112);
			ch.b((byte) -33);
			sb.i(123);
			th.b((byte) 93);
			ni.i(0);
			ke.j(128);
			pg.b(true);
			je.i(2);
			le.k(0);
			mi.i(22817);
			wg.b((byte) -90);
			eh.i(-23153);
			ef.b((byte) 85);
			kd.b((byte) -37);
			bf.k(0);
			bc.b((byte) 119);
			s.i(-69);
			cf.b(true);
			si.b(true);
			mf.b((byte) 120);
			gb.j(256);
			q.k(0);
			ad.b((byte) -120);
			lb.b(true);
			jb.i(25447);
			qi.c((byte) -48);
			bg.a((byte) 95);
			ka.d((byte) 117);
			ug.b((byte) 114);
			gi.b((byte) -78);
			rh.a(-25070);
			qd.f(66);
			hb.a((byte) -96);
			rf.b((byte) 86);
			dc.a(-127);
			df.b((byte) -51);
			ji.b((byte) 105);
			m.b(-90);
			ac.c(106);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "client.C(" + var1 + ')');
		}
	}
	
	static int a(int unused, int sampleRate, int newSampleRate) {
		try {
			++anInt_cb;
			int i1;
			if (~newSampleRate > ~sampleRate) {
				i1 = newSampleRate;
				newSampleRate = sampleRate;
				sampleRate = i1;
			}
			
			while (sampleRate != 0) {
				i1 = newSampleRate % sampleRate;
				newSampleRate = sampleRate;
				sampleRate = i1;
			}
			
			return newSampleRate;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "client.L(" + unused + ',' + sampleRate + ',' + newSampleRate + ')');
		}
	}
	
	public static void e(byte var0) {
		try {
			T = null;
			ob_sb = null;
			ob_hb = null;
			ob_bb = null;
			if (var0 == 114) {
				V = null;
				ob_kb = null;
				S = null;
				lg_rb = null;
				Q = null;
				X = null;
				Z = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "client.E(" + var0 + ')');
		}
	}
	
	final void a(byte var1) {
		int var3 = anInt_wb;
		
		try {
			if (df.B != null) {
				df.B.a = false;
			}
			
			++Y;
			df.B = null;
			if (ch.W != null) {
				ch.W.b(-2);
				ch.W = null;
			}
			
			ea.a(-751, rg.canvas_t);
			fi.a((byte) 82, rg.canvas_t);
			if (rf.z != null) {
				rf.z.a(rg.canvas_t, 15929);
			}
			
			if (var1 <= -74) {
				sf.b(false);
				bh.b(15929);
				rf.z = null;
				if (lg_rb != null) {
					lg_rb.b((byte) -25);
				}
				
				if (mf.mb != null) {
					mf.mb.b((byte) -25);
				}
				
				jg.a((byte) 26);
				dh.a((byte) -75);
				
				try {
					if (rf.G != null) {
						rf.G.a(244);
					}
					
					if (a.i != null) {
						int var2 = 0;
						if (var3 != 0 || ~a.i.length < ~var2) {
							do {
								if (a.i[var2] != null) {
									a.i[var2].a(244);
								}
								
								++var2;
							} while (~a.i.length < ~var2);
						}
					}
					
					if (ed.k != null) {
						ed.k.a(244);
					}
					
					if (qf.J != null) {
						qf.J.a(244);
					}
				} catch (IOException var4) {
					var4.printStackTrace();
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "client.H(" + var1 + ')');
		}
	}
	
	public static void main(String[] var0) {
		int var2 = anInt_wb;
		try {
			try {
				if (~var0.length != -8) {
					vg.i(-16);
				}
				
				label118:
				{
					rd.P = Integer.parseInt(var0[0]);
					if (var0[1].equals("live")) {
						qa.l = 0;
						if (var2 == 0) {
							break label118;
						}
					}
					
					if (!var0[1].equals("office")) {
						if (var0[1].equals("local")) {
							qa.l = 2;
							if (var2 == 0) {
								break label118;
							}
						}
						
						vg.i(-16);
						if (var2 == 0) {
							break label118;
						}
					}
					
					qa.l = 1;
				}
				
				label119:
				{
					switch (var0[2]) {
						case "live":
							kh.R = 0;
							if (var2 == 0) {
								break label119;
							}
							break;
						case "rc":
							kh.R = 1;
							if (var2 == 0) {
								break label119;
							}
							break;
						case "wip":
							kh.R = 2;
							if (var2 == 0) {
								break label119;
							}
							break;
					}
					
					vg.i(-16);
				}
				
				label120:
				{
					if (var0[3].equals("lowmem")) {
						vf.e(114);
						if (var2 == 0) {
							break label120;
						}
					} else if (!var0[3].equals("highmem")) {
						vg.i(-16);
						if (var2 == 0) {
							break label120;
						}
					}
					
					jb.b(true);
				}
				
				label80:
				{
					if (!var0[4].equals("free")) {
						if (!var0[4].equals("members")) {
							vg.i(-16);
							if (var2 == 0) {
								break label80;
							}
						}
						
						li.members = true;
						if (var2 == 0) {
							break label80;
						}
					}
					
					li.members = false;
				}
				
				label72:
				{
					if (!var0[5].equals("english")) {
						if (var0[5].equals("german")) {
							rf.a((byte) 98);
							lb.db = qe.e;
							oh.M = 1;
							if (var2 == 0) {
								break label72;
							}
						}
						
						vg.i(-16);
						if (var2 == 0) {
							break label72;
						}
					}
					
					oh.M = 0;
				}
				
				label121:
				{
					if (var0[6].equals("game0")) {
						qa.F = 0;
						if (var2 == 0) {
							break label121;
						}
					} else if (var0[6].equals("game1")) {
						qa.F = 1;
						if (var2 == 0) {
							break label121;
						}
					}
					
					vg.i(-16);
				}
				
				ei.Eb = "127.0.0.1";
				qa.D = 0;
				ig.i = lb.T;
				client client = new client();
				client.a(kh.R + 32, "runescape", 503, 1, 765, 490, 23);
				v.frame.setLocation(40, 40);
			} catch (Exception e) {
				e.printStackTrace();
				ra.a(null, e, (byte) 66);
			}
			
			++anInt_vb;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "client.main(" + "{...}" + ')');
		}
	}
	
	private void h(int var1) {
		try {
			++R;
			if (var1 != ~qb.gameState) {
				boolean var2 = ii.a(false);
				if (!var2) {
					this.g(124);
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "client.A(" + var1 + ')');
		}
	}
	
	private void i(int unused) {
		int dummy = anInt_wb;
		
		try {
			++anInt_ob;
			int var2;
			if (ph.p != 0) {
				int var3;
				int var4;
				int var5;
				int var6;
				if (ph.p != 20) {
					if (ph.p == 30) {
						cc.cacheFile_0 = ca.a(true, true, (byte) 119, 0, false);
						rh.cacheFile_1 = ca.a(true, true, (byte) 18, 1, false);
						gi.cacheFile_2 = ca.a(true, false, (byte) 62, 2, true);
						ad.cacheFile_3 = ca.a(true, true, (byte) 72, 3, false);
						hi.cacheFile_4 = ca.a(true, true, (byte) 84, 4, false);
						mf.cacheFile_5 = ca.a(true, true, (byte) 117, 5, true);
						q.cacheFile_6 = ca.a(false, true, (byte) 65, 6, true);
						qa.cacheFile_7 = ca.a(true, true, (byte) 76, 7, false);
						l.cacheFile_8 = ca.a(true, true, (byte) 47, 8, false);
						pa.cacheFile_9 = ca.a(true, false, (byte) 48, 9, true);
						fh.cacheFile_10 = ca.a(true, true, (byte) 60, 10, false);
						qe.cacheFile_11 = ca.a(true, true, (byte) 122, 11, false);
						jg.cacheFile_12 = ca.a(true, true, (byte) 64, 12, false);
						ve.cacheFile_13 = ca.a(true, false, (byte) 18, 13, true);
						pi.cacheFile_14 = ca.a(false, true, (byte) 25, 14, false);
						wd.cacheFile_15 = ca.a(true, true, (byte) 116, 15, false);
						hc.cacheFile_16 = ca.a(true, true, (byte) 80, 16, false);
						sf.cacheFile_17 = ca.a(true, true, (byte) 124, 17, false);
						ki.cacheFile_18 = ca.a(true, true, (byte) 95, 18, false);
						od.cacheFile_19 = ca.a(true, true, (byte) 93, 19, false);
						me.cacheFile_20 = ca.a(true, true, (byte) 39, 20, false);
						hg.cacheFile_21 = ca.a(true, true, (byte) 53, 21, false);
						pc.cacheFile_22 = ca.a(true, true, (byte) 119, 22, false);
						ud.Ab = 20;
						ph.p = 40;
						kf.c = ng.connectingToUpdateServer2;
					} else {
						byte var14;
						if (ph.p == 40) {
							var14 = 0;
							var2 = var14 + 4 * cc.cacheFile_0.d(1) / 100;
							var2 += 4 * rh.cacheFile_1.d(1) / 100;
							var2 += gi.cacheFile_2.d(1) / 100;
							var2 += ad.cacheFile_3.d(1) * 2 / 100;
							var2 += hi.cacheFile_4.d(1) * 6 / 100;
							var2 += mf.cacheFile_5.d(1) * 4 / 100;
							var2 += 2 * q.cacheFile_6.d(1) / 100;
							var2 += 54 * qa.cacheFile_7.d(1) / 100;
							var2 += 2 * l.cacheFile_8.d(1) / 100;
							var2 += 2 * pa.cacheFile_9.d(1) / 100;
							var2 += fh.cacheFile_10.d(1) * 2 / 100;
							var2 += 2 * qe.cacheFile_11.d(1) / 100;
							var2 += jg.cacheFile_12.d(1) * 2 / 100;
							var2 += 2 * ve.cacheFile_13.d(1) / 100;
							var2 += pi.cacheFile_14.d(1) * 2 / 100;
							var2 += wd.cacheFile_15.d(1) * 2 / 100;
							var2 += hc.cacheFile_16.d(1) / 100;
							var2 += sf.cacheFile_17.d(1) / 100;
							var2 += ki.cacheFile_18.d(1) / 100;
							var2 += od.cacheFile_19.d(1) / 100;
							var2 += me.cacheFile_20.d(1) / 100;
							var2 += hg.cacheFile_21.d(1) / 100;
							var2 += pc.cacheFile_22.d(1) / 100;
							if (var2 != 100) {
								if (var2 != 0) {
									kf.c = wc.a(new ob[] {me.checkingForUpdates2, hh.a((byte) 93, var2), a.c}, -3);
								}
								
								ud.Ab = 30;
							} else {
								kf.c = hi.loadedUpdateList2;
								ud.Ab = 30;
								mg.a(l.cacheFile_8, (byte) 93, q.cacheFile_6, fh.cacheFile_10);
								ph.p = 45;
							}
						} else if (ph.p == 45) {
							wh.a(!ag.forceSend, 2, 22050, 0);
							h class_h = new h();
							class_h.a(true, 128, 9);
							lg_rb = uc.a(0, true, 22050, rg.canvas_t, gi.y);
							if (lg_rb != null) {
								lg_rb.a(class_h, 4);
							}
							vc.a(class_h, -19, hi.cacheFile_4, wd.cacheFile_15, pi.cacheFile_14);
							mf.mb = uc.a(1, true, 2048, rg.canvas_t, gi.y);
							ub.d = new u();
							mf.mb.a(ub.d, 4);
							qi.o = new tg(22050, ki.sampleRate);
							kf.c = ag.preparedSoundEngine2;
							ph.p = 50;
							ud.Ab = 35;
						} else if (ph.p == 50) {
							var2 = 0;
							if (qf.H == null) {
								qf.H = gi.loadFont(bf.p11_full, -20, ve.cacheFile_13, l.cacheFile_8, lb.T);
							} else {
								++var2;
							}
							
							if (fg.v == null) {
								fg.v = qf.H;
							} else {
								++var2;
							}
							
							if (mf.i_gb != null) {
								++var2;
							} else {
								mf.i_gb = gi.loadFont(me.p12_full, -20, ve.cacheFile_13, l.cacheFile_8, lb.T);
							}
							
							if (ia.Y != null) {
								++var2;
							} else {
								ia.Y = gi.loadFont(tb.b12_full, -20, ve.cacheFile_13, l.cacheFile_8, lb.T);
							}
							
							if (var2 < 4) {
								kf.c = wc.a(new ob[] {ji.loadingFonts2, hh.a((byte) 93, 100 * var2 / 4), a.c}, -3);
								ud.Ab = 40;
							} else {
								ud.Ab = 40;
								kf.c = ff.loadedFonts2;
								ph.p = 60;
							}
						} else if (ph.p == 60) {
							var2 = hb.loadingTitleScreen(l.cacheFile_8, true, fh.cacheFile_10);
							var3 = ai.getTitleScreenCount(-89);
							if (~var3 < ~var2) {
								kf.c = wc.a(new ob[] {id.loadingTitleScreen2, hh.a((byte) 93, 100 * var2 / var3), a.c}, -3);
								ud.Ab = 50;
							} else {
								kf.c = a.starting3DLibrary2;
								ph.p = 65;
								ud.Ab = 50;
							}
						} else if (ph.p == 65) {
							ud.Ab = 50;
							kf.c = hf.started3DLibrary2;
							pg.setGameState(5, (byte) 84);
							ph.p = 70;
						} else if (ph.p == 70) {
							var14 = 0;
							gi.cacheFile_2.a(true);
							var2 = var14 + gi.cacheFile_2.b((byte) 104);
							hc.cacheFile_16.a(true);
							var2 += hc.cacheFile_16.b((byte) 104);
							sf.cacheFile_17.a(true);
							var2 += sf.cacheFile_17.b((byte) 104);
							ki.cacheFile_18.a(true);
							var2 += ki.cacheFile_18.b((byte) 104);
							od.cacheFile_19.a(true);
							var2 += od.cacheFile_19.b((byte) 104);
							me.cacheFile_20.a(true);
							var2 += me.cacheFile_20.b((byte) 104);
							hg.cacheFile_21.a(true);
							var2 += hg.cacheFile_21.b((byte) 104);
							pc.cacheFile_22.a(true);
							var2 += pc.cacheFile_22.b((byte) 104);
							if (~var2 > -801) {
								kf.c = wc.a(new ob[] {ci.loadingConfig2, hh.a((byte) 93, var2 / 8), a.c}, -3);
								ud.Ab = 60;
							} else {
								ea.a(gi.cacheFile_2, (byte) 0);
								ge.a(gi.cacheFile_2, (byte) 71);
								gb.a(qa.cacheFile_7, -1, gi.cacheFile_2);
								ii.a(-1888, qa.cacheFile_7, ag.forceSend, hc.cacheFile_16);
								bc.a(qa.cacheFile_7, ki.cacheFile_18, (byte) -106);
								di.a(qa.cacheFile_7, od.cacheFile_19, li.members, fg.v, (byte) 102);
								ee.a(-120, me.cacheFile_20, rh.cacheFile_1, cc.cacheFile_0);
								hh.a(qa.cacheFile_7, hg.cacheFile_21, (byte) 26);
								pa.a(-30393, pc.cacheFile_22);
								eh.a(29118, gi.cacheFile_2);
								o.a(l.cacheFile_8, 0, qa.cacheFile_7, ad.cacheFile_3, ve.cacheFile_13);
								jb.a((byte) -113, gi.cacheFile_2);
								di.a(0, sf.cacheFile_17);
								kf.c = c.loadedConfig2;
								ud.Ab = 60;
								qi.b((byte) 124);//Objects..?
								ph.p = 80;
							}
						} else if (ph.p != 80) {
							if (ph.p == 90) {
								if (!pa.cacheFile_9.a(true)) {
									kf.c = wc.a(new ob[] {wg.loadingTextures2, hh.a((byte) 93, pa.cacheFile_9.b((byte) 104)), a.c}, -3);
									ud.Ab = 90;
								} else {
									qa class_qa = new qa(pa.cacheFile_9, l.cacheFile_8, 20, ag.forceSend ? 64 : 128);
									ec.a(class_qa);
									ec.a(0.7F);
									ud.Ab = 90;
									kf.c = jb.loadedTextures2;
									ph.p = 110;
								}
							} else if (ph.p == 110) {
								df.B = new gg();
								gi.y.a(3360, 10, df.B);
								ph.p = 120;
								ud.Ab = 94;
								kf.c = rc.loadedInputHandler2;
							} else if (ph.p == 120) {
								if (!fh.cacheFile_10.a(lb.T, bi.huffman, false)) {
									kf.c = wc.a(new ob[] {a.loadingWordpack2, kd.X}, -3);
									ud.Ab = 96;
								} else {
									sh class_sh = new sh(fh.cacheFile_10.a(bi.huffman, 1, lb.T));
									qa.a(-101, class_sh);
									ud.Ab = 96;
									ph.p = 130;
									kf.c = nf.loadedWordpack2;
								}
							} else if (ph.p == 130) {
								if (!ad.cacheFile_3.a(true)) {
									kf.c = wc.a(new ob[] {mg.loadingInterfaces2, hh.a((byte) 93, 4 * ad.cacheFile_3.b((byte) 104) / 5), a.c}, -3);
									ud.Ab = 100;
								} else if (!jg.cacheFile_12.a(true)) {
									kf.c = wc.a(new ob[] {mg.loadingInterfaces2, hh.a((byte) 93, 80 + jg.cacheFile_12.b((byte) 104) / 6), a.c}, -3);
									ud.Ab = 100;
								} else if (!ve.cacheFile_13.a(true)) {
									kf.c = wc.a(new ob[] {mg.loadingInterfaces2, hh.a((byte) 93, ve.cacheFile_13.b((byte) 104) / 20 + 96), a.c}, -3);
									ud.Ab = 100;
								} else {
									kf.c = ae.loadedInterfaces2;
									ud.Ab = 100;
									ph.p = 140;
								}
							} else if (ph.p == 140) {
								mf.cacheFile_5.a(true, (byte) 90, false);
								q.cacheFile_6.a(true, (byte) 90, true);
								l.cacheFile_8.a(true, (byte) 90, true);
								ve.cacheFile_13.a(true, (byte) 90, true);
								fh.cacheFile_10.a(true, (byte) 90, true);
								pg.setGameState(10, (byte) -61);
							}
						} else {
							var2 = 0;
							if (b.V == null) {
								b.V = cc.a(fb.compass, 0, lb.T, l.cacheFile_8);
							}
							
							++var2;
							
							if (fi.g == null) {
								fi.g = a(l.cacheFile_8, ai.mapscene, 0, lb.T);
							}
							
							++var2;
							
							if (ca.lb == null) {
								ca.lb = ji.a(lb.T, l.cacheFile_8, -72515348, ka.mapfunction);
							}
							
							++var2;
							
							if (re.t == null) {
								re.t = ji.a(lb.T, l.cacheFile_8, -72515348, gh.hitmarks);
							}
							
							++var2;
							
							if (mf.eb == null) {
								mf.eb = ji.a(lb.T, l.cacheFile_8, -72515348, ih.headicons_pk);
							}
							
							++var2;
							
							if (ca.kb == null) {
								ca.kb = ji.a(lb.T, l.cacheFile_8, -72515348, fg.headicons_prayer);
							} else {
								++var2;
							}
							
							if (gg.u == null) {
								gg.u = ji.a(lb.T, l.cacheFile_8, -72515348, c.hint_headicons);
							}
							
							++var2;
							
							if (vb.g == null) {
								vb.g = ji.a(lb.T, l.cacheFile_8, -72515348, fc.hint_mapmarkers);
							} else {
								++var2;
							}
							
							if (ug.u == null) {
								ug.u = ji.a(lb.T, l.cacheFile_8, -72515348, ac.hint_mapedge);
							}
							
							++var2;
							
							if (re.v == null) {
								re.v = cc.a(sa.mapflag, 0, lb.T, l.cacheFile_8);
							}
							
							++var2;
							
							if (rh.u == null) {
								rh.u = ji.a(lb.T, l.cacheFile_8, -72515348, gh.cross);
							} else {
								++var2;
							}
							
							if (ac.n == null) {
								ac.n = ji.a(lb.T, l.cacheFile_8, -72515348, ch.mapdots);
							} else {
								++var2;
							}
							
							if (ke.lb == null) {
								ke.lb = a(l.cacheFile_8, pg.scrollbar, 0, lb.T);
							} else {
								++var2;
							}
							
							if (ca.gb == null) {
								ca.gb = a(l.cacheFile_8, re.mod_icons, 0, lb.T);
							} else {
								++var2;
							}
							
							++var2;
							if (var2 < 15) {
								kf.c = wc.a(new ob[] {pc.loadingSprites2, hh.a((byte) 93, 100 * var2 / 13), a.c}, -3);
								ud.Ab = 70;
							} else {
								qf.H.a(ca.gb, null);
								mf.i_gb.a(ca.gb, null);
								ia.Y.a(ca.gb, null);
								if (qf.H != fg.v) {
									fg.v.a(ca.gb, null);
								}
								
								var3 = 0;
								if (ug.u.length > var3) {
									do {
										ug.u[var3].h();
										++var3;
									} while (ug.u.length > var3);
								}
								
								b.V.h();
								var4 = (int) (Math.random() * 21.0D) + -10;
								var5 = (int) (21.0D * Math.random()) - 10;
								var6 = (int) (Math.random() * 21.0D) - 10;
								int var7 = (int) (Math.random() * 41.0D) - 20;
								int var8 = 0;
								while (~ca.lb.length < ~var8) {
									ca.lb[var8].c(var7 + var4, var5 - -var7, var7 + var6);
									++var8;
								}
								
								fi.g[0].c(var4 + var7, var7 + var5, var7 + var6);
								kf.c = ee.loadedSprites2;
								ph.p = 90;
								ud.Ab = 70;
							}
						}
					}
				} else {
					int[] var11 = new int[9];
					var3 = 0;
					if (~var3 <= -10) {
						hi.a(var11, 500, 800, 512, 334, 25, 3500);
						kf.c = v.preparedVisibilityMap2;
						ph.p = 30;
						ud.Ab = 10;
					} else {
						do {
							var4 = 15 + (128 + (32 * var3));
							var6 = ec.W[var4];
							var5 = var4 * 3 + 600;
							var11[var3] = var5 * var6 >> 16;
							++var3;
						} while (~var3 > -10);
						
						hi.a(var11, 500, 800, 512, 334, 25, 3500);
						kf.c = v.preparedVisibilityMap2;
						ph.p = 30;
						ud.Ab = 10;
					}
				}
			} else {
				bi.a(4, 104, 104, d.D);
				var2 = 0;
				while (~var2 > -5) {
					ef.R[var2] = new hi(104, 104);
					++var2;
				}
				
				ki.h = new kc(512, 512);
				kf.c = cd.startingGameEngine2;
				ud.Ab = 5;
				ph.p = 20;
			}
		} catch (RuntimeException e) {
			throw bc.a(e, "client.M(" + unused + ')');
		}
	}
	
	public final void init() {
		int var5 = anInt_wb;
		
		try {
			++anInt_nb;
			if (this.e(0)) {
				label61:
				{
					rd.P = Integer.parseInt(this.getParameter("worldid"));
					kh.R = Integer.parseInt(this.getParameter("modewhat"));
					qa.l = Integer.parseInt(this.getParameter("modewhere"));
					String var1 = this.getParameter("lowmem");
					if (var1 != null && var1.equals("1")) {
						vf.e(127);
						if (var5 == 0) {
							break label61;
						}
					}
					
					jb.b(true);
				}
				
				label68:
				{
					String var2 = this.getParameter("members");
					if (var2 == null || !var2.equals("1")) {
						li.members = false;
						if (var5 == 0) {
							break label68;
						}
					}
					
					li.members = true;
				}
				
				String var3 = this.getParameter("lang");
				if (var3 != null && var3.equals("1")) {
					rf.a((byte) 122);
					oh.M = 1;
					lb.db = qe.e;
				}
				
				label69:
				{
					String var4 = this.getParameter("game");
					if (var4 == null || !var4.equals("1")) {
						qa.F = 0;
						if (var5 == 0) {
							break label69;
						}
					}
					
					qa.F = 1;
				}
				
				try {
					anInt_tb = Integer.parseInt(this.getParameter("js"));
					oc.g = Integer.parseInt(this.getParameter("plug"));
					qa.D = Integer.parseInt(this.getParameter("affid"));
				} catch (Exception var6) {
					var6.printStackTrace();
				}
				
				ig.i = rf.t.b(this, (byte) 60);
				if (ig.i == null) {
					ig.i = lb.T;
				}
				
				ei.Eb = this.getCodeBase().getHost();
				this.a(765, 490, 26340, 32 - -kh.R, 503);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "client.init(" + ')');
		}
	}
	
	static void f(byte unused) {
		int dummy = anInt_wb;
		
		try {
			++anInt_jb;
			
			while (~pg.packetBuffer.bitOFFS(50, sh.packetSize) <= -28) {
				int var2 = pg.packetBuffer.readBits(15, 11339);
				if (var2 == 32767) {
					break;
				}
				
				boolean var3 = false;
				if (ai.M[var2] == null) {
					ai.M[var2] = new nb();
					var3 = true;
				}
				
				nb var4 = ai.M[var2];
				ud.Xb[tf.n++] = var2;
				var4.Ub = bi.f;
				int y = pg.packetBuffer.readBits(5, 11339);
				if (y > 15) {
					y -= 32;
				}
				
				int var6 = pg.packetBuffer.readBits(1, 11339);
				int var7 = pg.packetBuffer.readBits(1, 11339);
				if (~var7 == -2) {
					mf.nb[qf.I++] = var2;
				}
				
				int var8 = ef.ints_lb[pg.packetBuffer.readBits(3, 11339)];
				if (var3) {
					var4.U = var4.gb = var8;
				}
				
				int x = pg.packetBuffer.readBits(5, 11339);
				var4.pc = ei.b(pg.packetBuffer.readBits(14, 11339), 0);
				var4.ab = var4.pc.Cb;
				var4.ub = var4.pc.zb;
				if (var4.ab == 0) {
					var4.gb = 0;
				}
				
				var4.Jb = var4.pc.sb;
				var4.Y = var4.pc.ib;
				var4.R = var4.pc.gb;
				if (x > 15) {
					x -= 32;
				}
				
				var4.jb = var4.pc.fb;
				var4.Rb = var4.pc.Ab;
				var4.Gb = var4.pc.tb;
				var4.vb = var4.pc.F;
				var4.a(x + le.T.regionLocalX[0], y + le.T.regionLocalY[0], -1, ~var6 == -2);
			}
			
			pg.packetBuffer.finishBITAccess(8);
		} catch (RuntimeException var11) {
			throw bc.a(var11, "client.D(" + unused + ')');
		}
	}
	
	final void c(int var1) {
		int var3 = anInt_wb;
		
		try {
			{
				++W;
				if (~qa.F != -2) {
					kd.Z = dg.pc;
					hf.z = dh.r;
					ob.V = ce.R;
					la.x = qe.n;
					if (var3 == 0) {
					}
				}
				
				ob.V = ag.l;
				la.x = bh.a;
				hf.z = fc.I;
				kd.Z = ih.e;
			}
			
			gi.w = qa.l == 0 ? 'ꩊ' : '鱀' + rd.P;
			r.Y = qa.l != 0 ? '썐' - -rd.P : 443;
			qe.s = gi.w;
			d.h(var1);
			mg.a(var1, rg.canvas_t);
			ba.a(rg.canvas_t, -116);
			rf.z = sc.a((byte) 116);
			if (rf.z != null) {
				rf.z.a(rg.canvas_t, (byte) -55);
			}
			
			v.jb = t.o;
			
			try {
				if (gi.y.dat2CacheFile != null) {
					rf.G = new ja(gi.y.dat2CacheFile, 5200, 0);
					int var2 = 0;
					if (var3 != 0 || ~var2 > -24) {
						do {
							a.i[var2] = new ja(gi.y.idxCacheFileIndex[var2], 6000, 0);
							++var2;
						} while (~var2 > -24);
					}
					
					ed.k = new ja(gi.y.idx255CacheFile, 6000, 0);
					nb.kc = new qe(255, rf.G, ed.k, 500000);
					qf.J = new ja(gi.y.i, 24, 0);
					gi.y.idxCacheFileIndex = null;
					gi.y.i = null;
					gi.y.idx255CacheFile = null;
					gi.y.dat2CacheFile = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
				rf.G = null;
				qf.J = null;
				nb.kc = null;
				ed.k = null;
			}
			
			if (qa.l != 0) {
				lg.displayFPS = true;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "client.N(" + var1 + ')');
		}
	}
	
	static {
		ob_hb = Q;
		S = Z;
		V = new ob[100];
		anInt_lb = 0;
		T = rf.a(40, "mn");
		X = rf.a(40, "Your ignore list is full)3 Max of 100 users)3");
		ob_bb = Z;
		aBoolean_db = false;
		anInt_qb = -1;
		ob_sb = rf.a(40, "nicht hergestellt werden)3");
		anInt_tb = 1;
		ob_kb = X;
	}
}
