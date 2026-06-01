<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success — Student Saved</title>
    <link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@600;700;800&family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
    <style>

        :root {
            --green:   #22c55e;
            --teal:    #0fcfb0;
            --yellow:  #ffd93d;
            --coral:   #ff6b6b;
            --indigo:  #6366f1;
            --dark:    #0d1117;
        }

        *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

        body {
            font-family: 'Poppins', sans-serif;
            background: var(--dark);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            overflow: hidden;
            position: relative;
        }

        /* ── Mesh background ── */
        .bg-mesh {
            position: fixed; inset: 0;
            background:
                radial-gradient(ellipse 70% 60% at 15% 25%,  rgba(34,197,94,.2)   0%, transparent 60%),
                radial-gradient(ellipse 60% 60% at 85% 75%,  rgba(15,207,176,.18) 0%, transparent 55%),
                radial-gradient(ellipse 50% 50% at 55% 5%,   rgba(255,217,61,.13) 0%, transparent 55%),
                radial-gradient(ellipse 65% 55% at 70% 50%,  rgba(99,102,241,.15) 0%, transparent 55%);
            animation: meshPulse 10s ease-in-out infinite alternate;
            z-index: 0;
        }
        @keyframes meshPulse {
            from { opacity: .75; transform: scale(1); }
            to   { opacity: 1;   transform: scale(1.06); }
        }

        .bg-dots {
            position: fixed; inset: 0;
            background-image: radial-gradient(rgba(255,255,255,.06) 1px, transparent 1px);
            background-size: 30px 30px;
            z-index: 0;
        }

        /* ── Confetti pieces ── */
        .confetti-wrap {
            position: fixed; inset: 0;
            pointer-events: none;
            z-index: 1;
        }
        .c {
            position: absolute;
            top: -20px;
            width: 10px; height: 10px;
            border-radius: 2px;
            animation: fall linear infinite;
            opacity: 0;
        }
        @keyframes fall {
            0%   { transform: translateY(-20px) rotate(0deg);   opacity: 1; }
            100% { transform: translateY(110vh)  rotate(720deg); opacity: 0; }
        }

        /* ── Orbs ── */
        .orb {
            position: fixed; border-radius: 50%;
            filter: blur(3px); opacity: .45;
            animation: orbFloat ease-in-out infinite alternate;
            z-index: 0; pointer-events: none;
        }
        @keyframes orbFloat {
            from { transform: translateY(0) scale(1); }
            to   { transform: translateY(-35px) scale(1.07); }
        }

        /* ── Card ── */
        .card {
            position: relative; z-index: 10;
            background: rgba(255,255,255,.055);
            backdrop-filter: blur(28px);
            -webkit-backdrop-filter: blur(28px);
            border: 1px solid rgba(255,255,255,.1);
            border-radius: 28px;
            padding: 52px 50px 46px;
            max-width: 520px; width: 90%;
            text-align: center;
            box-shadow:
                0 30px 80px rgba(0,0,0,.5),
                0 0 0 1px rgba(255,255,255,.05) inset,
                0 1px 0 rgba(255,255,255,.18) inset;
            animation: cardIn .8s cubic-bezier(.34,1.56,.64,1) both;
        }
        @keyframes cardIn {
            from { opacity: 0; transform: translateY(55px) scale(.9); }
            to   { opacity: 1; transform: translateY(0) scale(1); }
        }

        /* rainbow top bar */
        .card::before {
            content: '';
            position: absolute;
            top: -2px; left: 15%; right: 15%;
            height: 3px; border-radius: 100px;
            background: linear-gradient(90deg, var(--green), var(--teal), var(--yellow), var(--coral));
            filter: blur(1px);
        }

        /* ── Success icon ── */
        .icon-wrap {
            width: 80px; height: 80px;
            border-radius: 50%;
            background: linear-gradient(135deg, var(--green), var(--teal));
            display: flex; align-items: center; justify-content: center;
            margin: 0 auto 24px;
            box-shadow: 0 8px 30px rgba(34,197,94,.45);
            animation: popIn .7s cubic-bezier(.34,1.56,.64,1) .2s both;
        }
        @keyframes popIn {
            from { opacity: 0; transform: scale(.4) rotate(-20deg); }
            to   { opacity: 1; transform: scale(1)  rotate(0deg);   }
        }
        .icon-wrap svg {
            width: 38px; height: 38px;
            stroke: white; stroke-width: 3;
            fill: none; stroke-linecap: round; stroke-linejoin: round;
            animation: drawCheck .5s ease .9s both;
            stroke-dasharray: 60;
            stroke-dashoffset: 60;
        }
        @keyframes drawCheck {
            to { stroke-dashoffset: 0; }
        }

        /* ── Heading ── */
        h1 {
            font-family: 'Baloo 2', cursive;
            font-weight: 800;
            font-size: clamp(1.5rem, 4vw, 2rem);
            color: white;
            margin-bottom: 6px;
            animation: fadeUp .5s ease .3s both;
        }
        .sub-heading {
            color: rgba(255,255,255,.4);
            font-size: .85rem;
            font-weight: 300;
            margin-bottom: 36px;
            animation: fadeUp .5s ease .4s both;
        }
        @keyframes fadeUp {
            from { opacity: 0; transform: translateY(14px); }
            to   { opacity: 1; transform: translateY(0); }
        }

        /* ── Info cards ── */
        .info-grid {
            display: flex;
            flex-direction: column;
            gap: 14px;
            margin-bottom: 36px;
            text-align: left;
        }

        .info-row {
            display: flex;
            align-items: center;
            gap: 14px;
            background: rgba(255,255,255,.06);
            border: 1px solid rgba(255,255,255,.08);
            border-radius: 14px;
            padding: 14px 18px;
            animation: fadeUp .5s ease both;
        }
        .info-row:nth-child(1) { animation-delay: .45s; }
        .info-row:nth-child(2) { animation-delay: .55s; }
        .info-row:nth-child(3) { animation-delay: .65s; }

        .info-icon {
            width: 40px; height: 40px; flex-shrink: 0;
            border-radius: 10px;
            display: flex; align-items: center; justify-content: center;
            font-size: 1.15rem;
        }
        .icon-name  { background: rgba(99,102,241,.25);  border: 1px solid rgba(99,102,241,.4); }
        .icon-email { background: rgba(15,207,176,.2);   border: 1px solid rgba(15,207,176,.4); }
        .icon-pass  { background: rgba(255,107,107,.2);  border: 1px solid rgba(255,107,107,.4);}

        .info-content { flex: 1; min-width: 0; }
        .info-label {
            font-size: .67rem;
            font-weight: 600;
            letter-spacing: .1em;
            text-transform: uppercase;
            margin-bottom: 2px;
        }
        .label-name  { color: #818cf8; }
        .label-email { color: var(--teal); }
        .label-pass  { color: var(--coral); }

        .info-value {
            font-size: .92rem;
            font-weight: 500;
            color: rgba(255,255,255,.85);
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }

        /* password mask */
        .info-value.masked { letter-spacing: .18em; color: rgba(255,255,255,.5); }

        /* ── CTA button ── */
        .btn-back {
            display: inline-flex;
            align-items: center; justify-content: center;
            gap: 8px;
            text-decoration: none;
            font-family: 'Baloo 2', cursive;
            font-weight: 700;
            font-size: 1rem;
            color: var(--dark);
            background: linear-gradient(135deg, var(--green) 0%, var(--teal) 100%);
            padding: 13px 38px;
            border-radius: 100px;
            box-shadow: 0 8px 28px rgba(34,197,94,.4);
            transition: transform .2s, box-shadow .2s;
            animation: fadeUp .5s ease .75s both;
            position: relative; overflow: hidden;
        }
        .btn-back::after {
            content: '';
            position: absolute; inset: 0;
            background: linear-gradient(135deg, rgba(255,255,255,.25), transparent);
            border-radius: inherit;
        }
        .btn-back:hover {
            transform: translateY(-3px) scale(1.03);
            box-shadow: 0 14px 36px rgba(34,197,94,.5);
        }
        .btn-back:active { transform: scale(.97); }

    </style>
</head>
<body>

<!-- Background -->
<div class="bg-mesh"></div>
<div class="bg-dots"></div>

<!-- Orbs -->
<div class="orb" style="width:200px;height:200px;background:radial-gradient(circle,rgba(34,197,94,.45),transparent 70%);top:-50px;left:-50px;animation-duration:8s;"></div>
<div class="orb" style="width:160px;height:160px;background:radial-gradient(circle,rgba(15,207,176,.4),transparent 70%);bottom:-30px;right:-30px;animation-duration:10s;animation-delay:.6s;"></div>
<div class="orb" style="width:110px;height:110px;background:radial-gradient(circle,rgba(255,217,61,.35),transparent 70%);top:28%;right:5%;animation-duration:7s;animation-delay:1.2s;"></div>

<!-- Confetti -->
<div class="confetti-wrap" id="confetti"></div>

<!-- Card -->
<div class="card">

    <div class="icon-wrap">
        <svg viewBox="0 0 24 24">
            <polyline points="20 6 9 17 4 12"/>
        </svg>
    </div>

    <h1>🎉 Student Saved Successfully!</h1>
    <p class="sub-heading">Registration complete — details stored below</p>

    <div class="info-grid">

        <div class="info-row">
            <div class="info-icon icon-name">👤</div>
            <div class="info-content">
                <div class="info-label label-name">Full Name</div>
                <div class="info-value">${student.name}</div>
            </div>
        </div>

        <div class="info-row">
            <div class="info-icon icon-email">✉️</div>
            <div class="info-content">
                <div class="info-label label-email">Email Address</div>
                <div class="info-value">${student.email}</div>
            </div>
        </div>

        <div class="info-row">
            <div class="info-icon icon-pass">🔒</div>
            <div class="info-content">
                <div class="info-label label-pass">Password</div>
                <div class="info-value masked">${student.password}</div>
            </div>
        </div>

    </div>

    <a href="login" class="btn-back">
        ← Go to Login
    </a>

</div>

<script>
    // Generate confetti on load
    const wrap = document.getElementById('confetti');
    const colors = ['#22c55e','#0fcfb0','#ffd93d','#ff6b6b','#6366f1','#a855f7','#ffffff'];
    for (let i = 0; i < 55; i++) {
        const el = document.createElement('div');
        el.className = 'c';
        el.style.cssText = `
            left: ${Math.random() * 100}%;
            width: ${6 + Math.random() * 8}px;
            height: ${6 + Math.random() * 8}px;
            background: ${colors[Math.floor(Math.random() * colors.length)]};
            border-radius: ${Math.random() > .5 ? '50%' : '2px'};
            animation-duration: ${3 + Math.random() * 5}s;
            animation-delay: ${Math.random() * 3}s;
        `;
        wrap.appendChild(el);
    }
</script>

</body>
</html>