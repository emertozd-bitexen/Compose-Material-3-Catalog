/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("COMPOSABLE_FUNCTION_REFERENCE")

package com.emertozd.compose.catalog.library.model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
//import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldCustomConfigSample
//import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldSample
import com.emertozd.compose.catalog.library.util.AdaptiveNavigationSuiteSampleSourceUrl
import com.emertozd.compose.catalog.library.util.SampleSourceUrl
import com.emertozd.compose.catalog.samples.AlertDialogSample
import com.emertozd.compose.catalog.samples.AlertDialogWithIconSample
import com.emertozd.compose.catalog.samples.AnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.AssistChipSample
import com.emertozd.compose.catalog.samples.BasicAlertDialogSample
import com.emertozd.compose.catalog.samples.BottomAppBarWithFAB
import com.emertozd.compose.catalog.samples.BottomSheetScaffoldNestedScrollSample
import com.emertozd.compose.catalog.samples.ButtonSample
import com.emertozd.compose.catalog.samples.ButtonWithIconSample
import com.emertozd.compose.catalog.samples.CardSample
import com.emertozd.compose.catalog.samples.CarouselSample
import com.emertozd.compose.catalog.samples.CheckboxSample
import com.emertozd.compose.catalog.samples.CheckboxWithTextSample
import com.emertozd.compose.catalog.samples.ChipGroupReflowSample
import com.emertozd.compose.catalog.samples.ChipGroupSingleLineSample
import com.emertozd.compose.catalog.samples.CircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.ClickableCardSample
import com.emertozd.compose.catalog.samples.ClickableElevatedCardSample
import com.emertozd.compose.catalog.samples.ClickableOutlinedCardSample
import com.emertozd.compose.catalog.samples.DateInputSample
import com.emertozd.compose.catalog.samples.DatePickerDialogSample
import com.emertozd.compose.catalog.samples.DatePickerSample
import com.emertozd.compose.catalog.samples.DatePickerWithDateSelectableDatesSample
import com.emertozd.compose.catalog.samples.DateRangePickerSample
import com.emertozd.compose.catalog.samples.DismissibleNavigationDrawerSample
import com.emertozd.compose.catalog.samples.DockedSearchBarSample
import com.emertozd.compose.catalog.samples.EditableExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ElevatedAssistChipSample
import com.emertozd.compose.catalog.samples.ElevatedButtonSample
import com.emertozd.compose.catalog.samples.ElevatedCardSample
import com.emertozd.compose.catalog.samples.ElevatedFilterChipSample
import com.emertozd.compose.catalog.samples.ElevatedSuggestionChipSample
import com.emertozd.compose.catalog.samples.EnterAlwaysTopAppBar
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedLargeTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedMediumTopAppBar
import com.emertozd.compose.catalog.samples.ExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.FancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.FancyIndicatorTabs
import com.emertozd.compose.catalog.samples.FancyTabs
import com.emertozd.compose.catalog.samples.FilledIconButtonSample
import com.emertozd.compose.catalog.samples.FilledIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalIconButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilterChipSample
import com.emertozd.compose.catalog.samples.FilterChipWithLeadingIconSample
import com.emertozd.compose.catalog.samples.FloatingActionButtonSample
import com.emertozd.compose.catalog.samples.IconButtonSample
import com.emertozd.compose.catalog.samples.IconToggleButtonSample
import com.emertozd.compose.catalog.samples.IndeterminateCircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateLinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.InputChipSample
import com.emertozd.compose.catalog.samples.InputChipWithAvatarSample
import com.emertozd.compose.catalog.samples.LargeFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LeadingIconTabs
import com.emertozd.compose.catalog.samples.LinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.MenuSample
import com.emertozd.compose.catalog.samples.MenuWithScrollStateSample
import com.emertozd.compose.catalog.samples.ModalBottomSheetSample
import com.emertozd.compose.catalog.samples.ModalNavigationDrawerSample
import com.emertozd.compose.catalog.samples.NavigationBarItemWithBadge
import com.emertozd.compose.catalog.samples.NavigationBarSample
import com.emertozd.compose.catalog.samples.NavigationBarWithOnlySelectedLabelsSample
import com.emertozd.compose.catalog.samples.NavigationRailBottomAlignSample
import com.emertozd.compose.catalog.samples.NavigationRailSample
import com.emertozd.compose.catalog.samples.NavigationRailWithOnlySelectedLabelsSample
import com.emertozd.compose.catalog.samples.OneLineListItem
import com.emertozd.compose.catalog.samples.OutlinedButtonSample
import com.emertozd.compose.catalog.samples.OutlinedCardSample
import com.emertozd.compose.catalog.samples.OutlinedIconButtonSample
import com.emertozd.compose.catalog.samples.OutlinedIconToggleButtonSample
import com.emertozd.compose.catalog.samples.OutlinedTextFieldSample
import com.emertozd.compose.catalog.samples.PasswordTextField
import com.emertozd.compose.catalog.samples.PermanentNavigationDrawerSample
import com.emertozd.compose.catalog.samples.PinnedTopAppBar
import com.emertozd.compose.catalog.samples.PlainTooltipSample
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaret
import com.emertozd.compose.catalog.samples.PlainTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.PrimaryIconTabs
import com.emertozd.compose.catalog.samples.PrimaryTextTabs
import com.emertozd.compose.catalog.samples.PullToRefreshSample
import com.emertozd.compose.catalog.samples.PullToRefreshSampleCustomState
import com.emertozd.compose.catalog.samples.PullToRefreshScalingSample
import com.emertozd.compose.catalog.samples.RadioButtonSample
import com.emertozd.compose.catalog.samples.RadioGroupSample
import com.emertozd.compose.catalog.samples.RangeSliderSample
import com.emertozd.compose.catalog.samples.RangeSliderWithCustomComponents
import com.emertozd.compose.catalog.samples.RichTooltipSample
import com.emertozd.compose.catalog.samples.RichTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.ScaffoldWithCoroutinesSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithCustomSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithIndefiniteSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithMultilineSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithSimpleSnackbar
import com.emertozd.compose.catalog.samples.ScrollingFancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.ScrollingPrimaryTextTabs
import com.emertozd.compose.catalog.samples.ScrollingSecondaryTextTabs
import com.emertozd.compose.catalog.samples.SearchBarSample
import com.emertozd.compose.catalog.samples.SecondaryIconTabs
import com.emertozd.compose.catalog.samples.SecondaryTextTabs
import com.emertozd.compose.catalog.samples.SegmentedButtonMultiSelectSample
import com.emertozd.compose.catalog.samples.SegmentedButtonSingleSelectSample
import com.emertozd.compose.catalog.samples.SimpleBottomAppBar
import com.emertozd.compose.catalog.samples.SimpleBottomSheetScaffoldSample
import com.emertozd.compose.catalog.samples.SimpleCenterAlignedTopAppBar
import com.emertozd.compose.catalog.samples.SimpleOutlinedTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleTopAppBar
import com.emertozd.compose.catalog.samples.SliderSample
import com.emertozd.compose.catalog.samples.SliderWithCustomThumbSample
import com.emertozd.compose.catalog.samples.SliderWithCustomTrackAndThumb
import com.emertozd.compose.catalog.samples.SmallFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.StepRangeSliderSample
import com.emertozd.compose.catalog.samples.StepsSliderSample
import com.emertozd.compose.catalog.samples.SuggestionChipSample
import com.emertozd.compose.catalog.samples.SwitchSample
import com.emertozd.compose.catalog.samples.SwitchWithThumbIconSample
import com.emertozd.compose.catalog.samples.TextAndIconTabs
import com.emertozd.compose.catalog.samples.TextArea
import com.emertozd.compose.catalog.samples.TextButtonSample
import com.emertozd.compose.catalog.samples.TextFieldSample
import com.emertozd.compose.catalog.samples.TextFieldWithErrorState
import com.emertozd.compose.catalog.samples.TextFieldWithHideKeyboardOnImeAction
import com.emertozd.compose.catalog.samples.TextFieldWithIcons
import com.emertozd.compose.catalog.samples.TextFieldWithPlaceholder
import com.emertozd.compose.catalog.samples.TextFieldWithPrefixAndSuffix
import com.emertozd.compose.catalog.samples.TextFieldWithSupportingText
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithExtendedSupporting
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithOverlineAndSupporting
import com.emertozd.compose.catalog.samples.TimeInputSample
import com.emertozd.compose.catalog.samples.TimePickerSample
import com.emertozd.compose.catalog.samples.TimePickerSwitchableSample
import com.emertozd.compose.catalog.samples.TriStateCheckboxSample
import com.emertozd.compose.catalog.samples.TwoLineListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldCustomConfigSample
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldSample

