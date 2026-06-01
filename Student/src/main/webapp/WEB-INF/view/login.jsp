<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700;800;900&display=swap" rel="stylesheet">
<style>

    *, *::before, *::after {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }

    body {
        font-family: 'Nunito', sans-serif;
        min-height: 100vh;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        background: linear-gradient(135deg, #667eea 0%, #f64f59 50%, #f093fb 100%);
        background-size: 400% 400%;
        animation: gradientShift 8s ease infinite;
        padding: 40px 20px;
        position: relative;
        overflow: hidden;
    }

    body::before {
        content: '';
        position: fixed;
        top: -50%;
        left: -50%;
        width: 200%;
        height: 200%;
        background: radial-gradient(circle at 20% 50%, rgba(255,200,100,0.15) 0%, transparent 50%),
                    radial-gradient(circle at 80% 20%, rgba(120,80,255,0.15) 0%, transparent 50%),
                    radial-gradient(circle at 60% 80%, rgba(255,80,150,0.1) 0%, transparent 50%);
        pointer-events: none;
        animation: float 12s ease-in-out infinite;
    }

    @keyframes gradientShift {
        0%   { background-position: 0% 50%; }
        50%  { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    @keyframes float {
        0%, 100% { transform: translateY(0) rotate(0deg); }
        50%       { transform: translateY(-30px) rotate(3deg); }
    }

    @keyframes slideUp {
        from { opacity: 0; transform: translateY(40px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    @keyframes popIn {
        0%   { opacity: 0; transform: scale(0.8); }
        70%  { transform: scale(1.04); }
        100% { opacity: 1; transform: scale(1); }
    }

    /* Floating bubbles */
    .bubble {
        position: fixed;
        border-radius: 50%;
        opacity: 0.18;
        animation: bubbleFloat linear infinite;
        pointer-events: none;
    }
    @keyframes bubbleFloat {
        0%   { transform: translateY(110vh) scale(1); opacity: 0.18; }
        100% { transform: translateY(-10vh) scale(1.2); opacity: 0; }
    }

    /* Page title above the card */
    .page-title {
        color: white;
        font-size: 2.2rem;
        font-weight: 900;
        letter-spacing: -0.5px;
        text-align: center;
        margin-bottom: 24px;
        text-shadow: 0 2px 16px rgba(0,0,0,0.18);
        animation: popIn 0.7s cubic-bezier(.34,1.56,.64,1) both;
    }

    .page-title span {
        background: linear-gradient(90deg, #ffe259, #ffa751);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        background-clip: text;
    }

    /* Card */
    .container {
        width: 100%;
        max-width: 440px;
        background: rgba(255,255,255,0.96);
        padding: 40px 36px 36px;
        border-radius: 24px;
        box-shadow:
            0 24px 60px rgba(102,30,130,0.22),
            0 8px 20px rgba(246,79,89,0.12),
            inset 0 1px 0 rgba(255,255,255,0.9);
        animation: slideUp 0.7s cubic-bezier(.34,1.56,.64,1) 0.1s both;
        position: relative;
        overflow: hidden;
    }

    /* Rainbow top bar */
    .container::before {
        content: '';
        position: absolute;
        top: 0; left: 0; right: 0;
        height: 5px;
        background: linear-gradient(90deg, #f64f59, #f093fb, #667eea, #43e97b, #ffe259);
        border-radius: 24px 24px 0 0;
    }

    /* Card heading */
    .container h1 {
        font-size: 1.7rem;
        font-weight: 900;
        text-align: center;
        margin-bottom: 28px;
        background: linear-gradient(135deg, #667eea, #f64f59);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        background-clip: text;
    }

    /* Field groups */
    .field-group {
        margin-bottom: 20px;
        animation: slideUp 0.5s ease both;
    }
    .field-group:nth-child(2) { animation-delay: 0.15s; }
    .field-group:nth-child(3) { animation-delay: 0.25s; }
    .field-group:nth-child(4) { animation-delay: 0.35s; }

    label {
        display: block;
        font-weight: 800;
        font-size: 0.82rem;
        letter-spacing: 0.06em;
        text-transform: uppercase;
        margin-bottom: 7px;
        color: #555;
    }

    .label-name  { color: #667eea; }
    .label-email { color: #f64f59; }
    .label-pass  { color: #a855f7; }

    /* Icon + input wrapper */
    .input-wrap {
        position: relative;
        display: flex;
        align-items: center;
    }

    .input-icon {
        position: absolute;
        left: 13px;
        font-size: 1.1rem;
        pointer-events: none;
        z-index: 1;
        transition: transform 0.2s;
    }

    input[type=text],
    input[type=password] {
        width: 100%;
        padding: 12px 14px 12px 40px;
        border: 2px solid #e5e7eb;
        border-radius: 12px;
        font-family: 'Nunito', sans-serif;
        font-size: 0.97rem;
        font-weight: 600;
        color: #333;
        background: #f9fafb;
        outline: none;
        transition: border-color 0.25s, box-shadow 0.25s, background 0.25s;
    }

    /* Per-field focus colors */
    .field-name  input:focus  { border-color: #667eea; box-shadow: 0 0 0 3px rgba(102,126,234,0.15); background: #f5f6ff; }
    .field-email input:focus  { border-color: #f64f59; box-shadow: 0 0 0 3px rgba(246,79,89,0.13);  background: #fff5f6; }
    .field-pass  input:focus  { border-color: #a855f7; box-shadow: 0 0 0 3px rgba(168,85,247,0.13); background: #faf5ff; }

    input:focus + .input-icon,
    .input-wrap:focus-within .input-icon {
        transform: scale(1.25);
    }

    /* Submit button */
    .btn-submit {
        width: 100%;
        padding: 14px;
        border: none;
        border-radius: 14px;
        font-family: 'Nunito', sans-serif;
        font-size: 1.05rem;
        font-weight: 800;
        letter-spacing: 0.04em;
        color: white;
        cursor: pointer;
        background: linear-gradient(135deg, #667eea 0%, #f64f59 100%);
        background-size: 200% 200%;
        box-shadow: 0 6px 20px rgba(246,79,89,0.35);
        transition: transform 0.18s, box-shadow 0.18s, background-position 0.4s;
        margin-top: 8px;
        animation: slideUp 0.5s ease 0.45s both;
    }

    .btn-submit:hover {
        transform: translateY(-2px) scale(1.01);
        box-shadow: 0 10px 28px rgba(102,30,130,0.3);
        background-position: right center;
    }

    .btn-submit:active {
        transform: scale(0.98);
        box-shadow: 0 3px 10px rgba(102,30,130,0.2);
    }

    /* Footer note */
    .footer-note {
        text-align: center;
        margin-top: 20px;
        font-size: 0.8rem;
        font-weight: 600;
        color: rgba(255,255,255,0.75);
        text-shadow: 0 1px 4px rgba(0,0,0,0.12);
        animation: slideUp 0.5s ease 0.5s both;
    }

</style>
</head>

<body>

<!-- Floating bubbles -->
<div class="bubble" style="width:90px;height:90px;background:#ffe259;left:8%;animation-duration:9s;animation-delay:0s;"></div>
<div class="bubble" style="width:55px;height:55px;background:#f64f59;left:25%;animation-duration:13s;animation-delay:2s;"></div>
<div class="bubble" style="width:70px;height:70px;background:#667eea;left:60%;animation-duration:10s;animation-delay:4s;"></div>
<div class="bubble" style="width:40px;height:40px;background:#43e97b;left:80%;animation-duration:7s;animation-delay:1s;"></div>
<div class="bubble" style="width:100px;height:100px;background:#f093fb;left:45%;animation-duration:15s;animation-delay:6s;"></div>

<p class="page-title">🎓 Welcome to <span>EduPortal</span></p>

<div class="container">
    <h1>Student Registration</h1>

    <form action="save" method="post">

        <div class="field-group field-name">
            <label class="label-name" for="name">👤 Full Name</label>
            <div class="input-wrap">
                <input type="text" id="name" name="name" placeholder="Enter your full name"/>
            </div>
        </div>

        <div class="field-group field-email">
            <label class="label-email" for="email">✉️ Email Address</label>
            <div class="input-wrap">
                <input type="text" id="email" name="email" placeholder="you@example.com"/>
            </div>
        </div>

        <div class="field-group field-pass">
            <label class="label-pass" for="password">🔒 Password</label>
            <div class="input-wrap">
                <input type="password" id="password" name="password" placeholder="Create a strong password"/>
            </div>
        </div>

        <input class="btn-submit" type="submit" value="🚀 Save Student"/>

    </form>
</div>

<p class="footer-note">Already registered? <a href="#" style="color:#ffe259;text-decoration:none;font-weight:800;">Sign in here →</a></p>

</body>
</html>