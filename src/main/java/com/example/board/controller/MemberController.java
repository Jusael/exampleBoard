package com.example.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.board.model.dto.MemberDto;
import com.example.board.service.MemberService;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;

	//컨트롤러에 서비스 생성자 주입
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

    @RequestMapping(value = "signup")
    public String signupForm() {
        return "member/memberSignup";
    }

	@RequestMapping("/login")
	public String signUp(@ModelAttribute("member") MemberDto memberDto) {

		memberService.singUp(memberDto);

		return "member/memberLogin";
	}

	@GetMapping
	public String login(MemberDto memberDto, Model model)
	{
		return "member/memberLogin";
	}

	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("id") String id) {
		memberService.delete(id);
		return  "redirect:/member/memberList";
	}

	@RequestMapping(value = "/loginCheck", method=RequestMethod.POST)
	public String loginCheck(MemberDto RequestMemberDto
							, Model model
							, HttpSession session) {
		String id = RequestMemberDto.getId();
		String pw = RequestMemberDto.getPw();

		MemberDto memberDto = memberService.login(id, pw);

		if(memberDto != null)
		{
			session.setAttribute("id", id);
			session.setAttribute("name", memberDto.getName());

			System.out.println("name : " + memberDto.getName());

			return "redirect:/board/list";
		}
		else {
			System.out.println("redirect:/member/login");

			return "redirect:/member/login";
		}
	}

	@RequestMapping(value = "/memberDetail", method=RequestMethod.GET)
	public String getMember(@RequestParam("id") String id, Model model) {

		model.addAttribute("member", memberService.getMemBer(id));

		return  "member/memberDetail";
	}

	@RequestMapping(value = "/memberList", method=RequestMethod.GET)
	public String getMembers(Model model) {

		model.addAttribute("members",memberService.getAllMember());

		return "member/memberList";
	}

}