data class Example(
    val name: String,
    val description: String,
    val sourceUrl: String,
    val content: @Composable () -> Unit
)

private const val BadgeExampleDescription = "Badge examples"
private const val BadgeExampleSourceUrl = "$SampleSourceUrl/BadgeSamples.kt"
val BadgeExamples =
    listOf(
        Example(
            name = ::NavigationBarItemWithBadge.name,
            description = BadgeExampleDescription,
            sourceUrl = BadgeExampleSourceUrl
        ) { NavigationBarItemWithBadge() }
    )

private const val BottomSheetExampleDescription = "Bottom Sheet examples"
private const val BottomSheetExampleSourceUrl = "$SampleSourceUrl/BottomSheetSamples.kt"
val BottomSheetExamples =
    listOf(
        Example(
            name = ::ModalBottomSheetSample.name,
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl
        ) { ModalBottomSheetSample() },
        Example(
            name = ::SimpleBottomSheetScaffoldSample.name,
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl
        ) { SimpleBottomSheetScaffoldSample() },
        Example(
            name = ::BottomSheetScaffoldNestedScrollSample.name,
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl
        ) { BottomSheetScaffoldNestedScrollSample() }
    )

private const val ButtonsExampleDescription = "Button examples"
private const val ButtonsExampleSourceUrl = "$SampleSourceUrl/ButtonSamples.kt"
val ButtonsExamples =
    listOf(
        Example(
            name = ::ButtonSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { ButtonSample() },
        Example(
            name = ::ElevatedButtonSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { ElevatedButtonSample() },
        Example(
            name = ::FilledTonalButtonSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { FilledTonalButtonSample() },
        Example(
            name = ::OutlinedButtonSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { OutlinedButtonSample() },
        Example(
            name = ::TextButtonSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { TextButtonSample() },
        Example(
            name = ::ButtonWithIconSample.name,
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
        ) { ButtonWithIconSample() }
    )

private const val CardsExampleDescription = "Cards examples"
private const val CardsExampleSourceUrl = "$SampleSourceUrl/CardSamples.kt"
val CardExamples = listOf(
    Example(
        name = ::CardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        CardSample()
    },
    Example(
        name = ::ClickableCardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        ClickableCardSample()
    },
    Example(
        name = ::ElevatedCardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        ElevatedCardSample()
    },
    Example(
        name = ::ClickableElevatedCardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        ClickableElevatedCardSample()
    },
    Example(
        name = ::OutlinedCardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        OutlinedCardSample()
    },
    Example(
        name = ::ClickableOutlinedCardSample.name,
        description = CardsExampleDescription,
        sourceUrl = CardsExampleSourceUrl
    ) {
        ClickableOutlinedCardSample()
    }
)

private const val CarouselExampleDescription = "Carousel examples"
private const val CarouselExampleSourceUrl = "$SampleSourceUrl/CarouselSamples.kt"
val CarouselExamples = listOf(
    Example(
        name = ::CarouselSample.name,
        description = CarouselExampleDescription,
        sourceUrl = CarouselExampleSourceUrl
    ) {
        CarouselSample()
    }
)

private const val CheckboxesExampleDescription = "Checkboxes examples"
private const val CheckboxesExampleSourceUrl = "$SampleSourceUrl/CheckboxSamples.kt"
val CheckboxesExamples = listOf(
    Example(
        name = ::CheckboxSample.name,
        description = CheckboxesExampleDescription,
        sourceUrl = CheckboxesExampleSourceUrl
    ) {
        CheckboxSample()
    },
    Example(
        name = ::CheckboxWithTextSample.name,
        description = CheckboxesExampleDescription,
        sourceUrl = CheckboxesExampleSourceUrl
    ) {
        CheckboxWithTextSample()
    },
    Example(
        name = ::TriStateCheckboxSample.name,
        description = CheckboxesExampleDescription,
        sourceUrl = CheckboxesExampleSourceUrl
    ) {
        TriStateCheckboxSample()
    }
)

private const val ChipsExampleDescription = "Chips examples"
private const val ChipsExampleSourceUrl = "$SampleSourceUrl/ChipSamples.kt"
val ChipsExamples = listOf(
    Example(
        name = ::AssistChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        AssistChipSample()
    },
    Example(
        name = ::ElevatedAssistChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        ElevatedAssistChipSample()
    },
    Example(
        name = ::FilterChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        FilterChipSample()
    },
    Example(
        name = ::ElevatedFilterChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        ElevatedFilterChipSample()
    },
    Example(
        name = ::FilterChipWithLeadingIconSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        FilterChipWithLeadingIconSample()
    },
    Example(
        name = ::InputChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        InputChipSample()
    },
    Example(
        name = ::InputChipWithAvatarSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        InputChipWithAvatarSample()
    },
    Example(
        name = ::SuggestionChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        SuggestionChipSample()
    },
    Example(
        name = ::ElevatedSuggestionChipSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        ElevatedSuggestionChipSample()
    },
    Example(
        name = ::ChipGroupSingleLineSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        ChipGroupSingleLineSample()
    },
    Example(
        name = ::ChipGroupReflowSample.name,
        description = ChipsExampleDescription,
        sourceUrl = ChipsExampleSourceUrl
    ) {
        ChipGroupReflowSample()
    }
)

private const val DatePickerExampleDescription = "Date picker examples"
private const val DatePickerExampleSourceUrl = "$SampleSourceUrl/DatePickerSamples.kt"
val DatePickerExamples = listOf(
    Example(
        name = ::DatePickerSample.name,
        description = DatePickerExampleDescription,
        sourceUrl = DatePickerExampleSourceUrl
    ) {
        DatePickerSample()
    },
    Example(
        name = ::DatePickerDialogSample.name,
        description = DatePickerExampleDescription,
        sourceUrl = DatePickerExampleSourceUrl
    ) {
        DatePickerDialogSample()
    },
    Example(
        name = ::DatePickerWithDateSelectableDatesSample.name,
        description = DatePickerExampleDescription,
        sourceUrl = DatePickerExampleSourceUrl
    ) {
        DatePickerWithDateSelectableDatesSample()
    },
    Example(
        name = ::DateInputSample.name,
        description = DatePickerExampleDescription,
        sourceUrl = DatePickerExampleSourceUrl
    ) {
        DateInputSample()
    },
    Example(
        name = ::DateRangePickerSample.name,
        description = DatePickerExampleDescription,
        sourceUrl = DatePickerExampleSourceUrl
    ) {
        DateRangePickerSample()
    },
)

private const val DialogExampleDescription = "Dialog examples"
private const val DialogExampleSourceUrl = "$SampleSourceUrl/AlertDialogSamples.kt"
val DialogExamples =
    listOf(
        Example(
            name = ::AlertDialogSample.name,
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
        ) { AlertDialogSample() },
        Example(
            name = ::AlertDialogWithIconSample.name,
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
        ) { AlertDialogWithIconSample() },
        Example(
            name = ::BasicAlertDialogSample.name,
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
        ) { BasicAlertDialogSample() },
    )

private const val BottomAppBarsExampleDescription = "Bottom app bar examples"
private const val BottomAppBarsExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val BottomAppBarsExamples = listOf(
    Example(
        name = ::SimpleBottomAppBar.name,
        description = BottomAppBarsExampleDescription,
        sourceUrl = BottomAppBarsExampleSourceUrl,
    ) { SimpleBottomAppBar() },
    Example(
        name = ::BottomAppBarWithFAB.name,
        description = BottomAppBarsExampleDescription,
        sourceUrl = BottomAppBarsExampleSourceUrl,
    ) { BottomAppBarWithFAB() },
    Example(
        name = ::ExitAlwaysBottomAppBar.name,
        description = BottomAppBarsExampleDescription,
        sourceUrl = BottomAppBarsExampleSourceUrl,
    ) { ExitAlwaysBottomAppBar() }
)

private const val TopAppBarExampleDescription = "Top app bar examples"
private const val TopAppBarExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val TopAppBarExamples =
    listOf(
        Example(
            name = ::SimpleTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { SimpleTopAppBar() },
        Example(
            name = ::SimpleCenterAlignedTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { SimpleCenterAlignedTopAppBar() },
        Example(
            name = ::PinnedTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { PinnedTopAppBar() },
        Example(
            name = ::EnterAlwaysTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { EnterAlwaysTopAppBar() },
        Example(
            name = ::ExitUntilCollapsedMediumTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { ExitUntilCollapsedMediumTopAppBar() },
        Example(
            name = ::ExitUntilCollapsedLargeTopAppBar.name,
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
        ) { ExitUntilCollapsedLargeTopAppBar() },
    )

private const val ExtendedFABExampleDescription = "Extended FAB examples"
private const val ExtendedFABExampleSourceUrl = "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val ExtendedFABExamples =
    listOf(
        Example(
            name = ::ExtendedFloatingActionButtonSample.name,
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
        ) { ExtendedFloatingActionButtonSample() },
        Example(
            name = ::ExtendedFloatingActionButtonTextSample.name,
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
        ) { ExtendedFloatingActionButtonTextSample() },
        Example(
            name = ::AnimatedExtendedFloatingActionButtonSample.name,
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
        ) { AnimatedExtendedFloatingActionButtonSample() },
    )

private const val FloatingActionButtonsExampleDescription = "Floating action button examples"
private const val FloatingActionButtonsExampleSourceUrl =
    "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val FloatingActionButtonsExamples =
    listOf(
        Example(
            name = ::FloatingActionButtonSample.name,
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
        ) { FloatingActionButtonSample() },
        Example(
            name = ::LargeFloatingActionButtonSample.name,
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
        ) { LargeFloatingActionButtonSample() },
        Example(
            name = ::SmallFloatingActionButtonSample.name,
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
        ) { SmallFloatingActionButtonSample() }
    )

private const val ListsExampleDescription = "List examples"
private const val ListsExampleSourceUrl = "$SampleSourceUrl/ListSamples.kt"
val ListsExamples = listOf(
    Example(
        name = ::OneLineListItem.name,
        description = ListsExampleDescription,
        sourceUrl = ListsExampleSourceUrl
    ) {
        OneLineListItem()
    },
    Example(
        name = ::TwoLineListItem.name,
        description = ListsExampleDescription,
        sourceUrl = ListsExampleSourceUrl
    ) {
        TwoLineListItem()
    },
    Example(
        name = ::ThreeLineListItemWithOverlineAndSupporting.name,
        description = ListsExampleDescription,
        sourceUrl = ListsExampleSourceUrl
    ) {
        ThreeLineListItemWithOverlineAndSupporting()
    },
    Example(
        name = ::ThreeLineListItemWithExtendedSupporting.name,
        description = ListsExampleDescription,
        sourceUrl = ListsExampleSourceUrl
    ) {
        ThreeLineListItemWithExtendedSupporting()
    },
)

private const val IconButtonExampleDescription = "Icon button examples"
private const val IconButtonExampleSourceUrl = "$SampleSourceUrl/IconButtonSamples.kt"
val IconButtonExamples =
    listOf(
        Example(
            name = ::IconButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { IconButtonSample() },
        Example(
            name = ::IconToggleButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { IconToggleButtonSample() },
        Example(
            name = ::FilledIconButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { FilledIconButtonSample() },
        Example(
            name = ::FilledIconToggleButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { FilledIconToggleButtonSample() },
        Example(
            name = ::FilledTonalIconButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { FilledTonalIconButtonSample() },
        Example(
            name = ::FilledTonalIconToggleButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { FilledTonalIconToggleButtonSample() },
        Example(
            name = ::OutlinedIconButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { OutlinedIconButtonSample() },
        Example(
            name = ::OutlinedIconToggleButtonSample.name,
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
        ) { OutlinedIconToggleButtonSample() }
    )

private const val MenusExampleDescription = "Menus examples"
private const val MenusExampleSourceUrl = "$SampleSourceUrl/MenuSamples.kt"
val MenusExamples = listOf(
    Example(
        name = ::MenuSample.name,
        description = MenusExampleDescription,
        sourceUrl = MenusExampleSourceUrl
    ) {
        MenuSample()
    },
    Example(
        name = ::MenuWithScrollStateSample.name,
        description = MenusExampleDescription,
        sourceUrl = MenusExampleSourceUrl
    ) {
        MenuWithScrollStateSample()
    },
    Example(
        name = ::ExposedDropdownMenuSample.name,
        description = MenusExampleDescription,
        sourceUrl = MenusExampleSourceUrl
    ) {
        ExposedDropdownMenuSample()
    },
    Example(
        name = ::EditableExposedDropdownMenuSample.name,
        description = MenusExampleDescription,
        sourceUrl = MenusExampleSourceUrl
    ) {
        EditableExposedDropdownMenuSample()
    },
)

private const val NavigationBarExampleDescription = "Navigation bar examples"
private const val NavigationBarExampleSourceUrl = "$SampleSourceUrl/NavigationBarSamples.kt"
val NavigationBarExamples =
    listOf(
        Example(
            name = ::NavigationBarSample.name,
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
        ) { NavigationBarSample() },
        Example(
            name = ::NavigationBarWithOnlySelectedLabelsSample.name,
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
        ) { NavigationBarWithOnlySelectedLabelsSample() },
    )

private const val NavigationRailExampleDescription = "Navigation rail examples"
private const val NavigationRailExampleSourceUrl = "$SampleSourceUrl/NavigationRailSamples.kt"
val NavigationRailExamples =
    listOf(
        Example(
            name = ::NavigationRailSample.name,
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
        ) { NavigationRailSample() },
        Example(
            name = ::NavigationRailWithOnlySelectedLabelsSample.name,
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
        ) { NavigationRailWithOnlySelectedLabelsSample() },
        Example(
            name = ::NavigationRailBottomAlignSample.name,
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
        ) { NavigationRailBottomAlignSample() },
    )

private const val NavigationDrawerExampleDescription = "Navigation drawer examples"
private const val NavigationDrawerExampleSourceUrl = "$SampleSourceUrl/DrawerSamples.kt"
val NavigationDrawerExamples = listOf(
    Example(
        name = ::ModalNavigationDrawerSample.name,
        description = NavigationDrawerExampleDescription,
        sourceUrl = NavigationDrawerExampleSourceUrl
    ) {
        ModalNavigationDrawerSample()
    },
    Example(
        name = ::PermanentNavigationDrawerSample.name,
        description = NavigationDrawerExampleDescription,
        sourceUrl = NavigationDrawerExampleSourceUrl
    ) {
        PermanentNavigationDrawerSample()
    },
    Example(
        name = ::DismissibleNavigationDrawerSample.name,
        description = NavigationDrawerExampleDescription,
        sourceUrl = NavigationDrawerExampleSourceUrl
    ) {
        DismissibleNavigationDrawerSample()
    }
)

private const val NavigationSuiteScaffoldExampleDescription = "Navigation suite scaffold examples"
private const val NavigationSuiteScaffoldExampleSourceUrl =
    "$AdaptiveNavigationSuiteSampleSourceUrl/NavigationSuiteScaffoldSamples.kt"
val NavigationSuiteScaffoldExamples =
    listOf(
        Example(
            name = ::NavigationSuiteScaffoldSample.name,
            description = NavigationSuiteScaffoldExampleDescription,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
        ) { NavigationSuiteScaffoldSample() },
        Example(
            name = ::NavigationSuiteScaffoldCustomConfigSample.name,
            description = NavigationSuiteScaffoldExampleDescription,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
        ) { NavigationSuiteScaffoldCustomConfigSample() },
    )

private const val ProgressIndicatorsExampleDescription = "Progress indicators examples"
private const val ProgressIndicatorsExampleSourceUrl = "$SampleSourceUrl/" +
    "ProgressIndicatorSamples.kt"
val ProgressIndicatorsExamples = listOf(
    Example(
        name = ::LinearProgressIndicatorSample.name,
        description = ProgressIndicatorsExampleDescription,
        sourceUrl = ProgressIndicatorsExampleSourceUrl
    ) {
        LinearProgressIndicatorSample()
    },
    Example(
        name = ::IndeterminateLinearProgressIndicatorSample.name,
        description = ProgressIndicatorsExampleDescription,
        sourceUrl = ProgressIndicatorsExampleSourceUrl
    ) {
        IndeterminateLinearProgressIndicatorSample()
    },
    Example(
        name = ::CircularProgressIndicatorSample.name,
        description = ProgressIndicatorsExampleDescription,
        sourceUrl = ProgressIndicatorsExampleSourceUrl
    ) {
        CircularProgressIndicatorSample()
    },
    Example(
        name = ::IndeterminateCircularProgressIndicatorSample.name,
        description = ProgressIndicatorsExampleDescription,
        sourceUrl = ProgressIndicatorsExampleSourceUrl
    ) {
        IndeterminateCircularProgressIndicatorSample()
    }
)

private const val PullToRefreshExampleDescription = "Pull-to-refresh examples"
private const val PullToRefreshExampleSourceUrl = "$SampleSourceUrl/PullToRefreshSamples.kt"
val PullToRefreshExamples = listOf(
    Example(
        name = ::PullToRefreshSample.name,
        description = PullToRefreshExampleDescription,
        sourceUrl = PullToRefreshExampleSourceUrl
    ) {
        PullToRefreshSample()
    },
    Example(
        name = ::PullToRefreshScalingSample.name,
        description = PullToRefreshExampleDescription,
        sourceUrl = PullToRefreshExampleSourceUrl
    ) {
        PullToRefreshScalingSample()
    },
    Example(
        name = ::PullToRefreshSampleCustomState.name,
        description = PullToRefreshExampleDescription,
        sourceUrl = PullToRefreshExampleSourceUrl
    ) {
        PullToRefreshSampleCustomState()
    }
)

private const val RadioButtonsExampleDescription = "Radio buttons examples"
private const val RadioButtonsExampleSourceUrl = "$SampleSourceUrl/RadioButtonSamples.kt"
val RadioButtonsExamples = listOf(
    Example(
        name = ::RadioButtonSample.name,
        description = RadioButtonsExampleDescription,
        sourceUrl = RadioButtonsExampleSourceUrl
    ) {
        RadioButtonSample()
    },
    Example(
        name = ::RadioGroupSample.name,
        description = RadioButtonsExampleDescription,
        sourceUrl = RadioButtonsExampleSourceUrl
    ) {
        RadioGroupSample()
    },
)

private const val SearchBarExampleDescription = "Search bar examples"
private const val SearchBarExampleSourceUrl = "$SampleSourceUrl/SearchBarSamples.kt"
val SearchBarExamples = listOf(
    Example(
        name = ::SearchBarSample.name,
        description = SearchBarExampleDescription,
        sourceUrl = SearchBarExampleSourceUrl
    ) {
        SearchBarSample()
    },
    Example(
        name = ::DockedSearchBarSample.name,
        description = SearchBarExampleDescription,
        sourceUrl = SearchBarExampleSourceUrl
    ) {
        DockedSearchBarSample()
    }
)

private const val SegmentedButtonExampleDescription = "Segmented Button examples"
private const val SegmentedButtonSourceUrl = "$SampleSourceUrl/SegmentedButtonSamples.kt"
val SegmentedButtonExamples = listOf(
    Example(
        name = ::SegmentedButtonSingleSelectSample.name,
        description = SegmentedButtonExampleDescription,
        sourceUrl = SegmentedButtonSourceUrl
    ) {
        SegmentedButtonSingleSelectSample()
    },
    Example(
        name = ::SegmentedButtonMultiSelectSample.name,
        description = SegmentedButtonExampleDescription,
        sourceUrl = SegmentedButtonSourceUrl
    ) {
        SegmentedButtonMultiSelectSample()
    },
)

private const val SlidersExampleDescription = "Sliders examples"
private const val SlidersExampleSourceUrl = "$SampleSourceUrl/SliderSamples.kt"
val SlidersExamples = listOf(
    Example(
        name = ::SliderSample.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        SliderSample()
    },
    Example(
        name = ::StepsSliderSample.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        StepsSliderSample()
    },
    Example(
        name = ::SliderWithCustomThumbSample.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        SliderWithCustomThumbSample()
    },
    Example(
        name = ::SliderWithCustomTrackAndThumb.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        SliderWithCustomTrackAndThumb()
    },
    Example(
        name = ::RangeSliderSample.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        RangeSliderSample()
    },
    Example(
        name = ::StepRangeSliderSample.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        StepRangeSliderSample()
    },
    Example(
        name = ::RangeSliderWithCustomComponents.name,
        description = SlidersExampleDescription,
        sourceUrl = SlidersExampleSourceUrl
    ) {
        RangeSliderWithCustomComponents()
    }
)

private const val SnackbarsExampleDescription = "Snackbars examples"
private const val SnackbarsExampleSourceUrl = "$SampleSourceUrl/ScaffoldSamples.kt"
val SnackbarsExamples = listOf(
    Example(
        name = ::ScaffoldWithSimpleSnackbar.name,
        description = SnackbarsExampleDescription,
        sourceUrl = SnackbarsExampleSourceUrl
    ) {
        ScaffoldWithSimpleSnackbar()
    },
    Example(
        name = ::ScaffoldWithIndefiniteSnackbar.name,
        description = SnackbarsExampleDescription,
        sourceUrl = SnackbarsExampleSourceUrl
    ) {
        ScaffoldWithIndefiniteSnackbar()
    },
    Example(
        name = ::ScaffoldWithCustomSnackbar.name,
        description = SnackbarsExampleDescription,
        sourceUrl = SnackbarsExampleSourceUrl
    ) {
        ScaffoldWithCustomSnackbar()
    },
    Example(
        name = ::ScaffoldWithCoroutinesSnackbar.name,
        description = SnackbarsExampleDescription,
        sourceUrl = SnackbarsExampleSourceUrl
    ) {
        ScaffoldWithCoroutinesSnackbar()
    },
    Example(
        name = ::ScaffoldWithMultilineSnackbar.name,
        description = SnackbarsExampleDescription,
        sourceUrl = SnackbarsExampleSourceUrl
    ) {
        ScaffoldWithMultilineSnackbar()
    }
)

private const val SwitchExampleDescription = "Switch examples"
private const val SwitchExampleSourceUrl = "$SampleSourceUrl/SwitchSamples.kt"
val SwitchExamples = listOf(
    Example(
        name = ::SwitchSample.name,
        description = SwitchExampleDescription,
        sourceUrl = SwitchExampleSourceUrl
    ) {
        SwitchSample()
    },

    Example(
        name = ::SwitchWithThumbIconSample.name,
        description = SwitchExampleDescription,
        sourceUrl = SwitchExampleSourceUrl
    ) {
        SwitchWithThumbIconSample()
    },
)

private const val TabsExampleDescription = "Tabs examples"
private const val TabsExampleSourceUrl = "$SampleSourceUrl/TabSamples.kt"
val TabsExamples = listOf(
    Example(
        name = ::PrimaryTextTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        PrimaryTextTabs()
    },
    Example(
        name = ::PrimaryIconTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        PrimaryIconTabs()
    },
    Example(
        name = ::SecondaryTextTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        SecondaryTextTabs()
    },
    Example(
        name = ::SecondaryIconTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        SecondaryIconTabs()
    },
    Example(
        name = ::TextAndIconTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        TextAndIconTabs()
    },
    Example(
        name = ::LeadingIconTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        LeadingIconTabs()
    },
    Example(
        name = ::ScrollingPrimaryTextTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        ScrollingPrimaryTextTabs()
    },
    Example(
        name = ::ScrollingSecondaryTextTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        ScrollingSecondaryTextTabs()
    },
    Example(
        name = ::FancyTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        FancyTabs()
    },
    Example(
        name = ::FancyIndicatorTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        FancyIndicatorTabs()
    },
    Example(
        name = ::FancyIndicatorContainerTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        FancyIndicatorContainerTabs()
    },
    Example(
        name = ::ScrollingFancyIndicatorContainerTabs.name,
        description = TabsExampleDescription,
        sourceUrl = TabsExampleSourceUrl
    ) {
        ScrollingFancyIndicatorContainerTabs()
    }
)

private const val TimePickerDescription = "Time Picker examples"
private const val TimePickerSourceUrl = "$SampleSourceUrl/TimePicker.kt"
val TimePickerExamples = listOf(
    Example(
        name = ::TimePickerSample.name,
        description = TimePickerDescription,
        sourceUrl = TimePickerSourceUrl
    ) {
        TimePickerSample()
    },
    Example(
        name = ::TimeInputSample.name,
        description = TimePickerDescription,
        sourceUrl = TimePickerSourceUrl
    ) {
        TimeInputSample()
    },
    Example(
        name = ::TimePickerSwitchableSample.name,
        description = TimePickerDescription,
        sourceUrl = TimePickerSourceUrl
    ) {
        TimePickerSwitchableSample()
    },
)

private const val TextFieldsExampleDescription = "Text fields examples"
private const val TextFieldsExampleSourceUrl = "$SampleSourceUrl/TextFieldSamples.kt"
val TextFieldsExamples = listOf(
    Example(
        name = ::SimpleTextFieldSample.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        SimpleTextFieldSample()
    },
    Example(
        name = ::TextFieldSample.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldSample()
    },
    Example(
        name = ::SimpleOutlinedTextFieldSample.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        SimpleOutlinedTextFieldSample()
    },
    Example(
        name = ::OutlinedTextFieldSample.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        OutlinedTextFieldSample()
    },
    Example(
        name = ::TextFieldWithIcons.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithIcons()
    },
    Example(
        name = ::TextFieldWithPlaceholder.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithPlaceholder()
    },
    Example(
        name = ::TextFieldWithPrefixAndSuffix.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithPrefixAndSuffix()
    },
    Example(
        name = ::TextFieldWithErrorState.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithErrorState()
    },
    Example(
        name = ::TextFieldWithSupportingText.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithSupportingText()
    },
    Example(
        name = ::PasswordTextField.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        PasswordTextField()
    },
    Example(
        name = ::TextFieldWithHideKeyboardOnImeAction.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextFieldWithHideKeyboardOnImeAction()
    },
    Example(
        name = ::TextArea.name,
        description = TextFieldsExampleDescription,
        sourceUrl = TextFieldsExampleSourceUrl
    ) {
        TextArea()
    }
).map {
    // By default text field samples are minimal and don't have a `width` modifier to restrict the
    // width. As a result, they grow horizontally if enough text is typed. To prevent this behavior
    // in Catalog app the code below restricts the width of every text field sample
    it.copy(content = {
        Box(
            Modifier
                .wrapContentWidth()
                .width(280.dp)
        ) { it.content() }
    })
}

private const val TooltipsExampleDescription = "Tooltips examples"
private const val TooltipsExampleSourceUrl = "$SampleSourceUrl/TooltipSamples.kt"
val TooltipsExamples = listOf(
    Example(
        name = ::PlainTooltipSample.name,
        description = TooltipsExampleDescription,
        sourceUrl = TooltipsExampleSourceUrl
    ) {
        PlainTooltipSample()
    },
    Example(
        name = ::PlainTooltipWithManualInvocationSample.name,
        description = TooltipsExampleDescription,
        sourceUrl = TooltipsExampleSourceUrl
    ) {
        PlainTooltipWithManualInvocationSample()
    },
    Example(
        name = ::PlainTooltipWithCaret.name,
        description = TooltipsExampleDescription,
        sourceUrl = TooltipsExampleSourceUrl
    ) {
        PlainTooltipWithCaret()
    },
    Example(
        name = ::RichTooltipSample.name,
        description = TooltipsExampleDescription,
        sourceUrl = TooltipsExampleSourceUrl
    ) {
        RichTooltipSample()
    },
    Example(
        name = ::RichTooltipWithManualInvocationSample.name,
        description = TooltipsExampleDescription,
        sourceUrl = TooltipsExampleSourceUrl
    ) {
        RichTooltipWithManualInvocationSample()
    }
)
